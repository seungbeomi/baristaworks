package kr.co.baristaworks.fw.web.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingRequestInterceptor extends HandlerInterceptorAdapter {

  Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {

    String method = request.getMethod();
    String url = request.getRequestURI();
    Enumeration parms = request.getParameterNames();
    String name = "";
    StringBuffer sb = new StringBuffer();
    for (; parms.hasMoreElements();) {
      name = (String) parms.nextElement();
      if ("password".equals(name)) {
        sb.append(name + "=[PROTECTED] "); // password 비표시
      } else {
        String[] values = request.getParameterValues(name);
        for (String value : values) {
          sb.append(name + "=" + value + " ");
        }
      }
    }

    if (!url.contains("/resources/")) {
      if (sb.length() == 0) {
        logger.debug("{} : {}", method, url);
      } else {
        logger.debug("{} : {}, PARAMS=[ {}]", new Object[] { method, url, sb});
      }
    }

    return true;
  }

}

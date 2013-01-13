package kr.co.baristaworks.fw.log;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.LoggerFactory;

public class Logger {

  private static final Map loggers = new HashMap();

  private static boolean initialized;

  private final org.slf4j.Logger log;

  public static synchronized Logger getLogger(final Class clazz) {
    if (!initialized) {
      initialize();
    }
    Logger logger = (Logger) loggers.get(clazz);
    if (logger == null) {
      logger = new Logger(clazz);
      loggers.put(clazz, logger);
    }
    return logger;
  }

  public static synchronized void initialize() {
    initialized = true;
  }

  private Logger(final Class clazz) {
    log = LoggerFactory.getLogger(clazz);
  }
  
  public final void info(String msg) {
    log.info(msg);
  }
  
  public final void info(String format, Object arg) {
    log.info(format, arg);
  }
  
  public final void info(String format, Object arg1, Object arg2) {
    log.info(format, arg1, arg2);
  }
  
  public final void info(String format, Object[] argArray) {
    log.info(format, argArray);
  }
  
  public final void info(String msg, Throwable t) {
    log.info(msg, t);
  }
  
  public final void debug(String msg) {
    log.debug(msg);
  }
  
  public final void debug(String format, Object arg) {
    log.debug(format, arg);
  }
  
  public final void debug(String format, Object arg1, Object arg2) {
    log.debug(format, arg1, arg2);
  }
  
  public final void debug(String format, Object[] argArray) {
    log.debug(format, argArray);
  }
  
  public final void debug(String msg, Throwable t) {
    log.debug(msg, t);
  }
  
  public final void warn(String msg) {
    log.warn(msg);
  }
  
  public final void warn(String format, Object arg) {
    log.warn(format, arg);
  }
  
  public final void warn(String format, Object arg1, Object arg2) {
    log.warn(format, arg1, arg2);
  }
  
  public final void warn(String format, Object[] argArray) {
    log.warn(format, argArray);
  }
  
  public final void warn(String msg, Throwable t) {
    log.warn(msg, t);
  }
  
  public final void error(String msg) {
    log.error(msg);
  }
  
  public final void error(String format, Object arg) {
    log.error(format, arg);
  }
  
  public final void error(String format, Object arg1, Object arg2) {
    log.error(format, arg1, arg2);
  }
  
  public final void error(String format, Object[] argArray) {
    log.error(format, argArray);
  }
  
  public final void error(String msg, Throwable t) {
    log.error(msg, t);
  }

}

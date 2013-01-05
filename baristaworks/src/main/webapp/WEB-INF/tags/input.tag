<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="value" %>
<%@ attribute name="disabled" %>

<spring:bind path="${ path }">
  <c:if test="${ empty status.errorMessages }">
    <div class="control-group">
  </c:if>
  <c:if test="${ not empty status.errorMessages }">
    <div class="control-group error">
  </c:if>
    <form:label path="${ path }" cssClass="control-label" for="${ path }">${ label }</form:label>
    <div class="controls">
      <c:if test="${ empty disabled }">
        <input id="${ status.expression }" name="${ status.expression }" type="text" placeholder="${ label }" value="${ value }"/>
      </c:if>
      <c:if test="${ not empty disabled }">
        <input id="${ status.expression }" name="${ status.expression }" type="text" placeholder="${ label }" value="${ value }" disabled="disabled"/>
      </c:if>
      <c:forEach var="errorMessage" items="${ status.errorMessages }">
        <span class="help-inline">${ errorMessage }</span>
      </c:forEach>
    </div>
  </div> 
</spring:bind>
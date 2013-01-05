<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="items" type="java.util.List" %>
<%@ attribute name="begin" %>
<%@ attribute name="end" %>
<%@ attribute name="value" %>

<div class="control-group">
  <label class="control-label" for="${ path }">${ label }</label>
  <div class="controls">
    <%-- items를 사용하지 않는 경우 --%>
    <c:if test="${ empty items }">
      <form:select path="${ path }">
        <form:option value="0" label="-- ${ label } --" /> 
        <c:forEach var="i" begin="${ begin }" end="${ end }" step="1" >
          <c:choose>
            <c:when test="${ value eq i }">
              <option value="${ i }" selected="selected">${ i }</option>
            </c:when>
            <c:otherwise>
              <option value="${ i }">${ i }</option>
            </c:otherwise>
          </c:choose>
        </c:forEach>
      </form:select>
    </c:if>
    <%-- items를 사용하는 경우 --%>
    <c:if test="${ not empty items }">
      <form:select path="${ path }">
        <form:option value="" label="-- ${ label } --" />
        <form:options items="${ items }" itemLabel="codeNm" itemValue="code" />
      </form:select>
    </c:if>
  </div>
</div>
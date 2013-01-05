<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="label" required="true" %>
<%@ attribute name="link" required="true" %>
<%@ attribute name="icon" required="false" %>
<%@ attribute name="type" required="false" %>


<c:choose>
  <c:when test="${ type eq 'list' }"><a href="<c:url value='${ link }' />" class="btn btn-info"></c:when>
  <c:when test="${ type eq 'create' }"><a href="<c:url value='${ link }' />" class="btn btn-success"></c:when>
  <c:when test="${ type eq 'update' }"><a href="<c:url value='${ link }' />" class="btn btn-warning"></c:when>
  <c:when test="${ type eq 'delete' }"><a href="<c:url value='${ link }' />" class="btn btn-danger"></c:when>
  <c:otherwise>
    <a href="<c:url value='${ link }' />" class="btn">
  </c:otherwise>
</c:choose>
  <c:if test="${ type eq 'list' }"><i class="icon-align-justify icon-white"></i></c:if>
  <c:if test="${ type eq 'create' }"><i class="icon-plus-sign icon-white"></i></c:if>
  <c:if test="${ type eq 'update' }"><i class="icon-edit icon-white"></i></c:if>
  <c:if test="${ type eq 'delete' }"><i class="icon-remove-sign icon-white"></i></c:if>
  ${ label }
</a>
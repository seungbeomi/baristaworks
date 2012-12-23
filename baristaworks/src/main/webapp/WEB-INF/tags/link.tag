<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="label" required="true" %>
<%@ attribute name="link" required="true" %>

<a href="<c:url value='${ link }' />" class="btn">${ label }</a>
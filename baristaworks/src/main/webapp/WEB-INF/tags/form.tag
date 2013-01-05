<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="commandName" required="true" %>
<%@ attribute name="method" %> 

<form:form cssClass="form-horizontal" commandName="${ commandName }" method="${ method }">
  <legend>${ label }</legend>
	<jsp:doBody />
</form:form>
 
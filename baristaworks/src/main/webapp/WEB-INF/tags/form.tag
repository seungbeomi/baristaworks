<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ attribute name="label" required="true" %>

<form:form cssClass="form-horizontal">
  <legend>${ label }</legend>
	<jsp:doBody />
</form:form>
 
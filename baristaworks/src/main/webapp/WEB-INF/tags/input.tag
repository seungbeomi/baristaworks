<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>

<div class="control-group">
  <form:label path="${ path }" cssClass="control-label" for="${ path }">${ label }</form:label>
  <div class="controls">
    <form:input id="${ path }" path="${ path }" placeholder="${ label }" />
  </div>
</div>
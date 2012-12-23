<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>

<div class="control-group">
  <label class="control-label" for="${ path }">${ label }</label>
  <div class="controls">
    <form:textarea path="${ path }" placeholder="${ label }" />
  </div>
</div>
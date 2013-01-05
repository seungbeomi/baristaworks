<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="value" %>

<div class="control-group">
  <label class="control-label" for="${ path }">${ label }</label>
  <div class="controls">
    <textarea id="${ path }" name="${ path }" placeholder="${ label }">${ value }</textarea>
  </div>
</div>
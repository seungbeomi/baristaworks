<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>
<%@ attribute name="value" required="true" %>

<div class="control-group">
  <label class="control-label" for="${ path }">${ label }</label>
  <div class="controls">
    <input type="text" id="${ path }" value="${ value }" disabled="disabled">
  </div>
</div>
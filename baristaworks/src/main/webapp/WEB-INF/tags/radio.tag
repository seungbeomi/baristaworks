<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ attribute name="path" required="true" %>
<%@ attribute name="label" required="true" %>

<div class="control-group">
  <label class="control-label" for="${ path }">${ label }</label>
  <div class="controls">
    <label class="radio inline">
      <form:radiobutton path="${ path }" label="Y" value="Y"/>
    </label>
    <label class="radio inline">
      <form:radiobutton path="${ path }" label="N" value="N" />
    </label>
  </div>
</div>
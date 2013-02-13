<%@ include file="/WEB-INF/views/shared/taglibs.jsp"%>

<h1>Secure Page</h1>
<p>This is a protected page. You can get to me if you've been remembered, or if you've authenticated this session.</p>
<p>
  <sec:authorize access="hasRole('admin')">
    You are a admin! You can therefore see the <a href="<c:url value='/admin/extreme/index' />">extremely secure page</a>.<br />
    <br />
  </sec:authorize>
</p>
<h3>Properties obtained using &lt;sec:authentication /&gt; tag</h3>
<table border="1">
  <tr>
    <th>Tag</th>
    <th>Value</th>
  </tr>
  <tr>
    <td>&lt;sec:authentication property='name' /&gt;</td>
    <td><sec:authentication property="name" /></td>
  </tr>
  <sec:authorize access="isAuthenticated()">
    <tr>
      <td>&lt;sec:authentication property='principal.username' /&gt;</td>
      <td><sec:authentication property="principal.username" /></td>
    </tr>
    <tr>
      <td>&lt;sec:authentication property='principal.enabled' /&gt;</td>
      <td><sec:authentication property="principal.enabled" /></td>
    </tr>
    <tr>
      <td>&lt;sec:authentication property='principal.accountNonLocked' /&gt;</td>
      <td><sec:authentication property="principal.accountNonLocked" /></td>
    </tr>
  </sec:authorize>
</table>

<h3>Your principal object is...</h3>
<p><%= request.getUserPrincipal() %></p>

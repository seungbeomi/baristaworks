<%@ include file="/WEB-INF/views/shared/taglibs.jsp"%>

<a class="brand" href="<c:url value='/' />"><spring:message code="application_name" /></a>
<div class="nav-collapse collapse">
  
	<%-- 
  <ul class="nav">

		<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code='label_java' /><b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="<c:url value='/java/spring' />" data-active="spring"><spring:message code='label_java_spring' /></a></li>
			</ul>
		</li>

		<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code='label_orm' /><b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="<c:url value='/orm/hibernate' />" data-active="hibernate"><spring:message code='label_orm_hibernate' /></a></li>
				<li><a href="<c:url value='/orm/mybatis' />" data-active="mybatis"><spring:message code='label_orm_mybatis' /></a></li>
				<li><a href="<c:url value='/orm/jpa' />" data-active="jpa"><spring:message code='label_orm_jpa' /></a></li>
			</ul>
		</li>

		<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code='label_bootstrap' /><b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="<c:url value='/bootstrap/scaffolding' />" data-active="scaffolding"><spring:message code='label_bootstrap_scaffolding' /></a></li>
				<li><a href="<c:url value='/bootstrap/basecss' />" data-active="basecss"><spring:message code='label_bootstrap_basecss' /></a></li>
				<li><a href="<c:url value='/bootstrap/components' />" data-active="components"><spring:message code='label_bootstrap_components' /></a></li>
			</ul>
		</li>

		<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code='label_egov' /><b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="<c:url value='/egov/bbs' />" data-active="bbs"><spring:message code='label_egov_bbs' /></a></li>
			</ul>
		</li>
  
	</ul> 
  --%>
  
  <sec:authorize access="!isAuthenticated()">
    <a href="<c:url value="/login/signin"/>" class="btn btn-primary pull-right">Login</a> 
  </sec:authorize>
  
  <sec:authorize access="isAuthenticated()">
      <li class="nav pull-right dropdown"><a href="#" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">Logged in as <sec:authentication property="principal.username"/><b class="caret"></b></a>
        <ul class="dropdown-menu"> 
          <li><a href="<c:url value='/admin/index' />">Secure page</a></li>
          <li><a href="<c:url value='/admin/extreme/index' />">Extremely secure page</a></li>
          <li><a href="<c:url value='/j_spring_security_logout' />">Log out</a></li>
        </ul>
      </li>
  </sec:authorize>
</div>
<!--/.nav-collapse -->
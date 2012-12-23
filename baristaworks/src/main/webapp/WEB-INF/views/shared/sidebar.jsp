<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp" %>

<ul class="nav nav-list">

	<li class="nav-header"><spring:message code='label_spring'/></li>
	<li><a href="<c:url value='/spring/security' />" data-active="spring"><spring:message code='label_spring_security'/></a></li>
	 
	<li class="nav-header"><spring:message code='label_orm'/></li>
	<li><a href="<c:url value='/orm/hibernate' />" data-active="hibernate"><spring:message code='label_orm_hibernate'/></a></li>
	<li><a href="<c:url value='/orm/mybatis' />"  data-active="mybatis"><spring:message code='label_orm_mybatis'/></a></li>
	<li><a href="<c:url value='/orm/jpa' />" data-active="jpa"><spring:message code='label_orm_jpa'/></a></li>
	
	<li class="nav-header"><spring:message code='label_bootstrap'/></li>
	<li><a href="<c:url value='/bootstrap/scaffolding' />" data-active="scaffolding"><spring:message code='label_bootstrap_scaffolding'/></a></li>
	<li><a href="<c:url value='/bootstrap/basecss' />" data-active="basecss"><spring:message code='label_bootstrap_basecss'/></a></li>
	<li><a href="<c:url value='/bootstrap/components' />" data-active="components"><spring:message code='label_bootstrap_components'/></a></li>
 
	<li class="nav-header"><spring:message code='label_egov'/></li>
  <sec:authorize access="hasRole('admin')">
  	<li><a href="<c:url value='/egov/bbsmanage' />" data-active="bbs">게시판속성관리</a></li>
	 <li><a href="<c:url value='/egov/bbsuse' />" data-active="bbs">게시판사용관리</a></li>
  </sec:authorize>
	 
</ul> 
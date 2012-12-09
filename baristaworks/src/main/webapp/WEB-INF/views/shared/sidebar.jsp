<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp" %>

<ul class="nav nav-list">

	<li class="nav-header"><spring:message code='label_java'/></li>
	<li><a href="<c:url value='/java/spring' />" data-active="spring"><spring:message code='label_java_spring'/></a></li>
	
	<li class="nav-header"><spring:message code='label_orm'/></li>
	<li><a href="<c:url value='/orm/hibernate' />" data-active="hibernate"><spring:message code='label_orm_hibernate'/></a></li>
	<li><a href="<c:url value='/orm/mybatis' />"  data-active="mybatis"><spring:message code='label_orm_mybatis'/></a></li>
	<li><a href="<c:url value='/orm/jpa' />" data-active="jpa"><spring:message code='label_orm_jpa'/></a></li>
	
	<li class="nav-header"><spring:message code='label_bootstrap'/></li>
	<li><a href="<c:url value='/bootstrap/scaffolding' />" data-active="scaffolding"><spring:message code='label_bootstrap_scaffolding'/></a></li>
	<li><a href="<c:url value='/bootstrap/basecss' />" data-active="basecss"><spring:message code='label_bootstrap_basecss'/></a></li>
	<li><a href="<c:url value='/bootstrap/components' />" data-active="components"><spring:message code='label_bootstrap_components'/></a></li>

	<li class="nav-header"><spring:message code='label_egov'/></li>
	<li><a href="<c:url value='/egov/bbs' />" data-active="bbs"><spring:message code='label_egov_bbs'/></a></li>
	
</ul> 
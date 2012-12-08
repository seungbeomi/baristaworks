<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp" %>

<ul class="nav nav-list">
	<li class="nav-header"><spring:message code='label_java'/></li>
	<li class="active"><a href="<c:url value='/java/spring' />" data-active="spring"><spring:message code='label_java_spring'/></a></li>
	<li class="nav-header"><spring:message code='label_orm'/></li>
	<li><a href="<c:url value='/orm/hibernate' />" data-active="hibernate"><spring:message code='label_orm_hibernate'/></a></li>
	<li><a href="<c:url value='/orm/mybatis' />"  data-active="mybatis"><spring:message code='label_orm_mybatis'/></a></li>
</ul>
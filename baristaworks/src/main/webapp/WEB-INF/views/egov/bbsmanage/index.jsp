<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp" %>

<form class="form-search">
  <fieldset>
    <legend>게시판 정보</legend>
    <input type="text" class="span2 search-query">
    <button type="submit" class="btn">조회</button>
    <a href="<c:url value='/egov/bbsmanage/create'/>" class="btn btn-primary">등록</a>
  </fieldset>
</form>

<table class="table table-striped table-hover">
  <thead>
    <tr>
      <th>번호</th>
      <th>게시판명</th>
      <th>게시판유형</th>
      <th>게시판속성</th>
      <th>생성일</th>
      <th>사용여부</th>
    </tr>
  </thead>
  <tbody>
    <c:if test="${ empty result }">
      <tr>
        <td colspan="6">No Data.</td>
      </tr>
    </c:if>
    <c:if test="${ not empty result }">
      <c:forEach items="${ result }" var="bbsManageVO" varStatus="status">
    		<tr>
    			<td>${ status.count }</td>
    			<td>${ bbsManageVO.bbsNm }</td>
    			<td>${ bbsManageVO.bbsTyCodeNm }</td>
    			<td>${ bbsManageVO.bbsAttrbCodeNm }</td>
    			<td>${ bbsManageVO.frstRegistPnttm }</td>
    			<td>${ bbsManageVO.useAt }</td>
    		</tr>
  		</c:forEach>
    </c:if>
  </tbody>
</table>
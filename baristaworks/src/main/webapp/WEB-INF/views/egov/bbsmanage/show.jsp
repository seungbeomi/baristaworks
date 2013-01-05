<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp"%>

<b:form label="게시판정보상세" commandName="bbsManageVO">
  <b:view label="게시판명" path="bbsNm" value="${ bbsManageVO.bbsNm }"/>
  <b:view label="게시판소개" path="bbsIntrcn" value="${ bbsManageVO.bbsIntrcn }"/>
  <b:view label="게시판유형" path="bbsTyCode" value="${ bbsManageVO.bbsTyCodeNm }" />
  <b:view label="게시판속성" path="bbsAttrbCode" value="${ bbsManageVO.bbsAttrbCodeNm }" />
  <b:view label="답장가능여부" path="replyPosblAt" value="${ bbsManageVO.replyPosblAt }" />
  <b:view label="파일첨가가능여부" path="fileAtchPosblAt" value="${ bbsManageVO.fileAtchPosblAt }"/>
  <b:view label="첨부가능파일숫자" path="atchPosblFileNumber" value="${ bbsManageVO.atchPosblFileNumber }" />
  <b:control>
    <b:link label="목록" type="list" link="/egov/bbsmanage" />
    <b:link label="등록" type="create" link="/egov/bbsmanage?form" />
    <b:link label="수정" type="update" link="/egov/bbsmanage/${ bbsManageVO.bbsId }?form" />
    <b:link label="삭제" type="delete" link="/egov/bbsmanage" />
  </b:control>
</b:form>
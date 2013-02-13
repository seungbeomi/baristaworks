<%@ include file="/WEB-INF/views/shared/taglibs.jsp"%>

<b:form label="게시판정보등록" commandName="bbsManage">
  <b:input label="게시판명" path="bbsNm" />
  <b:textarea label="게시판소개" path="bbsIntrcn" />
  <b:select label="게시판유형" path="bbsTyCode" items="${ typeList }" />
  <b:select label="게시판속성" path="bbsAttrbCode" items="${ attrbList }" />
  <b:radio label="답장가능여부" path="replyPosblAt" />
  <b:radio label="파일첨가가능여부" path="fileAtchPosblAt" />
  <b:select label="첨부가능파일숫자" path="atchPosblFileNumber" begin="1" end="3" />
  <b:control>
    <b:button label="등록"/>
    <b:link label="취소" link="/egov/bbsmanage"/>
  </b:control>
</b:form>
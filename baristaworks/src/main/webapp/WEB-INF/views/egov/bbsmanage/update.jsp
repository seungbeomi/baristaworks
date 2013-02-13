<%@ include file="/WEB-INF/views/shared/taglibs.jsp"%>

<b:form label="게시판정보수정" commandName="bbsManageVO" method="put">
  <b:input label="게시판명" path="bbsNm" value="${ bbsManageVO.bbsNm }" />
  <b:textarea label="게시판소개" path="bbsIntrcn" value="${ bbsManageVO.bbsIntrcn }" />
  <b:input label="게시판유형" path="bbsNm" value="${ bbsManageVO.bbsTyCodeNm }" disabled="disabled" />
  <b:input label="게시판속성" path="bbsAttrbCode" value="${ bbsManageVO.bbsAttrbCodeNm }" disabled="disabled" />
  <b:input label="답장가능여부" path="replyPosblAt" value="${ bbsManageVO.replyPosblAt }" disabled="disabled" />
  <b:radio label="파일첨가가능여부" path="fileAtchPosblAt" />
  <b:select label="첨부가능파일숫자" path="atchPosblFileNumber" begin="1" end="3" value="${ bbsManageVO.atchPosblFileNumber }"/>
  <b:control>
    <b:button label="수정"/>
    <b:link label="취소" link="/egov/bbsmanage"/>
  </b:control>
</b:form>
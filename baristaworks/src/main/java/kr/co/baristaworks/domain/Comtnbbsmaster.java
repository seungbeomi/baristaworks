package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the comtnbbsmaster database table.
 * 
 */
@Entity
public class Comtnbbsmaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BBS_ID")
	private String bbsId;

	@Column(name="ATCH_POSBL_FILE_NUMBER")
	private BigDecimal atchPosblFileNumber;

	@Column(name="ATCH_POSBL_FILE_SIZE")
	private BigDecimal atchPosblFileSize;

	@Column(name="BBS_ATTRB_CODE")
	private String bbsAttrbCode;

	@Column(name="BBS_INTRCN")
	private String bbsIntrcn;

	@Column(name="BBS_NM")
	private String bbsNm;

	@Column(name="BBS_TY_CODE")
	private String bbsTyCode;

	@Column(name="FILE_ATCH_POSBL_AT")
	private String fileAtchPosblAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FRST_REGIST_PNTTM")
	private Date frstRegistPnttm;

	@Column(name="FRST_REGISTER_ID")
	private String frstRegisterId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDT_PNTTM")
	private Date lastUpdtPnttm;

	@Column(name="LAST_UPDUSR_ID")
	private String lastUpdusrId;

	@Column(name="REPLY_POSBL_AT")
	private String replyPosblAt;

	@Column(name="TMPLAT_ID")
	private String tmplatId;

	@Column(name="USE_AT")
	private String useAt;

	public Comtnbbsmaster() {
	}

	public String getBbsId() {
		return this.bbsId;
	}

	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}

	public BigDecimal getAtchPosblFileNumber() {
		return this.atchPosblFileNumber;
	}

	public void setAtchPosblFileNumber(BigDecimal atchPosblFileNumber) {
		this.atchPosblFileNumber = atchPosblFileNumber;
	}

	public BigDecimal getAtchPosblFileSize() {
		return this.atchPosblFileSize;
	}

	public void setAtchPosblFileSize(BigDecimal atchPosblFileSize) {
		this.atchPosblFileSize = atchPosblFileSize;
	}

	public String getBbsAttrbCode() {
		return this.bbsAttrbCode;
	}

	public void setBbsAttrbCode(String bbsAttrbCode) {
		this.bbsAttrbCode = bbsAttrbCode;
	}

	public String getBbsIntrcn() {
		return this.bbsIntrcn;
	}

	public void setBbsIntrcn(String bbsIntrcn) {
		this.bbsIntrcn = bbsIntrcn;
	}

	public String getBbsNm() {
		return this.bbsNm;
	}

	public void setBbsNm(String bbsNm) {
		this.bbsNm = bbsNm;
	}

	public String getBbsTyCode() {
		return this.bbsTyCode;
	}

	public void setBbsTyCode(String bbsTyCode) {
		this.bbsTyCode = bbsTyCode;
	}

	public String getFileAtchPosblAt() {
		return this.fileAtchPosblAt;
	}

	public void setFileAtchPosblAt(String fileAtchPosblAt) {
		this.fileAtchPosblAt = fileAtchPosblAt;
	}

	public Date getFrstRegistPnttm() {
		return this.frstRegistPnttm;
	}

	public void setFrstRegistPnttm(Date frstRegistPnttm) {
		this.frstRegistPnttm = frstRegistPnttm;
	}

	public String getFrstRegisterId() {
		return this.frstRegisterId;
	}

	public void setFrstRegisterId(String frstRegisterId) {
		this.frstRegisterId = frstRegisterId;
	}

	public Date getLastUpdtPnttm() {
		return this.lastUpdtPnttm;
	}

	public void setLastUpdtPnttm(Date lastUpdtPnttm) {
		this.lastUpdtPnttm = lastUpdtPnttm;
	}

	public String getLastUpdusrId() {
		return this.lastUpdusrId;
	}

	public void setLastUpdusrId(String lastUpdusrId) {
		this.lastUpdusrId = lastUpdusrId;
	}

	public String getReplyPosblAt() {
		return this.replyPosblAt;
	}

	public void setReplyPosblAt(String replyPosblAt) {
		this.replyPosblAt = replyPosblAt;
	}

	public String getTmplatId() {
		return this.tmplatId;
	}

	public void setTmplatId(String tmplatId) {
		this.tmplatId = tmplatId;
	}

	public String getUseAt() {
		return this.useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
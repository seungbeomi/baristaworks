package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * The persistent class for the comtnbbsmaster database table.
 * 
 */
//@Data
@Entity
@Table(name="BBSMANAGE")
public class BbsManage implements Serializable {
	
  private static final long serialVersionUID = 1L;

  @Id
	@Column(name="BBS_ID")
	@TableGenerator(
	    name = "BBS_ID_GEN", 
	    table = "COMTECOPSEQ", 
	    pkColumnName = "TABLE_NAME", 
	    valueColumnName = "NEXT_ID", 
	    pkColumnValue = "BBS_ID"
	)
  @GeneratedValue(strategy=GenerationType.TABLE, generator="BBS_ID_GEN")
  private Long bbsId;

	@Column(name="ATCH_POSBL_FILE_NUMBER")
	private int atchPosblFileNumber;

	@Column(name="ATCH_POSBL_FILE_SIZE")
	private int atchPosblFileSize;

	@Column(name="BBS_ATTRB_CODE")
	private String bbsAttrbCode;

	@Column(name="BBS_INTRCN")
	private String bbsIntrcn;

	@Column(name="BBS_NM")
	@NotEmpty
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

	public BbsManage() {
	}

  public Long getBbsId() {
    return bbsId;
  }

  public void setBbsId(Long bbsId) {
    this.bbsId = bbsId;
  }

  public int getAtchPosblFileNumber() {
    return atchPosblFileNumber;
  }

  public void setAtchPosblFileNumber(int atchPosblFileNumber) {
    this.atchPosblFileNumber = atchPosblFileNumber;
  }

  public int getAtchPosblFileSize() {
    return atchPosblFileSize;
  }

  public void setAtchPosblFileSize(int atchPosblFileSize) {
    this.atchPosblFileSize = atchPosblFileSize;
  }

  public String getBbsAttrbCode() {
    return bbsAttrbCode;
  }

  public void setBbsAttrbCode(String bbsAttrbCode) {
    this.bbsAttrbCode = bbsAttrbCode;
  }

  public String getBbsIntrcn() {
    return bbsIntrcn;
  }

  public void setBbsIntrcn(String bbsIntrcn) {
    this.bbsIntrcn = bbsIntrcn;
  }

  public String getBbsNm() {
    return bbsNm;
  }

  public void setBbsNm(String bbsNm) {
    this.bbsNm = bbsNm;
  }

  public String getBbsTyCode() {
    return bbsTyCode;
  }

  public void setBbsTyCode(String bbsTyCode) {
    this.bbsTyCode = bbsTyCode;
  }

  public String getFileAtchPosblAt() {
    return fileAtchPosblAt;
  }

  public void setFileAtchPosblAt(String fileAtchPosblAt) {
    this.fileAtchPosblAt = fileAtchPosblAt;
  }

  public Date getFrstRegistPnttm() {
    return frstRegistPnttm;
  }

  public void setFrstRegistPnttm(Date frstRegistPnttm) {
    this.frstRegistPnttm = frstRegistPnttm;
  }

  public String getFrstRegisterId() {
    return frstRegisterId;
  }

  public void setFrstRegisterId(String frstRegisterId) {
    this.frstRegisterId = frstRegisterId;
  }

  public Date getLastUpdtPnttm() {
    return lastUpdtPnttm;
  }

  public void setLastUpdtPnttm(Date lastUpdtPnttm) {
    this.lastUpdtPnttm = lastUpdtPnttm;
  }

  public String getLastUpdusrId() {
    return lastUpdusrId;
  }

  public void setLastUpdusrId(String lastUpdusrId) {
    this.lastUpdusrId = lastUpdusrId;
  }

  public String getReplyPosblAt() {
    return replyPosblAt;
  }

  public void setReplyPosblAt(String replyPosblAt) {
    this.replyPosblAt = replyPosblAt;
  }

  public String getTmplatId() {
    return tmplatId;
  }

  public void setTmplatId(String tmplatId) {
    this.tmplatId = tmplatId;
  }

  public String getUseAt() {
    return useAt;
  }

  public void setUseAt(String useAt) {
    this.useAt = useAt;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }
	
}
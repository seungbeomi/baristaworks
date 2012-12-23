package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the comtnbbsmasteroptn database table.
 * 
 */
@Entity
@Table(name="BBSMANAGEOPTN")
public class BbsManageOptn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BBS_ID")
	private String bbsId;

	@Column(name="ANSWER_AT")
	private String answerAt;

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

	@Column(name="STSFDG_AT")
	private String stsfdgAt;

	public BbsManageOptn() {
	}

	public String getBbsId() {
		return this.bbsId;
	}

	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}

	public String getAnswerAt() {
		return this.answerAt;
	}

	public void setAnswerAt(String answerAt) {
		this.answerAt = answerAt;
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

	public String getStsfdgAt() {
		return this.stsfdgAt;
	}

	public void setStsfdgAt(String stsfdgAt) {
		this.stsfdgAt = stsfdgAt;
	}

}
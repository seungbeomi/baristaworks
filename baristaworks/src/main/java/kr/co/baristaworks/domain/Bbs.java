package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the comtnbbs database table.
 * 
 */
@Entity
@Table(name="BBS")
public class Bbs implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BbsPK id;

	@Column(name="ANSWER_AT", length=1)
	private String answerAt;

	@Column(name="ANSWER_LC", length=8)
	private BigDecimal answerLc;

	@Column(name="ATCH_FILE_ID", length=20)
	private String atchFileId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FRST_REGIST_PNTTM")
	private Date frstRegistPnttm;

	@Column(name="FRST_REGISTER_ID", length=20)
	private String frstRegisterId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDT_PNTTM")
	private Date lastUpdtPnttm;

	@Column(name="LAST_UPDUSR_ID", length=20)
	private String lastUpdusrId;

	@Column(name="NTCE_BGNDE", length=20)
	private String ntceBgnde;

	@Column(name="NTCE_ENDDE", length=20)
	private String ntceEndde;

	@Column(name="NTCR_ID", length=20)
	private String ntcrId;

	@Column(name="NTCR_NM", length=20)
	private String ntcrNm;

	@Lob
	@Column(name="NTT_CN")
	private String nttCn;

	@Column(name="NTT_NO", length=20)
	private BigDecimal nttNo;

	@Column(name="NTT_SJ", length=2000)
	private String nttSj;

	@Column(name="PARNTSCTT_NO", length=10)
	private BigDecimal parntscttNo;

	@Column(name="PASSWORD", length=200)
	private String password;

	@Column(name="RDCNT", length=10)
	private BigDecimal rdcnt;

	@Column(name="SORT_ORDR", length=8)
	private BigDecimal sortOrdr;

	@Column(name="USE_AT", length=1)
	private String useAt;

	public Bbs() {
	}

	public BbsPK getId() {
		return this.id;
	}

	public void setId(BbsPK id) {
		this.id = id;
	}

	public String getAnswerAt() {
		return this.answerAt;
	}

	public void setAnswerAt(String answerAt) {
		this.answerAt = answerAt;
	}

	public BigDecimal getAnswerLc() {
		return this.answerLc;
	}

	public void setAnswerLc(BigDecimal answerLc) {
		this.answerLc = answerLc;
	}

	public String getAtchFileId() {
		return this.atchFileId;
	}

	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
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

	public String getNtceBgnde() {
		return this.ntceBgnde;
	}

	public void setNtceBgnde(String ntceBgnde) {
		this.ntceBgnde = ntceBgnde;
	}

	public String getNtceEndde() {
		return this.ntceEndde;
	}

	public void setNtceEndde(String ntceEndde) {
		this.ntceEndde = ntceEndde;
	}

	public String getNtcrId() {
		return this.ntcrId;
	}

	public void setNtcrId(String ntcrId) {
		this.ntcrId = ntcrId;
	}

	public String getNtcrNm() {
		return this.ntcrNm;
	}

	public void setNtcrNm(String ntcrNm) {
		this.ntcrNm = ntcrNm;
	}

	public String getNttCn() {
		return this.nttCn;
	}

	public void setNttCn(String nttCn) {
		this.nttCn = nttCn;
	}

	public BigDecimal getNttNo() {
		return this.nttNo;
	}

	public void setNttNo(BigDecimal nttNo) {
		this.nttNo = nttNo;
	}

	public String getNttSj() {
		return this.nttSj;
	}

	public void setNttSj(String nttSj) {
		this.nttSj = nttSj;
	}

	public BigDecimal getParntscttNo() {
		return this.parntscttNo;
	}

	public void setParntscttNo(BigDecimal parntscttNo) {
		this.parntscttNo = parntscttNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getRdcnt() {
		return this.rdcnt;
	}

	public void setRdcnt(BigDecimal rdcnt) {
		this.rdcnt = rdcnt;
	}

	public BigDecimal getSortOrdr() {
		return this.sortOrdr;
	}

	public void setSortOrdr(BigDecimal sortOrdr) {
		this.sortOrdr = sortOrdr;
	}

	public String getUseAt() {
		return this.useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
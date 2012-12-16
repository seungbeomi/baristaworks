package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the comtnbbs database table.
 * 
 */
@Entity
@Table(name="comtnbbs")
public class Comtnbb implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComtnbbPK id;

	@Column(name="ANSWER_AT")
	private String answerAt;

	@Column(name="ANSWER_LC")
	private BigDecimal answerLc;

	@Column(name="ATCH_FILE_ID")
	private String atchFileId;

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

	@Column(name="NTCE_BGNDE")
	private String ntceBgnde;

	@Column(name="NTCE_ENDDE")
	private String ntceEndde;

	@Column(name="NTCR_ID")
	private String ntcrId;

	@Column(name="NTCR_NM")
	private String ntcrNm;

	@Lob
	@Column(name="NTT_CN")
	private String nttCn;

	@Column(name="NTT_NO")
	private BigDecimal nttNo;

	@Column(name="NTT_SJ")
	private String nttSj;

	@Column(name="PARNTSCTT_NO")
	private BigDecimal parntscttNo;

	private String password;

	private BigDecimal rdcnt;

	@Column(name="SORT_ORDR")
	private BigDecimal sortOrdr;

	@Column(name="USE_AT")
	private String useAt;

	public Comtnbb() {
	}

	public ComtnbbPK getId() {
		return this.id;
	}

	public void setId(ComtnbbPK id) {
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
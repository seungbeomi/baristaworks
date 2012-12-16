package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the comtccmmnclcode database table.
 * 
 */
@Entity
public class Comtccmmnclcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CL_CODE")
	private String clCode;

	@Column(name="CL_CODE_DC")
	private String clCodeDc;

	@Column(name="CL_CODE_NM")
	private String clCodeNm;

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

	@Column(name="USE_AT")
	private String useAt;

	public Comtccmmnclcode() {
	}

	public String getClCode() {
		return this.clCode;
	}

	public void setClCode(String clCode) {
		this.clCode = clCode;
	}

	public String getClCodeDc() {
		return this.clCodeDc;
	}

	public void setClCodeDc(String clCodeDc) {
		this.clCodeDc = clCodeDc;
	}

	public String getClCodeNm() {
		return this.clCodeNm;
	}

	public void setClCodeNm(String clCodeNm) {
		this.clCodeNm = clCodeNm;
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

	public String getUseAt() {
		return this.useAt;
	}

	public void setUseAt(String useAt) {
		this.useAt = useAt;
	}

}
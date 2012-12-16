package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comtccmmncode database table.
 * 
 */
@Entity
public class Comtccmmncode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_ID")
	private String codeId;

	@Column(name="CL_CODE")
	private String clCode;

	@Column(name="CODE_ID_DC")
	private String codeIdDc;

	@Column(name="CODE_ID_NM")
	private String codeIdNm;

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

	public Comtccmmncode() {
	}

	public String getCodeId() {
		return this.codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getClCode() {
		return this.clCode;
	}

	public void setClCode(String clCode) {
		this.clCode = clCode;
	}

	public String getCodeIdDc() {
		return this.codeIdDc;
	}

	public void setCodeIdDc(String codeIdDc) {
		this.codeIdDc = codeIdDc;
	}

	public String getCodeIdNm() {
		return this.codeIdNm;
	}

	public void setCodeIdNm(String codeIdNm) {
		this.codeIdNm = codeIdNm;
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
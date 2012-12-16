package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the comtccmmndetailcode database table.
 * 
 */
@Entity
public class Comtccmmndetailcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ComtccmmndetailcodePK id;

	@Column(name="CODE_DC")
	private String codeDc;

	@Column(name="CODE_NM")
	private String codeNm;

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

	public Comtccmmndetailcode() {
	}

	public ComtccmmndetailcodePK getId() {
		return this.id;
	}

	public void setId(ComtccmmndetailcodePK id) {
		this.id = id;
	}

	public String getCodeDc() {
		return this.codeDc;
	}

	public void setCodeDc(String codeDc) {
		this.codeDc = codeDc;
	}

	public String getCodeNm() {
		return this.codeNm;
	}

	public void setCodeNm(String codeNm) {
		this.codeNm = codeNm;
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
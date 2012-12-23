package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the comtccmmncode database table.
 * 
 */
@Data
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

}
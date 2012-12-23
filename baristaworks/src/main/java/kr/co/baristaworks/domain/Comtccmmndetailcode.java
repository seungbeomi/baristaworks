package kr.co.baristaworks.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the comtccmmndetailcode database table.
 * 
 */
@Data
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

}
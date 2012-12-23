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

import lombok.Data;


/**
 * The persistent class for the comtnbbsmaster database table.
 * 
 */
@Data
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

}
package kr.co.baristaworks.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the comtnbbsuse database table.
 * 
 */
@Embeddable
public class BbsUsePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BBS_ID")
	private String bbsId;

	@Column(name="TRGET_ID")
	private String trgetId;

	public BbsUsePK() {
	}
	public String getBbsId() {
		return this.bbsId;
	}
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}
	public String getTrgetId() {
		return this.trgetId;
	}
	public void setTrgetId(String trgetId) {
		this.trgetId = trgetId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BbsUsePK)) {
			return false;
		}
		BbsUsePK castOther = (BbsUsePK)other;
		return 
			this.bbsId.equals(castOther.bbsId)
			&& this.trgetId.equals(castOther.trgetId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.bbsId.hashCode();
		hash = hash * prime + this.trgetId.hashCode();
		
		return hash;
	}
}
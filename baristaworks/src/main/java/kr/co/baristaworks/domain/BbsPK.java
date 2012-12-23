package kr.co.baristaworks.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the comtnbbs database table.
 * 
 */
@Embeddable
public class BbsPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NTT_ID", length=20)
	private long nttId;

	@Column(name="BBS_ID", length=20)
	private String bbsId;

	public BbsPK() {
	}
	public long getNttId() {
		return this.nttId;
	}
	public void setNttId(long nttId) {
		this.nttId = nttId;
	}
	public String getBbsId() {
		return this.bbsId;
	}
	public void setBbsId(String bbsId) {
		this.bbsId = bbsId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BbsPK)) {
			return false;
		}
		BbsPK castOther = (BbsPK)other;
		return 
			(this.nttId == castOther.nttId)
			&& this.bbsId.equals(castOther.bbsId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.nttId ^ (this.nttId >>> 32)));
		hash = hash * prime + this.bbsId.hashCode();
		
		return hash;
	}
}
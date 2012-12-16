package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the comtnbbs database table.
 * 
 */
@Embeddable
public class ComtnbbPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="NTT_ID")
	private long nttId;

	@Column(name="BBS_ID")
	private String bbsId;

	public ComtnbbPK() {
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
		if (!(other instanceof ComtnbbPK)) {
			return false;
		}
		ComtnbbPK castOther = (ComtnbbPK)other;
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
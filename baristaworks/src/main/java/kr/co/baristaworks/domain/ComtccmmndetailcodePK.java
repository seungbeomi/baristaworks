package kr.co.baristaworks.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the comtccmmndetailcode database table.
 * 
 */
@Embeddable
public class ComtccmmndetailcodePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CODE_ID")
	private String codeId;

	private String code;

	public ComtccmmndetailcodePK() {
	}
	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ComtccmmndetailcodePK)) {
			return false;
		}
		ComtccmmndetailcodePK castOther = (ComtccmmndetailcodePK)other;
		return 
			this.codeId.equals(castOther.codeId)
			&& this.code.equals(castOther.code);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeId.hashCode();
		hash = hash * prime + this.code.hashCode();
		
		return hash;
	}
}
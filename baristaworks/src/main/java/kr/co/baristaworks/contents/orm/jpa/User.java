package kr.co.baristaworks.contents.orm.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name="UserInfo")
@NamedQuery(name="User.findByTheUsersName", query="from User u where u.username = ?1")
public class User extends AbstractPersistable<Long>{

	@Column(unique = true, length=20)
	private String username;
	
	public User() {
		this(null);
	}

	public User(Long id) {
		this.setId(id);
	}
	
}

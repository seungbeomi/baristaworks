package kr.co.baristaworks.contents.orm.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {

	User findByTheUsersName(String username);
	
	List<User> findByLastname(String lastname);
	
	@Query("select u from User u where u.firstname = ?1")
	List<User> findByFirstname(String firstname);
}

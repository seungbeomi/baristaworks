package kr.co.baristaworks.contents.orm.jpa;

import java.util.List;

import kr.co.baristaworks.domain.User;

public interface UserRepositoryCustom {

	List<User> myCustomBatchOperation();
	
}

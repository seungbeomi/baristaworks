package kr.co.baristaworks.contents.orm.jpa;

import java.util.List;

public interface UserRepositoryCustom {

	List<User> myCustomBatchOperation();
	
}

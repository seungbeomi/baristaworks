package kr.co.baristaworks.contents.orm.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

public class UserRepositoryImpl implements UserRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<User> myCustomBatchOperation() {
		CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
		return em.createQuery(criteriaQuery).getResultList();
	}

}

package webusingsql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import webusingsql.model.items;


@Repository
public class itemsdao {
	@PersistenceContext
    private EntityManager em;
	//Session session = em.unwrap(Session.class);
	
	public List getItems() {
		String QueryString = "from items";
		Query query = em.createQuery(QueryString,items.class);
		List<items> result = query.getResultList();
		return result;
	}
}

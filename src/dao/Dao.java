package dao;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import scanned.model.Customer;
 
public class Dao{
    
	private SessionFactory sessionFactory;

	public Dao() {

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void saveCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
	}

}

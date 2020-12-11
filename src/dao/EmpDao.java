package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository
public class EmpDao {
	@Autowired
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	public void addEmp(Employee emp)
	{
		Session session = sessionFactory.getCurrentSession();
		System.out.println("Dao method called");
		session.save(emp);
		System.out.println("saved");
	}
	
	public List<Employee> listEmp() {
		Session sess = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Employee> eobjlist = sess.createQuery("from Employee").list();
		System.out.println("list Done");
		return (eobjlist) ;
	}

}

package service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmpDao;
import model.Employee;


@Service
public class EmpService {
	@Autowired
	private EmpDao empDao;
	
	
	@Transactional
	public void addEmp(Employee eobj){
		System.out.println("Service add_emp Called");
		empDao.addEmp(eobj);
	}
	
	@Transactional
	public List<Employee> listEmp() {
		return empDao.listEmp();
	}
	

}

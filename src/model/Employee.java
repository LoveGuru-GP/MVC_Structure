package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@Column(name="Emp_Id")
	int empId;
	@Column(name="Emp_Name")
	String empName;
	int sal;
	
	public Employee(){
		
	}
	public Employee(int empId, String empName, int sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}
	
	

}

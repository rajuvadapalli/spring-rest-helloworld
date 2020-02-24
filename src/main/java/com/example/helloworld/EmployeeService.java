package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	List<Employee> empList=new ArrayList<Employee>();

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	
	public void addToEmpList(Employee emp) {
		this.empList.add(emp);
	}
	
	public void deleteFromEmpList(String id) {
		for(int i=0; i<this.empList.size();i++) {
			if(this.empList.get(i).getId().equals(id)) {
				this.empList.remove(i);
			}
		}
		
	}
	
	public void updateEmpList(Employee emp) {
		for(int i=0; i<this.empList.size();i++) {
			if(this.empList.get(i).getId().equals(emp.getId())) {
				this.empList.get(i).setName(emp.getName());;
			}
		}
		
	}

}

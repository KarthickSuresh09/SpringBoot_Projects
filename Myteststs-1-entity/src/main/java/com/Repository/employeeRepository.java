package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.employee_entity;



	public interface employeeRepository extends JpaRepository<employee_entity,Integer>{
		
	@Query(value="select max(emloyee_salary) from employee",nativeQuery=true)
	
	 public int Maxi();

	
	@Query(value="select min(emloyee_salary) from employee",nativeQuery=true)
	
	public int getempo();
	
	@Query(value="select * from employee where emloyee_salary=(select max(emloyee_salary)from employee)",nativeQuery=true)
	
	public int getmax();

	
	@Query(value="select e from employee_entity e ")
	
	public List<employee_entity> getjp1();
	
	
	
	//@Query(value="select max(e.emloyee_salary) from employee_entity e")
	
	@Query("SELECT e FROM employee_entity e WHERE e.emloyeeSalary = (SELECT MAX(emloyeeSalary) FROM employee_entity emp)")

	public List<employee_entity> getjp2();
	
	
	@Query("select e from employee_entity e where e.employeename like '%karan%'")
	
    //@Query("SELECT e FROM employee_entity e WHERE LOWER(e.employeename) LIKE LOWER(CONCAT('%', :name, '%'))")
	public List<employee_entity> getjp3();
	}

	
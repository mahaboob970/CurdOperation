package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employeedto;

@Repository
public interface EmpolyeeData extends JpaRepository<Employeedto, Integer> {
	

	@Query(value="select u.name,d.department_name from test.user u inner join test.department d on d.department_id=u.department_id")
	public List<Employeedto> findAllNameAndDepartment(int department_id);

}

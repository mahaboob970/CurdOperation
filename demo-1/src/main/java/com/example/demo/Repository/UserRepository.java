package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employeedto;
import com.example.demo.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	// @Query(value="select * from test.user where salary>:salary",nativeQuery =
	// true)

	public List<Users> findAllBySalaryGreaterThan(@Param("salary") float salary);
	
	@Query(value="select u.name,d.department_name from test.user u inner join test.department d on d.department_id=u.department_id")
	public List<Employeedto> findAllNameAndDepartment(int department_id);

}
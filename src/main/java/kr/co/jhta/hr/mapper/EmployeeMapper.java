package kr.co.jhta.hr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.jhta.hr.vo.Employee;

// Mapper interface 만들었음
@Mapper
public interface EmployeeMapper {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeDetail(int empId);

	Employee getEmployeeDetailById(int empId);
	Employee getEmployeeById(int empId);
	
}

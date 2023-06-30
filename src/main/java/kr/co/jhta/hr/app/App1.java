package kr.co.jhta.hr.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.mapper.EmployeeMapper;
import kr.co.jhta.hr.vo.Employee;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-context.xml");

		EmployeeMapper employeeMapper = context.getBean(EmployeeMapper.class);
		
		List<Employee> employees = employeeMapper.getAllEmployees();
		for(Employee e : employees) {
			System.out.println(e.getId() +"\t"+ e.getFirstName() +"\t"+ e.getLastName() +"\t"+
								e.getEmail() +"\t"+ e.getPhoneNumber() +"\t"+ e.getCommissionPct() +"\t"+
								e.getSalary() +"\t"+ e.getHireDate() ) ;
		}
		
		System.out.println();
		for(Employee e : employees) {
			System.out.println(e.getDepartment() +"\t"+ e.getJob() +"\t"+ e.getManager() ) ;
		}
		
	}
}

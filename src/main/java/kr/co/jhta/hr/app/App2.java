package kr.co.jhta.hr.app;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.hr.service.HrService;
import kr.co.jhta.hr.vo.Department;
import kr.co.jhta.hr.vo.Employee;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-context.xml");
		
		HrService service = context.getBean(HrService.class);
		
		
//		Employee e = service.getEmployeeDetails(110);
//		
//		System.out.println("아이디 : " + e.getId());
//		System.out.println("이름 : " + e.getFirstName() + " " + e.getLastName());
//		System.out.println("이메일 : " + e.getEmail());
//		System.out.println("전화번호 : " + e.getPhoneNumber());
//		System.out.println("입사일 : " + e.getHireDate());
//		System.out.println("직종아이디 : " + e.getJob().getId());
//		System.out.println("직종제목 : " + e.getJob().getTitle());
//		System.out.println("급여 : " + e.getSalary());
//		System.out.println("최소급여 : " + e.getJob().getMinSalary());
//		System.out.println("최대급여 : " + e.getJob().getMaxSalary());
//		System.out.println("커미션 : " + e.getCommissionPct());
//		if(e.getManager() != null) {
//			System.out.println("매니저아이디 : " + e.getManager().getId());
//			System.out.println("매니저이름 : " + e.getManager().getFirstName()+" " +e.getLastName());
//		}
//		if(e.getDepartment() != null) {
//			System.out.println("부서아이디 : " + e.getDepartment().getId());
//			System.out.println("부서명 : " + e.getDepartment().getName());
//			System.out.println("부서소재지 : " + e.getDepartment().getLocId());
//		}

		Department d = service.getDepartmentWithEmployees(60);
		
		System.out.println("부서아이디 : "+d.getId());
		System.out.println("부서명 : "+d.getName());
		List<Employee> employees = d.getEmployees();
		for(Employee e : employees) {
			System.out.println("사원아이디 : " + e.getId() );
		}
	}
}

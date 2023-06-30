package kr.co.jhta.hr.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("Dept")
public class Department {

	private int id;
	private String name;
	private Employee manager;
	private int locId;
	// 같은부서의 직원들 구하기(부서정보는 하나만, 직원정보만 여러개 구하도록)
	private List<Employee> employees;
	
	public Department() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}

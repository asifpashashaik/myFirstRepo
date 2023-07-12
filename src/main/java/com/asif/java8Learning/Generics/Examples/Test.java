package com.asif.java8Learning.Generics.Examples;

class Employee{
	private Integer eno;
    private String ename;
    
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Employee(Integer eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
}

class Student{
	private Integer sno;
    private String sname;
    
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getEname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Student(Integer sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	
	
}


public class Test {

	public <T> void studentOrEmpoyeeMethod(T t) {
		System.out.println(t);
	}
	
	public static void main(String[] args) {

		Test test = new Test();
		test.studentOrEmpoyeeMethod(new Student(1,"Asif"));
		test.studentOrEmpoyeeMethod(new Employee(2,"Ariff"));
		
	}

}

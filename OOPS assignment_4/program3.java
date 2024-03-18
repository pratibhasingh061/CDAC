package in.com;

import java.util.Scanner;

class Employee {
	String name;
    int empid;
   double salary;
	public void AcceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		this.name = sc.nextLine();
		System.out.print("Empid : ");
		this.empid = sc.nextInt();
		System.out.print("Salary : ");
		this.salary = sc.nextDouble();
}
	public void acceptRecord(String name, int empid, double salary) {
		System.out.println(this.name+" "+this.empid+" "+this.salary);
	}

public class OOPS {
	public void main(String[] args) {
		Employee Emp = new Employee();
		Emp.acceptRecord("pratibha",061,45000.);
		

		
	}
}

package com.vivekanand.SpringFile;

public class Question39 
{
	private int id;
	private String name;
	private int salary;
	
	
	public int getid() {
		return id;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}
	public int getsalary() {
		return salary;
	}

	public void setid(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}


		public void displaydetails()
		{
			System.out.println("RollNO: "+id);
			System.out.println("Name: "+ name);
			System.out.println("Salary: "+salary);
		}
	}

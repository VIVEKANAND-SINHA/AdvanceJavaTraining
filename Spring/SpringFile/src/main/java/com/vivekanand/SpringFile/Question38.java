package com.vivekanand.SpringFile;

public class Question38
{
private int id;
private String name;
private int age;

	public Question38 (int id,String name,int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.println("RollNO: "+id);
		System.out.println("Name: "+ name);
		System.out.println("age: "+age);
	}
}

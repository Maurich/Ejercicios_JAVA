package Ejercicios;
import java.math.*;

public class Ejercicio {
	double pi=Math.PI;
	public static void main(String[] args){
		/*Circle cir=new Circle();
		cir.setRadius(21);
		System.out.println("Area = "+cir.getArea());
		System.out.println("Circunferencia = "+cir.getCircunference());
		System.out.println("Radio = "+cir.getRadius());
		System.out.println(""+cir.toString());*/
		Employee em=new Employee(1264, "tito", "Lopez", 1212);
		System.out.println(""+em.toString());
	}

}
//Ejercicio 1
class Circle {

		private double radius = 1.0;

		public Circle() {
			
		}

		public Circle (double radius) {
		this.radius=radius;	
		}

		public double getRadius () {
			return radius;
			
		}

		public void setRadius (double radius) {
		this.radius=radius;
		}

		public double getArea () {
			return (Math.pow(radius,2)*Math.PI);
		}



		public double getCircunference () {
			return (Math.PI*(2*radius));
			
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}

	}
//Ejercicio 2

class Employee{ 
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return "firstName lastName";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary(){
		return salary*12;
	}
	public int raiseSalary(int percent){
		return salary+percent;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + firstName+" " 
				+ lastName + ", salary= $ " + salary + "]";
	}
	//Ejercicio 3
	class Author{
		
		private String name;
		private String email;
		private char gender;
		
		public Author(String name, String email, char gender) {
			this.name = name;
			this.email = email;
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public char getGender() {
			return gender;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Author [name=" + name + ", email=" + email + ", gender="
					+ gender + "]";
		}
		
		
	}
	//Ejercicio 4
	
	class Account{
		private String id;
		private String name;
		private int balance=0;
		
		public Account(){
			
		}
		public Account(String id, String name, int balance) {
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		public String getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getBalance() {
			return balance;
		}
		public int credit(int amount){
			return balance+amount;
		}

		public int devit(int amount){
			if(amount <=balance){
				balance=balance-amount;
			}else
				System.out.println("Amount ecxeeded balance");
			
			return balance;
		}
		public int transferTo(Account another, int amount){
			if(amount <= balance){
				return balance=another.balance;
			}else
				System.out.println("Amount exceeded balance");
			
			return balance;
		}
		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", balance="
					+ balance + "]";
		}
	}
	//Ejercicio N5
/*class Author1{////////////RENOMBRAR***************
		private String name;
		private String email;
		private char gender;
	}*/
	class Book{
		private String name;
		private Author[] authors;
		private double price;
		private int qty=0;
		
		public Book(String name, Author[] authors, double price) {
			super();
			this.name = name;
			this.authors = authors;
			this.price = price;
		}

		public Book(String name, Author[] authors, double price, int qty) {
			this.name = name;
			this.authors = authors;
			this.price = price;
			this.qty = qty;
		}

		public String getName() {
			return name;
		}

		public Author[] getAuthors() {
			return authors;
		}

		public double getPrice() {
			return price;
		}

		public int getQty() {
			return qty;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
		
	}
	
	
}


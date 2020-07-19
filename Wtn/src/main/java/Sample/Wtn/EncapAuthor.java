package Sample.Wtn;

import java.util.Scanner;

class Poet{
	String name;
	String email;
	char gender;
	/*Poet(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	void display(){
		System.out.println(name);
		System.out.println(email);
		System.out.println(gender);
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	void display() {
	System.out.println(name);
	System.out.println(email);
	System.out.println(gender);
	}
}

class Book{
	String name;
	Poet Poet;
	double price;
	int stock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Poet getPoet() {
		return Poet;
	}
	public void setPoet(Poet Poet) {
		this.Poet= Poet;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	void display() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(stock);
	}
}

public class EncapAuthor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String email = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		char gender = sc.next().charAt(0);
		Book b = new Book();
		Poet a = new Poet();
		a.setName(name);
		a.setEmail(email);
		a.setGender(gender);
		a.display();
		b.setName(name);
		b.setPrice(price);
		b.setStock(stock);
		b.display();
		sc.close();
	}
	
}


/*
 
Create a class Poet with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), Poet (of the class Poet you have just created),
price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Poet]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the 
book (including the Poet details)

 */
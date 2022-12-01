package lab1java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements DAO{
	public String name;
	public Double price;
	Scanner scan = new Scanner(System.in);
	
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public void insert(List<Product> list) {
		
		while(true) {
			Product tempPr = new Product();
			System.out.println("Insert name: ");
			tempPr.setName(scan.nextLine());
			System.out.println("Insert price: ");
			tempPr.setPrice(scan.nextDouble());
			scan.nextLine();
			list.add(tempPr);
			System.out.println("Do u want continue?(Y/N)");
			if(scan.next().toUpperCase().equals("N")) {
				break;
			}
			scan.nextLine();
		}
	}
	
	public int search(String name, List<Product> list) {
		int index = 0;
		for(Product s : list) {
			if(list.get(index).getName().equals(name)) { 
				return index;
			}
			index++;
		}
		return -1;
	}
	
	@Override
	public void update(String name, List<Product> list) {
		int location = search(name, list);
		System.out.println("Insert new name: ");
		Product tempPr = new Product();
		scan.nextLine();
		tempPr.setName(scan.nextLine());
		System.out.println("Insert new price: ");
		tempPr.setPrice(scan.nextDouble());
		list.set(location, tempPr);
						
	}
	
	@Override
	public void delete(String name, List<Product> list) {
		int location = search(name, list);
		list.remove(location);
	}
	
	@Override
	public void select(String name,List<Product> list) {
		int location = search(name, list);
		System.out.println("Name: " + list.get(location).getName());
		System.out.println("Price: " + list.get(location).getPrice());
	}
	
	public void print(List<Product> list) {
		for(Product s : list) {
			System.out.println("Name: " + s.getName());
			System.out.println("Price: " + s.getPrice());
		}
	}
}
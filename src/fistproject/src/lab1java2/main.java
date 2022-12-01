package lab1java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		List<Product> list = new ArrayList<Product>();
		Product pr = new Product();
		pr.insert(list);
		pr.print(list);
		System.out.println("Insert name u want to update: ");
		String nameUpdate = scan.nextLine();
		pr.update(nameUpdate, list);
		System.out.println("Insert name u want to delete: ");
		String nameUpdate1 = scan.nextLine();
		pr.delete(nameUpdate1, list);
		System.out.println("++++++++++++++");
		pr.print(list);
		System.out.println("Insert name u want to see: ");
		pr.select(scan.nextLine(), list);
		
	}
}

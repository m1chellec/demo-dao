package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
public static void main(String[] args) {
	Department dp = new Department(1, "book");
	
	Seller seller = new Seller (1, "primeiro seller", "msds@gmail.com", new Date(), 1330.00, dp);
	System.out.println(seller);
}
}

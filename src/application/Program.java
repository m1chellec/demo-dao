package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
public static void main(String[] args) {

	SellerDao dao = DaoFactory.createSellerDao();
	
	System.out.println("==== TEST 1: FindById ===");
	Seller seller = dao.findById(3);
	
	System.out.println("==== TEST 2: SELLER -  FindByDepartment ===");
	Department department = new Department(2, null);
	List<Seller> list = dao.findByDepartment(department);
	
	for(Seller obj : list) {
		
		System.out.println(obj);
	}
}
}

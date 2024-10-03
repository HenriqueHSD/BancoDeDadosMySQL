package application;


import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sell = DaoFactory.createSellerDao();
		
		System.out.println("== teste 1 FindById ==");
		
		Seller sel = sell.findById(3);
		
		System.out.println(sel);
		
		System.out.println("\n== teste 2 FindByDepartment ==");
		Department department = new Department(2, null);
		
		List<Seller> list = sell.findByDepartment(department);
		
		for(Seller li : list) {
			System.out.println(li);
		}
		
		System.out.println("\n== teste 3  FindAll ==");
				
		list = sell.findAll();
		
		for(Seller li : list) {
			System.out.println(li);
		}
		
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
		sell.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		

	}

}

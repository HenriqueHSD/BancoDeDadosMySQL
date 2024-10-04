package application;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("== teste 1 FindById ==");
		
		Seller sel = sellerDao.findById(3);
		
		System.out.println(sel);
		
		System.out.println("\n== teste 2 FindByDepartment ==");
		Department department = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller li : list) {
			System.out.println(li);
		}
		
		System.out.println("\n== teste 3  FindAll ==");
				
		list = sellerDao.findAll();
		
		for(Seller li : list) {
			System.out.println(li);
		}
		
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller update =====");
		sel = sellerDao.findById(1);
		sel.setName("Mario Brown");
		sellerDao.update(sel);
		System.out.println("Upadate completed");
		
		System.out.println("\n=== TEST 6: seller delete =====");
		System.out.println("Digite um id para ser deletado");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
			
		
		

		

	}

}

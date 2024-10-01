package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department ob = new Department(1, "Henrique");
		
		Seller seller = new Seller(1, "damiao", "teste@teste", LocalDate.now(), 2500.00, ob);
		
		System.out.println(ob);
		System.out.println(seller);

	}

}

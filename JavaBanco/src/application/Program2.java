package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("== TEST 1 FindById ==");

		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n== TEST 2  FindAll ==");

		List<Department> list = departmentDao.findAll();
		for (Department li : list) {
			System.out.println(li);
		}

		  System.out.println("\n=== TEST 3: department insert =====");
		 
		  Department newDepartment = new Department(null, "Games");
		  departmentDao.insert(newDepartment); 
		  System.out.println("Inserted! New id = " + newDepartment.getId());
		  
		  System.out.println("\n=== TEST 4: department update =====");
		  
			Department dep2 = departmentDao.findById(3);
			dep2.setName("Consoles");
			departmentDao.update(dep2);
			System.out.println("Upadate completed");
		 
			System.out.println("\n=== TEST 5: department delete =====");
			
			System.out.println("Digite um id para ser deletado");
			int id = sc.nextInt();
			departmentDao.deleteById(id);
			System.out.println("Delete completed");
			
			sc.close();

	}

}

package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: seller findById =====");
		DepartmentDao  departmentDao = DaoFactory.createDepartmentDao();
         Department   department = departmentDao.findById(1);
         System.out.println(department);
         
         
         System.out.println("\n=== TEST 2: seller findAll =====");
         List<Department> list = departmentDao.findAll();
 		list = departmentDao.findAll();
 		for (Department obj : list) {
 			System.out.println(obj);
 			
 			
 	     

 		}
 		System.out.println("\n=== TEST 3: seller insert =====");
			Department newDepartment = new Department("Bicicleta");
			departmentDao.insert(newDepartment);
			System.out.println("Inserted! New id = " + newDepartment.getId());
			
			
			System.out.println("\n=== TEST 5: seller update =====");
			/*System.out.println(" Enter id para atualizar  test : ");
	        int id =sc.nextInt();
	        System.out.println(" Enter Name for delete test : ");
	        String departamento =sc.next();
	        */
			department = departmentDao.findById(8);
			department.setName("departamento");
			departmentDao.update(department);
			System.out.println("Update completed");
			
			System.out.println("\n=== TEST 5: seller delete =====");
			System.out.println(" Enter id for delete test : ");
	        int id =sc.nextInt();
	        departmentDao.deleteById(id);
	        System.out.println("Delete completed ");
 		
	        sc.close();

	}

}

package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		//System.out.println("==== TEST 1 - find Department by ID ====");
		//System.out.print("Digite o ID do departamento desejado: ");
		//int id = sc.nextInt();

		//Department dept = departmentDao.findById(id);
		//System.out.println(dept);

		//System.out.println("\n==== TEST 2 - insert Department ====");
		//sc.nextLine();
		//System.out.print("Digite o nome do novo departamento:");
		//String name = sc.nextLine();

		//Department newDepartment = new Department(null, name);
		//departmentDao.insert(newDepartment);
		//System.out.println("Novo departamento criado, com o ID = " + newDepartment.getId());

		//System.out.println("\n==== TEST 3 - delete Department by ID ====");
		//System.out.print("Digite o ID do departamento para ser deletado: ");
		//id = sc.nextInt();
		//departmentDao.deleteById(id);
		//System.out.println("O departamento com ID " + id + " foi deletado!");
		
		System.out.println("\n==== TEST 4 - update Department name ====");
		
		System.out.print("Digite o ID do departamento para ser atualizado:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o novo nome do departamento " + id + ": ");
		String name = sc.nextLine();
		Department newDepartment = new Department(id, name);
		departmentDao.update(newDepartment);
		System.out.println("Nome do departamento ID = " + newDepartment.getId() + " atualizado para " + newDepartment.getName());

		sc.close();

	}

}

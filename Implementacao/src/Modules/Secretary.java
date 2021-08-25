package Modules;

import java.util.Scanner;

import Services.Authenticable;

public class Secretary extends User implements Authenticable{
	 
	public Secretary(int id, String name, String email, String password) {
		super(id, name, email, password);
	}
	
	public void RegisterUsers(String userType) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		if(userType == "Professor") {
			int id =+ 1;
			System.out.print("Registre o nome do professor: ");
			String name = sc.nextLine();
			System.out.print("Registre o email do professor: ");
			String email = sc.nextLine();
			System.out.print("Registre a senha do professor: ");
			String password = sc.nextLine();
			Teacher user = new Teacher(id, name, email, password);
			teacher.addTeacher(user);
			sc.close();
		} else if(userType == "Aluno") {
			int id =+ 1;
			System.out.print("Registre o nome do professor: ");
			String name = sc.nextLine();
			System.out.print("Registre o email do professor: ");
			String email = sc.nextLine();
			System.out.print("Registre a senha do professor: ");
			String password = sc.nextLine();
			Student user = new Student(id, name, email, password);
			student.addStudent(user);
			sc.close();
		}
	}
	
	 
}

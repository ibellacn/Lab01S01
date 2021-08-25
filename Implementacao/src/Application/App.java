package Application;

import java.util.Scanner;

import Modules.User;

public class App {
	public static void main(String[] args) {
		MenuOptions mo = new MenuOptions();
		User user = new User();
		Scanner sc = new Scanner(System.in);
		System.out.print("email: ");
		String email = sc.nextLine();
		System.out.print("senha: ");
		String password = sc.nextLine();
		boolean isLogin = user.login(email, password);
		if(isLogin == true) {
			mo.selectedMenu();
		}
		sc.close();
	}
}

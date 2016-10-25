package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		PasswordEncorder PE=new PasswordEncorder();
		String str;
		int a;
		do{
			System.out.print("Please enter a password¡G");
			str=scanner.next();
			
			a=str.compareToIgnoreCase("exit");
			if(a==0){
				break;
			}
			else{
				PE.encorder(str);
			}
		}while(a!=0);
	}

}

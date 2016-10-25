package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		NissanTiida NT=new NissanTiida();
		int a;
		System.out.print("Please enter a number¡G");
		a=scanner.nextInt();
		
		for(int i=1;i<=a;i++){
			NT.tiida(i);
		}
	}

}

package exampleProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("myGithubExample");
		// TODO Auto-generated method stub
		System.out.println("your name?");
		Scanner keyboard = new Scanner(System.in);
		String personName = keyboard.nextLine();
		System.out.println("Hi! " + personName);
		System.out.println("your age? ");
		int age = keyboard.nextInt();
		int futureAge = age + 10;
		System.out.println("your Future age will be =  " + futureAge);

	}

}

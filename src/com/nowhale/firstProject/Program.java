package com.nowhale.firstProject;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Welcome_To_Java();
		stdin_and_stdout_1(scan);
		if_else(scan);
		scan.close();
	}
	
	public static void Welcome_To_Java() {
		System.out.println("Hello, World.");
	    System.out.println("Hello, Java.");
	}
	
	public static void stdin_and_stdout_1(Scanner scan) {
		
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
	
	public static void if_else(Scanner scan) {
        int N = scan.nextInt();
        if(N % 2 != 0 || (N >= 6 && N <= 20))
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
    }
}

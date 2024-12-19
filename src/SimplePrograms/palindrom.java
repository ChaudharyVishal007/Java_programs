package SimplePrograms;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the String   ");
	        String str = scanner.nextLine();
	        String reversed = new StringBuilder(str).reverse().toString();
	        if( str.equals(reversed)){
	            System.out.print(" this is palindrom");
	        }
	else{
	    System.out.print(" this is not palindrom");
	}
	    scanner.close();
	    }
	    }
package SimplePrograms;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
	   
	        String str = "LOL";
	        System.out.println(str);
	        String reversed = new StringBuilder(str).reverse().toString();
	        if( str.equals(reversed)){
	            System.out.println(" This string ispalindrom");
	        }
	else{
	    System.out.println(" This string is not palindrom");
	}

	    }
	    }
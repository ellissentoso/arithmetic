
/* Name: Ellis Sentoso
*  Professor: Dave Harden
*  Assignment: Lab 2 - Arithmetic for CS1
*  Email: ellissentoso@gmail.com
*  Date: 07/07/2019 
*/


public class arithmetic {

	public static void main(String args[])  
    {  
	// Declaring variables
	String first_name = "Ellis"; // String of my first name
	int numLet = 5; 			 // number of characters in my first name
	// Number of letters of my first name
	int rem_result = myId % 17; // remainder of my ID # divisible by 17
	int int_result = (numLet + 17) % 11; // remainder divisible by 11
	int letter_result = 1 + 2 + 3 + 4 + 5;    // 1, 2, 3, 4, 5 comes from 5 characters count
													 // for my first name
	double result_precision = ((myId)/(numLet + 800.));// This variable hold values with precision
	
	// These print statements to the screen
	System.out.println("My first name is Ellis");
	
	
	System.out.println("\nThe number of characters in my first name is " + numLet);
	
	System.out.println("\nExpressions #1 -----> " + rem_result);
	
	System.out.println("\nExpressions #2 -----> " + int_result); 
	
	System.out.println("\nExpressions #3 -----> " + result_precision);
	
	System.out.println("\nExpressions #4 -----> " + letter_result);
	
	result_precision = ((15000.) / (80. + ((myId - 123456) / ((numLet + 20.) * (numLet + 20.)))));
	System.out.println("\nExpressions #5 -----> " + result_precision);
    }
}

/*----------- Sample Run ----------------
My first name is Ellis


The number of characters in my first name is 5

Expressions #1 -----> 8

Expressions #2 -----> 0

Expressions #3 -----> 25249.254658385093

Expressions #4 -----> 15

Expressions #5 -----> 0.46291280836041765
 ----------------------------------------*/
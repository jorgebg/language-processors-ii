/**
 * SSNL To Java
 * Test Number: 004
 * @author sohrab farzaneh
 * @version 1.0
 * 
 * ******************
 * SSNL CODE:
 * -- Square and Rectangle Area.
 * -- Test4 receives as parameter a boolean 
 * 	true if we want to find the area of a square, 
 *	false if we want to find the area of a rectangle -! -!
 *
 * public CLASS Test4.
 *
 * I need to define the public static void METHOD main (String[] args):
 * the method needs to check IF (args->length != 1) 
 *	THEN it prints ("The number of given arguments is wrong.")
 *	-- in SNL is allowed to do things like squareArea(read) it is much faster -!
 *	ELSE IF (args[0]->equals("true") equals to true) 
 *	THEN it prints ("The area of the square is: "+ squareArea(read))
 *	ELSE it prints ("The area of the rectangle is: "+ rectangleArea(read, read))
 *	END_IF 
 * END_METHOD.
 *
 * I create the public static int FUNCTION squareArea(int side):
 * the function returns side * side END_FUNCTION.
 *
 * I create also the public static int FUNCTION rectangleArea(int side1,int side2):
 * the function creates the VARIABLE int area --END_VARIABLE-!;
 * area = side1 * side2;
 * the function returns area END_FUNCTION
 *
 * END_CLASS
 * ******************
 * 
 * FUNCTIONALITY TESTED:
 *  No natural language expressions while declaring the class
 *  Nested Comments
 *  IF-THEN-ELSE IF-END_IF
 *  Boolean conditions (!=, ==)
 *  User input (read)
 *  Boolean expressions (true)
 *  Initialization of a variable with an expression
 *  Usage of equals Java function
 *  
 *  Usage of "equals to" instead "==" to check the condition 
 *  
 * DESIGN DECISSIONS:
 * 	The semantic analyzer must warn the user that the read function 
 *  returns a string and not an int
 *  
 *  The result wont be correct semantically due to that fact
 *  
 *  THE DOUBLE READ DOES NOT WORK CORRECTLY IT DOES NOT CHECK TWICE
 */
package test;
import java.io.IOException;
public class Test4 {
	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("The number of given arguments is wrong");
		}else if(args[0].equals("true")==true){
			try{
			System.out.println("The area of the square is: "+ squareArea(System.in.read()));
			}catch(IOException e){
				e.printStackTrace();
			}
		}else{
			try{
			System.out.println("The area of the rectangle is:"+ rectangleArea(System.in.read(), System.in.read()));
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

	public static int squareArea(int side){
		return side*side;
	}
	
	public static int rectangleArea(int side1, int side2){
		int area = side1*side2;
		return area;
	}
}

/**
 * SSNL To Java
 * Test Number: 003
 * @author sohrab farzaneh
 * @version 1.0
 * 
 * ******************
 * SSNL CODE:
 * -- SquareArea Test-!
 * public CLASS Test3.
 * private final VARIABLE int squareSide = 5 --END_VARIABLE-!. 
 *
 * I need to define the public static void METHOD main (String[] args):
 * the function declares the VARIABLE Test3 test = new Test3();
 * it prints ("The area of the square is: " + test->squareArea()) END_METHOD.
 *
 * I create the public int FUNCTION squareArea():
 * the function returns this->side * this->side END_FUNCTION
 *
 * END_CLASS
 * ******************
 * 
 * FUNCTIONALITY TESTED:
 *  Attribute Declaration without the END_VARIABLE clause
 *  Private Final Attributes
 *  Dot notation using "this"
 *  In-line comments
 *  
 * 
 * DESIGN DECISSIONS:
 * 	END_VARIABLE is optional in order to code faster,
 * 		though its usage is recommended in the attribute section
 */

package test;
public class Test3 {
	private final int squareSide = 5;
	public static void main(String[] args) {
		Test3 test = new Test3();
		System.out.println("The area of the square is: "+test.squareArea());
	}
	public int squareArea(){
		return this.squareSide * this.squareSide;
	}
}

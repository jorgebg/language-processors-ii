/**
 * SSNL To Java
 * Test Number: 002
 * @author sohrab farzaneh
 * @version 1.0
 * 
 * ******************
 * SSNL CODE:
 * -- Print Attributes Test -!
 * I want to create a public CLASS Test2
 * 
 * the program shall define the VARIABLES int x, String strTest END_VARIABLE.
 *  
 * the program creates the CONSTRUCTOR Test2():
 * x = 42; strTest="The answer to the Ultimate Question of Life, The Universe, and Everything: " END_CONSTRUCTOR.
 *
 * it defines also the public static void METHOD main ( String[] args ):
 * the function declares the VARIABLE Test2 test = new Test2();
 * it must PRINT (test->strTest+test->x) END_METHOD
 *
 * END_CLAS 
 * ******************
 * 
 * FUNCTIONALITY TESTED:
 *  Attribute Declaration
 *  Constructor Declaration
 *  Value Assign to variables
 *  Usage of Classes as types
 *  Usage of the "new" operator
 *  Multiple elements (Variables, Constructor & Method)
 *  Nested dot notation
 *  
 *  Auxiliary connector "also"
 *  Different third person clauses ("it", "the function"...)
 *  First person sentences
 *  Modal verb usage
 * 
 * DESIGN DECISSIONS:
 * 	The third person subjects must be always LowerCase
 *	The dot notation has to be represented with "->"
 *  The last element of an enumeration must not have any connector ("." or ";")
 *  	E.g.: the function [...] = Test2();
 *  			it [...] ->x) 
 *  	The last element does not contain the ";", neither does END_METHOD with "."
 */
package test;
public class Test2 {
	int x;
	String strTest;
	Test2(){
		x=42;
		strTest="The answer to the Ultimate Question of Life, The Universe, and Everything: ";
	}
	public static void main(String[] args){
		Test2 test = new Test2();
		System.out.println(test.strTest+test.x);
	}
}

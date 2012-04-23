/**
 * SSNL To Java
 * Test Number: 001
 * @author sohrab farzaneh
 * @version 0.1
 * 
 * SSNL CODE:
 * I want to create a public CLASS TestSimpleOperation.
 * The machine shall be able to define a private VARIABLE int sum.
 * It must have a public CONSTRUCTOR TestSimpleOperation():
 * this->sum = 6 END_CONSTRUCTOR.
 * The program defines a public int METHOD getSum():
 * It returns this->sum END METHOD.
 * The program shall define a public static void METHOD main(String[] args)
 * I need to define the VARIABLE TestSimpleOperatin tso = new TestSimpleOperation();
 * I PRINT (7+tso->getSum()); END_METHOD. END_CLASS $$
 *
 * END_METHOD END_CLASS
 * 
 * FUNCTIONALITY TESTED:
 *  Class Declaration
 *  Method Declaration
 *  Variable output
 *  Value assign
 *  Method assign
 *  Class Creation
 *  Return declaration
 *  3rd Person Return
 *  
 *  N0 connector between a constructor and a Method
 *  
 *  Dot notation modification "->"
 *  
 *  Auxiliary Sentences
 *  Third person sentences
 *  Modal verb usage
 *  No natural language usage
 *  First capital letter after a N0 separator (".")
 *
 *DESIGN DECISIONS
 *	Possibility of having a lambda connector after a method
 *	Change the dot notation including the symbol: "->"
 *	Syntactical analyzer must determine if the str "sum" is a variable
 *
 *PROBLEMS FOUND
 *	The grammar might create expressions like 7++<4 or sum+!true The problem is simple_expression and complex_expression
 *
 */

package test;
public class TestSimpleOperation {
	private int sum;
	public TestSimpleOperation(){
		this.sum = 6;
	}
	public int getSum(){
		return this.sum;
	}
	public static void main(String[] args) {
		TestSimpleOperation tso = new TestSimpleOperation();
		System.out.println(7+tso.getSum());
	}

}

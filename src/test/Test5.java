/**
 * SSNL To Java
 * Test Number: 004
 * @author sohrab farzaneh
 * @version 1.0
 * 
 * ******************
 * SSNL CODE:
 * -- Multidimensional Arrays, Loop statements, Array initialization -!
 *
 * I need to create the public CLASS Test5.
 * --END_VARIABLES is optional, but recommended in the attribute list to define its range -!
 * it needs to define the public VARIABLE int[][] multiArray END_VARIABLES.
 *
 * I need to create the public CONSTRUCTOR Test5():
 * multiArray = new int[5][5] END_CONSTRUCTOR.
 *
 * I need to define the public static void METHOD main (String[] args):
 * it defines the VARIABLE int i = 0, int j =0, int count =0, Test5 test = new Test5();
 * WHILE(i < test->multiArray->length)
 *	THEN WHILE(j < test->multiArray[i]->length)
 *		THEN test->multiArray[i][j] = ++count;
 *		increment j 
 *	END_WHILE;
 *	j equal 0;
 *	i++
 * END_WHILE END_METHOD
 *
 * END_CLASS
 * ******************
 * 
 * FUNCTIONALITY TESTED:
 *  Nested Loop statement (while)
 *  Array initialization
 *  pre-increment
 *  post-increment
 *  
 *  Language increment
 *  Natural language Assign (equal)
 *  
 * DESIGN DECISSIONS:
 * 	equal := "="
 * 	equals to := "=="
 */
package test;
public class Test5 {
	public int[][] multiArray;
	public Test5(){
		multiArray=new int[5][5];
	}
	public static void main(String[] args){
		int i = 0;
		int j =0;
		int count =0;
		Test5 test = new Test5();
		
		while(i < test.multiArray.length){
			while(j < test.multiArray[i].length){
				test.multiArray[i][j]=++count;
				j++;
			}
			i++;
			j=0;
		}
	}
}

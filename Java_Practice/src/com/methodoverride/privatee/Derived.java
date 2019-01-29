/**
 * 
 */
package com.methodoverride.privatee;

/**
 * @author Shankar
 *
 */
public class Derived extends Base {

	/**
	 * @param args
	 */
	private void fun() {
		System.out.println("Derived fun");
	}

	public static void main(String[] args) {
		Base obj = new Derived();
		//obj.fun();  // when compiler reach to this line then it throwing an compil time eeor

		// even this is basic concept  rule, if you declaring anything private then it's available in class itself.

		// in case of inheritance the valid access specifier is protected or public
	}
}

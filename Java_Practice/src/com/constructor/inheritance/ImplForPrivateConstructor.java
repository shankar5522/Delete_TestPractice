/**
 * 
 */
package com.constructor.inheritance;

/**
 * @author Shankar
 * This class is used to check the whether calling private contructor without inheritance concept
 * because I am sure private constrcutor won't get call when it comes to inheritance concept
 *
 */
public class ImplForPrivateConstructor extends Parent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// the below only call the private controctor becuase they are in the same class. However it won't 
		// call the private constructor in some other class.

		//new Parent(100.500);

		//new Parent("Shankar");
	}

}

package a1.tests;

import static org.junit.Assert.*;

import org.junit.Test;


import a1.Customer;

public class CustomerTests {
	

	/**
	 * this method checks Customer First Name 
	 */
	@Test
	public void createCustomerFirstNameCorrect(){
		assertTrue(new Customer("Hans","Müller").equals("Hans"));
	}
	
	/**
	 * this method checks Customer Last Name 
	 */
	@Test
	public void createCustomerLastNameCorrect(){
		assertTrue(new Customer("Hans","Müller").getNachname().equals("Müller"));
	}
	
	/**
	 * this method checks Customer ID 
	 */
	@Test
	public void isIdNotEqual(){
		assertFalse(new Customer("Fritz","Schneider").getId().equals(new Customer("Lisa","Wagner").getId()));
	} 

}

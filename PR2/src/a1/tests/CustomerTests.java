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
		assertTrue(new Customer("Hans","M�ller").equals("Hans"));
	}
	
	/**
	 * this method checks Customer Last Name 
	 */
	@Test
	public void createCustomerLastNameCorrect(){
		assertTrue(new Customer("Hans","M�ller").getNachname().equals("M�ller"));
	}
	
	/**
	 * this method checks Customer ID 
	 */
	@Test
	public void isIdNotEqual(){
		assertFalse(new Customer("Fritz","Schneider").getId().equals(new Customer("Lisa","Wagner").getId()));
	} 
	
	/**
	 * this method checks wether First Name can be updated 
	 */
	@Test
	public void firstNameCanBeUpdated(){
		Customer c = new Customer("Hanz","FirstNameIsWrongBuddy");
		c.setVorname("John");
		assertTrue(c.getVorname().equals("John"));
	}
	
	//pr�fen ob nachname aktualisiert werden kann
	
	//pr�fen ob kunde mit gleichen attributen = gleicher hashcode
	
	//pr�fen ob kunde mit gleichen attributen = equals true
	
	//pr�fen ob kunde mit verschiedenen attributen = unterschiedlicher hashcode
	
	//pr�fen ob kunde mit verschiedenen attributen = equals false
	
	

}

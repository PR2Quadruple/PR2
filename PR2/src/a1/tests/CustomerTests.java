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
	
	/**
	 * this method checks wether First Name can be updated 
	 */
	@Test
	public void firstNameCanBeUpdated(){
		Customer c = new Customer("Hanz","FirstNameIsWrongBuddy");
		c.setVorname("John");
		assertTrue(c.getVorname().equals("John"));
	}
	
	//prüfen ob nachname aktualisiert werden kann
	
	//prüfen ob kunde mit gleichen attributen = gleicher hashcode
	
	//prüfen ob kunde mit gleichen attributen = equals true
	
	//prüfen ob kunde mit verschiedenen attributen = unterschiedlicher hashcode
	
	//prüfen ob kunde mit verschiedenen attributen = equals false
	
	

}

package a1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebShop {
	
	List<Customer> list;
	
	/**
	 * An instance of WebShop
	 */
	public WebShop(){
		list = new ArrayList<Customer>();
	}
	
	public void addCustomer(String vorname,String nachname){
		addCustomer(createCustomerInstance(vorname,nachname));
	}
	
	/**
	 * If customer is not in list, customer is being added. Else request is ignored
	 * @param customer The customer to be added
	 * 
	 */
	private void addCustomer(Customer customer) {
		if(!isCustomerInList(customer)){
			list.add(customer);
		}	
	}

	public void removeCustomer(String vorname, String nachname){
		removeCustomer(createCustomerInstance(vorname,nachname));
	}
	
	private void removeCustomer(Customer customer) {
		list.remove(customer);
	}
	
	public boolean isCustomerInList(String vorname, String nachname){
		return isCustomerInList(createCustomerInstance(vorname,nachname));
	}

	private boolean isCustomerInList(Customer customer) {
		return list.contains(customer);
	}

	private Customer createCustomerInstance(String vorname, String nachname){
		return new Customer(vorname,nachname);
	}
	
	public String sortCustomersByLastNameFirstName(){
		String sortedList = "";
		Collections.sort(list,new Comparator<Customer>(){
			@Override
			public int compare(Customer c1, Customer c2) {
				if(c1.getNachname().equals(c2.getNachname())){
					return c1.getVorname().compareTo(c2.getVorname());
				}
				else
					return c1.getNachname().compareTo(c2.getNachname());
			}
		});
		for(Customer c:list){
		sortedList = sortedList + c.toString();	
		}
		return sortedList;
	}
	
	public String sortCustomersByID(){
		String sortedList = "";
		Collections.sort(list,new Comparator<Customer>(){

			@Override
			public int compare(Customer c1, Customer c2) {
					return c1.getId().compareTo(c2.getId());
			}
			
		});
		for(Customer c:list){
		sortedList = sortedList + c.toString();	
		}
		return sortedList;
	}


}

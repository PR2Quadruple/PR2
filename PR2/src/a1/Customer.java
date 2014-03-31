package a1;

/**
 * 
 * @author PR2Couple
 *
 */

public class Customer { 
	
	private Integer id;
	private String vorname;
	private String nachname;
	
	private static int idcounter = 0;
	
	/**
	 * A standard customer with empty values
	 */
	public Customer(){
		id = createID();
	}
	
	/** (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

	/**
	 * A customer with first and last name
	 * @param firstName
	 * @param lastName
	 */
	public Customer(String firstName, String lastName){
		this();
		setVorname(firstName);
		setNachname(lastName);
	}
	
	/**
	 * @return The id of the customer
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the first name of the customer
	 */
	public String getVorname() {
		return vorname;
	}
	/**
	 * @param vorname The vorname
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	/**
	 * @return The Nachname
	 */
	public String getNachname() {
		return nachname;
	}
	/**
	 * @param nachname Nachname
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	/**
	 * @return a new value for id
	 */
	private int createID(){
		return ++idcounter;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", vorname=" + vorname + ", nachname="
				+ nachname + "]";
	}
	
	
	
	
}

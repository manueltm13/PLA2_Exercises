package com.cifo.clases;

/**
 * 	
 * @author manuel
 */
public class Customer implements Expressions{
	private String name;
	private String email;
	private String type;
	
	public Customer() {
		setName("");
		setEmail("");
		setType("");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "[name: " + getName() + ", email: " + getEmail() + ", type: " + getType() + "]";
	}

	@Override
	public String salutation() {
		return "Dear " + getName();
	}

}

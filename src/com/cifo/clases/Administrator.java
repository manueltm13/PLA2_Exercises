package com.cifo.clases;

/**
 * 	
 * @author manuel
 */
// It's enough to declare that the super-class implements the interface Expressions. 
// The sub-class will implement it implicitly without declaring that it implements it.
// https://stackoverflow.com/a/31261936
public class Administrator extends Employer{
	private String section;
	
	public Administrator(String name, String dni) throws IllegalArgumentException {
		super(name, dni);
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "[name: " + getName() + ", dni: " + getDni() + ", section: " + getSection() + 
				", grossSalary: " + getGrossSalary() + ", netSalary: " + getNetSalary() + "]";
	}

	@Override
	public String salutation() {
		return "Dear Administrator";
	}

}

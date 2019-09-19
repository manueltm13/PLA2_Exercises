package com.cifo.clases;

public class Administrator extends Employer {
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

}

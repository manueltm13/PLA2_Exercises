package com.cifo.clases;

public class Manager extends Employer {
	private String department;
	private int diets;
	
	public Manager(String name, String dni) throws IllegalArgumentException {
		super(name, dni);
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the diets
	 */
	public int getDiets() {
		return diets;
	}

	/**
	 * @param diets the diets to set
	 */
	public void setDiets(int diets) {
		this.diets = diets;
	}

	@Override
	public float getNetSalary() {
		return super.getNetSalary() + getDiets();
	}

	@Override
	public String toString() {
		return "[name: " + getName() + ", dni: " + getDni() + ", department: " + 
				getDepartment() + ", diets: " + getDiets() + ", grossSalary: " + 
				getGrossSalary() + ", netSalary: " + getNetSalary() + "]";
	}

}

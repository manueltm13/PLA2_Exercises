package com.cifo.clases;

public class Director extends Employer {
	private int stockOptions;
	
	public Director(String name, String dni) throws IllegalArgumentException {
		super(name, dni);
	}

	/**
	 * @return the stockOptions
	 */
	public int getStockOptions() {
		return stockOptions;
	}

	/**
	 * @param stockOptions the stockOptions to set
	 */
	public void setStockOptions(int stockOptions) {
		this.stockOptions = stockOptions;
	}

	@Override
	public float getNetSalary() {
		return super.getNetSalary() + (getStockOptions() * 0.1f);
	}

	@Override
	public String toString() {
		return "[name: " + getName() + ", dni: " + getDni() + ", stockOptions: " + 
				getStockOptions() + ", grossSalary: " + getGrossSalary() + 
				", netSalary: " + getNetSalary() + "]";
	}

}

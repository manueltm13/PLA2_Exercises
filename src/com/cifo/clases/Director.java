package com.cifo.clases;

/**
 *
 * @author manuel
 */
// It's enough to declare that the super-class implements the interface Expressions. 
// The sub-class will implement it implicitly without declaring that it implements it.
// https://stackoverflow.com/a/31261936
public class Director extends Employee {

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
        return "[name: " + getName() + ", dni: " + getDni() + ", stockOptions: "
                + getStockOptions() + ", grossSalary: " + getGrossSalary()
                + ", netSalary: " + getNetSalary() + "]";
    }

    @Override
    public String salutation() {
        return "Dear Director";
    }

}

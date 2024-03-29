package com.cifo.clases;

/**
 *
 * @author manuel
 */
// It's enough to declare that the super-class implements the interface. 
// The sub-class will implement it implicitly without declaring that it implements it.
// https://stackoverflow.com/a/31261936
public class Employee implements Expressions {

    private String name;
    private String dni;
    private float grossSalary;

    // Without the default constructor, name and DNI are required.
    ///**
    // * Default constructor
    // */
    //public Employee() {
    //	setName("");
    //	setDni("");
    //	setGrossSalary(0);
    //}
    /**
     * Constructor with name and DNI. Without the default constructor, name and
     * DNI are required.
     *
     * @param name
     * @param dni
     * @throws IllegalArgumentException Where name or DNI are null or blank
     */
    public Employee(String name, String dni) throws IllegalArgumentException{
        if (name == null)
            throw new IllegalArgumentException("The name is null");
        else if (name.isBlank())
            throw new IllegalArgumentException("The name is blank");
        if (dni == null)
            throw new IllegalArgumentException("The DNI is null");
        else if (dni.isBlank())
            throw new IllegalArgumentException("The DNI is blank");
        else {
            setName(name.trim());
            setDni(dni.trim());
            setGrossSalary(0);
        }
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return The dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni The dni to set
     */
    public final void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return The grossSalary
     */
    public float getGrossSalary() {
        return grossSalary;
    }

    /**
     * @param grossSalary The grossSalary to set
     */
    public final void setGrossSalary(float grossSalary) {
        if (grossSalary < 0)
            this.grossSalary = 0;
        else
            this.grossSalary = Math.round(grossSalary * 100f) / 100f;
    }
	
    /**
     * @return The net salary
     */
    public float getNetSalary() {
        return Math.round(getGrossSalary() * getIRPF() * 100f) / 100f;
    }

    /**
     * @return The % for net salary calculation
     */
    public float getIRPF() {
        if (getGrossSalary() < 3000)
            return .85f;
        else
            return .75f;
    }
	
    @Override
    public String toString() {
        return "[name: " + getName() + ", dni: " + getDni() + ", grossSalary: " + getGrossSalary() + ", netSalary: " + getNetSalary() + "]";
    }

    @Override
    public String salutation() {
        return "Dear " + getName();
    }

}

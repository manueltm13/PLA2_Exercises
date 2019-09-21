package com.cifo.clases;

public class Program {

    public static void main(String[] args) {
        // Employer employer1 = new Employer(); Compilation error

        //employer1.setName("Manuel");
        //employer1.setDni("99999999X");
        Employer employer1 = new Employer("Manuel", "99999999X");
        System.out.println(employer1.toString() + "\n");

        // Salary
        employer1.setGrossSalary(-.010f);
        if (employer1.getGrossSalary() == 0 && employer1.getNetSalary() == 0)
            System.out.println("GrossSalary -.010f Ok");
        else
            System.out.println("GrossSalary -.010f, 0, 0: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.99f);
        if (employer1.getGrossSalary() == 1000.99f && employer1.getNetSalary() == 850.84f)
            System.out.println("GrossSalary 1000.99f Ok");
        else
            System.out.println("GrossSalary 1000.99f, 1000.99, 850.84: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.004f);
        if (employer1.getGrossSalary() == 1000.00f && employer1.getNetSalary() == 850.00f)
            System.out.println("GrossSalary 1000.004f Ok");
        else
            System.out.println("GrossSalary 1000.004f, 1000.00, 850.00: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.005f);
        if (employer1.getGrossSalary() == 1000.01f && employer1.getNetSalary() == 850.01f)
            System.out.println("GrossSalary 1000.005f Ok");
        else
            System.out.println("GrossSalary 1000.005f, 1000.01, 850.01: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.024f);
        if (employer1.getGrossSalary() == 1000.02f && employer1.getNetSalary() == 850.02f)
            System.out.println("GrossSalary 1000.024f Ok");
        else
            System.out.println("GrossSalary 1000.024f, 1000.02, 850.02: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.025f);
        if (employer1.getGrossSalary() == 1000.03f && employer1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.025f Ok");
        else
            System.out.println("GrossSalary 1000.025f, 1000.03, 850.03: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.034f);
        if (employer1.getGrossSalary() == 1000.03f && employer1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.034f Ok");
        else
            System.out.println("GrossSalary 1000.034f, 1000.03, 850.03: " + employer1.toString() + " ¡¡¡ Ko !!!");

        employer1.setGrossSalary(1000.035f);
        if (employer1.getGrossSalary() == 1000.04f && employer1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.035f Ok");
        else
            System.out.println("GrossSalary 1000.035f, 1000.04, 850.03: " + employer1.toString() + " ¡¡¡ Ko !!!");

        // IRPF
        employer1.setGrossSalary(3000f);
        if (employer1.getGrossSalary() == 3000f && employer1.getNetSalary() == 2250f)
            System.out.println("GrossSalary 3000f Ok");
        else
            System.out.println("GrossSalary 3000f, 3000, 2250: " + employer1.toString() + " ¡¡¡ Ko !!!");

        try {
            Employer e1 = new Employer(null, "99999999X"); // Exception null name
            System.out.println("Name null: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employer e1 = new Employer("", "99999999X"); // Exception blank name
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employer e1 = new Employer("  ", "99999999X"); // Exception blank name
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employer e1 = new Employer("Manuel   ", null); // Exception null DNI
            System.out.println("Name null: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employer e1 = new Employer("Manuel   ", ""); // Exception blank DNI
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employer e1 = new Employer("Manuel   ", "   "); // Exception blank DNI
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        Employer emp = new Employer("Employer name", "99999999X");
        emp.setGrossSalary(4000);
        System.out.println(emp.salutation());
        System.out.println(emp);

        Administrator adm = new Administrator("Administrator name", "99999999X");
        adm.setGrossSalary(4000);
        adm.setSection("adm section");
        System.out.println(adm.salutation());
        System.out.println(adm);

        Manager man = new Manager("Manager name", "99999999X");
        man.setGrossSalary(5000);
        man.setDiets(1000);
        man.setDepartment("man department");
        System.out.println(man.salutation());
        System.out.println(man);

        Director dir = new Director("Director name", "99999999X");
        dir.setGrossSalary(5000);
        dir.setStockOptions(10000);
        System.out.println(dir.salutation());
        System.out.println(dir);

        Customer cus = new Customer();
        cus.setName("Customer name");
        cus.setEmail("customer@email");
        cus.setType("Customer type");
        System.out.println(cus.salutation());
        System.out.println(cus);
    }

}

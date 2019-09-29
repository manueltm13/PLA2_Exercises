package com.cifo.clases;

public class Program {

    public static void main(String[] args) {
        // Employee employee1 = new Employee(); Compilation error

        //employee1.setName("Manuel");
        //employee1.setDni("99999999X");
        Employee employee1 = new Employee("Manuel", "99999999X");
        System.out.println(employee1.toString() + "\n");

        // Salary
        employee1.setGrossSalary(-.010f);
        if (employee1.getGrossSalary() == 0 && employee1.getNetSalary() == 0)
            System.out.println("GrossSalary -.010f Ok");
        else
            System.out.println("GrossSalary -.010f, 0, 0: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.99f);
        if (employee1.getGrossSalary() == 1000.99f && employee1.getNetSalary() == 850.84f)
            System.out.println("GrossSalary 1000.99f Ok");
        else
            System.out.println("GrossSalary 1000.99f, 1000.99, 850.84: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.004f);
        if (employee1.getGrossSalary() == 1000.00f && employee1.getNetSalary() == 850.00f)
            System.out.println("GrossSalary 1000.004f Ok");
        else
            System.out.println("GrossSalary 1000.004f, 1000.00, 850.00: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.005f);
        if (employee1.getGrossSalary() == 1000.01f && employee1.getNetSalary() == 850.01f)
            System.out.println("GrossSalary 1000.005f Ok");
        else
            System.out.println("GrossSalary 1000.005f, 1000.01, 850.01: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.024f);
        if (employee1.getGrossSalary() == 1000.02f && employee1.getNetSalary() == 850.02f)
            System.out.println("GrossSalary 1000.024f Ok");
        else
            System.out.println("GrossSalary 1000.024f, 1000.02, 850.02: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.025f);
        if (employee1.getGrossSalary() == 1000.03f && employee1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.025f Ok");
        else
            System.out.println("GrossSalary 1000.025f, 1000.03, 850.03: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.034f);
        if (employee1.getGrossSalary() == 1000.03f && employee1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.034f Ok");
        else
            System.out.println("GrossSalary 1000.034f, 1000.03, 850.03: " + employee1.toString() + " ¡¡¡ Ko !!!");

        employee1.setGrossSalary(1000.035f);
        if (employee1.getGrossSalary() == 1000.04f && employee1.getNetSalary() == 850.03f)
            System.out.println("GrossSalary 1000.035f Ok");
        else
            System.out.println("GrossSalary 1000.035f, 1000.04, 850.03: " + employee1.toString() + " ¡¡¡ Ko !!!");

        // IRPF
        employee1.setGrossSalary(3000f);
        if (employee1.getGrossSalary() == 3000f && employee1.getNetSalary() == 2250f)
            System.out.println("GrossSalary 3000f Ok");
        else
            System.out.println("GrossSalary 3000f, 3000, 2250: " + employee1.toString() + " ¡¡¡ Ko !!!");

        try {
            Employee e1 = new Employee(null, "99999999X"); // Exception null name
            System.out.println("Name null: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employee e1 = new Employee("", "99999999X"); // Exception blank name
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employee e1 = new Employee("  ", "99999999X"); // Exception blank name
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employee e1 = new Employee("Manuel   ", null); // Exception null DNI
            System.out.println("Name null: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employee e1 = new Employee("Manuel   ", ""); // Exception blank DNI
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        try {
            Employee e1 = new Employee("Manuel   ", "   "); // Exception blank DNI
            System.out.println("Name blank: " + e1.toString() + " ¡¡¡ Ko !!!");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + " Ok");
        } catch (Exception ex) {
            System.out.println(ex + " ¡¡¡ Ko !!!");
        }

        Employee emp = new Employee("Employee name", "99999999X");
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

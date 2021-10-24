package com.ifsp;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Joao",77,5000.00,"Dev Mobile");
        Employee emp2 = new Employee("Maria", 28, 3000,"It analyst");
        Employee emp3 = new Employee("Karina", 29, 8000,"IA");

        Departament dep1 = new Departament("Automação",1,"Estação 33", 99999999, 12345);
        Departament dep2 = new Departament("IA",2,"Estação 33", 8888888, 12345);
        Departament dep3 = new Departament("Data Science", 3, "Estacao 33", 7777777, 54321);

        emp1.setDept(dep1);

        dep1.addEmployed(emp1);
        dep1.addEmployed(emp2);
        dep1.addEmployed(emp3);

        dep1.removeEmployed(28);

        //soutv
        System.out.println("dep1.sizeOfEmployees() = " + dep1.sizeOfEmployees());
        System.out.println("dep1.getEmployee(29) = " + dep1.getEmployee(29));
        System.out.println(dep1.getEmployeesAsString());
/*

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);


        System.out.println("\nColaborador(a): " + emp1.getName() + "\nSalário anual: " + emp1.getAnnualSalary());
        System.out.println("\nColaborador(a): " + emp2.getName() + "\nSalário anual: " + emp2.getAnnualSalary());
        System.out.println("\nColaborador(a): " + emp3.getName() + "\nSalário anual: " + emp3.getAnnualSalary());
*/



    }
}

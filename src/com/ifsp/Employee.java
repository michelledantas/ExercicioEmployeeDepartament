package com.ifsp;

public class Employee {
    private String name;
    private long id;
    private double salary;
    private String jobTitle;
    private Departament dept;
    private Departament deptInCharge;

    //construtores
    public Employee(String name, long id, double salary, String jobTitle) {
        this (name, id, salary, jobTitle, null, null);
    }

    public Employee() {
    }

    public Employee(String name, long id, double salary, String jobTitle, Departament dept, Departament deptInCharge) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.dept = dept;
        this.deptInCharge = deptInCharge;
    }

    //getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Departament getDept() {
        return dept;
    }

    public void setDept(Departament dept) {
        this.dept = dept;
    }

    public Departament getDeptInCharge() {
        return deptInCharge;
    }

    public void setDeptInCharge(Departament deptInCharge) {
        this.deptInCharge = deptInCharge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                ", Departamento: '" + (dept==null?"--": dept.getName()) + '\'' +
                ", Departamento responsável: " + (deptInCharge==null?"--": deptInCharge.getName()) +
                '}';
    }

    public Double getAnnualSalary(){
        return getSalary()*12;
    }
}

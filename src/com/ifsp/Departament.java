package com.ifsp;

public class Departament {

    public static final int MAX_STAFF = 5;
    private String name;
    private int code;
    private String location;
    private int phoneExtenton;
    private double budget; //despesas
    private Employee[] staff = new Employee[MAX_STAFF];
    private int numberOfEmployees; //contador
    private Employee chief;


    public Departament(String name, int code, String location, int phoneExtenton, double budget) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtenton = phoneExtenton;
        this.budget = budget;
    }

    public Departament(String name, int code, String location, int phoneExtenton, double budget, Employee[] staff, Employee chief) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.phoneExtenton = phoneExtenton;
        this.budget = budget;
        this.staff = staff;
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", location='" + location + '\'' +
                ", phoneExtenton=" + phoneExtenton +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    public int getPhoneExtenton() {
        return phoneExtenton;
    }

    public double getBudget() {
        return budget;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public Employee getChief() {
        return chief;
    }


    public void addEmployed(Employee e){
        if (numberOfEmployees==MAX_STAFF-1) return;
        staff[numberOfEmployees++] = e;
    }

    public void removeEmployed(Employee e){
        removeEmployed(e.getId());
    }

    public void removeEmployed(long id){
        for (int i = 0; i < numberOfEmployees-1; i++) {
            if (staff[i].getId() == id){
                staff[i] = staff[i+1];
            }
        }
        numberOfEmployees--;
    }


    //TODOS OS EMPREGADOS
    public String getEmployeesAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfEmployees; i++) {
            sb.append(staff[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    public int sizeOfEmployees(){
        return numberOfEmployees;
    }

    public Employee getEmployee (long id ){
        for (int i = 0; i < numberOfEmployees; i++) {
            if(staff[i].getId() ==id)
                return staff[i];
        }
        return null;
    }
}

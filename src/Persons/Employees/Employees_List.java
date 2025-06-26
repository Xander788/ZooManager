/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import List.List;

/**
 *
 * @author Student
 */
public class Employees_List implements List <Employee> {
    
    private Employee employees[];
    
    public Employees_List(){
        this.employees = new Employee[100];
    }
    
    @Override
    public boolean add(Employee t) {
        int max = employees.length;
        for (int i = 0; i < max; i++) {
            if (employees[i]==null) {
                employees[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Employee t) {
        int max = employees.length;
        for (int i = 0; i < max; i++) {
            if (employees[i]==t) {
                employees[i]=null;
                return true;
            }
        }
        return false;
    }

    /*@Override*/
    public Object find(Employee id) {  
        int max = employees.length;
        for (int i = 0; i < max; i++) {
            if(employees[i].getId().equals(id.toString())){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public void showall() {
        int max = employees.length;
        for (int i = 0; i < max; i++) {
            if(employees[i] != null){
                employees[i].toString();
            }
        }
    }
    
}

package com.company.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite ma hast in class
public class CompanyDirectory implements Employee {
    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public void showDetails() {

        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

    public void addEmployees(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployees(Employee emp) {
        employees.remove(emp);
    }
}

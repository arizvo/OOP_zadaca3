package com.aldinrizvo.qamp.oophomework3.task1;

public class Employee extends Person {
    private final double annualSalary;
    private final String nationalInsuranceNumber;

    public Employee(final String name, final double annualSalary, final String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + annualSalary + ", insurance number: " + nationalInsuranceNumber;
    }
}

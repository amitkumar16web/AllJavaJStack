package com.a2;

import java.time.LocalDate;

interface OrgMethods {
public void acceptEmployeeDetails();
public void calSalary();
}

class Address {
private String street;
private String city;
private String state;


public Address() {
	street="";
	city="";
	state="";

}
public Address(String street, String city, String state) {

this.street = street;
this.city = city;
this.state = state;
}
public String getStreet() {
return street;
}
public void setStreet(String street) {
this.street = street;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
@Override
public String toString() {
return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
}


}

class DateOfBirth {
private LocalDate dob;


public DateOfBirth() {
super();
}

DateOfBirth(LocalDate dob) {
super();
this.dob = dob;
}

public LocalDate getDob() {
return dob;
}

public void setDob(LocalDate dob) {
this.dob = dob;
}

@Override
public String toString() {
return "DateOfBirth [dob=" + dob + "]";
}

}



class Employee{
private int empId;
private String name;
private double salary;

private Address address;
private DateOfBirth dateOfBirth;

public Employee() {
this.empId = 0;
this.name = "";
this.salary = 0;
this.address = new Address();
this.dateOfBirth = new DateOfBirth();
}
public Employee(int empId, String name, double salary, Address address, DateOfBirth dateOfBirth) {
this.empId = empId;
this.name = name;
this.salary = salary;
this.address = address;
this.dateOfBirth = dateOfBirth;
}



public int getEmpId() {
return empId;
}
public void setEmpId(int empId) {
this.empId = empId;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public DateOfBirth getDateOfBirth() {
return dateOfBirth;
}
public void setDateOfBirth(DateOfBirth dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}
@Override
public String toString() {
return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
+ ", dateOfBirth=" + dateOfBirth + "]";
}



}

class SalesEmployee extends Employee implements OrgMethods{
public SalesEmployee() {
super();
this.sale = 0;
}
public SalesEmployee(int empId, String name, double salary,
int sale, Address address, DateOfBirth dateOfBirth) {
super(empId, name, salary, address, dateOfBirth);
this.sale = sale;
}



@Override
public void acceptEmployeeDetails() {


}
@Override
public void calSalary() {
double netSalary = 0;
double comm = 0;
if(this.sale < 5000) {
comm = super.getSalary() * 0.002;
}else if(this.sale >= 5000 & this.sale < 7000) {
comm = super.getSalary() * 0.005;
}else if(this.sale >= 7000 & this.sale < 10000) {
comm = super.getSalary() * 0.007;
}else if(this.sale >= 10000) {
comm = super.getSalary() * 0.010;
}

netSalary= super.getSalary() + comm;
System.out.println("Salary : " + netSalary);
}



private int sale;

public int getSale() {
return sale;
}
public void setSale(int sale) {
this.sale = sale;
}


@Override
public String toString() {
return "SalesEmployee [sale=" + sale + "]";
}

}

class WageEmployee extends Employee implements OrgMethods{
private int noOfWorkingHrs;
private int day;
private String month;
private int year;

public WageEmployee() {
super();
this.noOfWorkingHrs = 0;
this.day = 0;
this.month = "";
this.year = 0;

}
public WageEmployee(int empId, String name, double salary,
int sale, Address address, DateOfBirth dateOfBirth, int noOfWorkingHrs,
int day, String month, int year) {
super(empId, name, salary, address, dateOfBirth);
this.noOfWorkingHrs = noOfWorkingHrs;
this.day =day;
this.month = month;
this.year = year;
}



@Override
public void acceptEmployeeDetails() {
}

@Override
public void calSalary() {

int workingDays = 28;
double perDaySalary, perHrsSalary, totalSal;
if(month.equalsIgnoreCase("Jan") || month.equalsIgnoreCase("Mar")) {
workingDays = 31;
}
if(month.equalsIgnoreCase("Apr") || month.equalsIgnoreCase("Jun")) {
workingDays = 30;
}

perDaySalary = super.getSalary() / workingDays;
perHrsSalary = perDaySalary / 8;

totalSal = (perHrsSalary * this.noOfWorkingHrs) * workingDays;

System.out.println("Total Salary: " + totalSal);
}


public int getNoOfWorkingHrs() {
return noOfWorkingHrs;
}
public void setNoOfWorkingHrs(int noOfWorkingHrs) {
this.noOfWorkingHrs = noOfWorkingHrs;
}
public int getDay() {
return day;
}
public void setDay(int day) {
this.day = day;
}
public String getMonth() {
return month;
}
public void setMonth(String month) {
this.month = month;
}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
@Override
public String toString() {
return "WageEmployee [noOfWorkingHrs=" + noOfWorkingHrs + ", day=" + day + ", month=" + month + ", year=" + year
+ "]";
}




}

public class MainClass {

public static void main(String[] args) {
SalesEmployee saleEmployee = new SalesEmployee
(1, "A", 12000, 7000, new Address("new street", "Aligarh", "UP"),
new DateOfBirth(LocalDate.parse("1995-11-01")));

saleEmployee.calSalary();

WageEmployee wageEmployee = new WageEmployee
(2, "B", 12000, 7000, new Address("old street", "Aligarh", "UP"),
new DateOfBirth(LocalDate.parse("1993-11-01")), 13, 3, "Jan", 2020);

wageEmployee.calSalary();



}
}


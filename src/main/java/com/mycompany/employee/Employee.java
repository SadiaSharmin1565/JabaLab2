package com.mycompany.employee;

public class Employee {
    
    private String name;
    private int age;
    private String designation;
    private double salary;

    private static String company_name="EWCL";
    private static String company_address="Panthapath,Dhaka";
    private static int employeecount=0;

    public Employee(String name,int age,String designation,double salary){
       this.name=name;
       this.age=age;
       this.designation=designation;
       this.salary=salary;
       employeecount++;
    }
    
    public void displayemployeedetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
        System.out.println("Company Name:"+company_name);
        System.out.println("Company Address:"+company_address);
    
    }
    
    public static void displayemptotal(){
        System.out.println("Total Employee:"+ employeecount);
      
    }
    
    
    public static void main(String[] args) {
        Employee E1=new Employee("Ayaat",45,"Manager",50000);
        Employee E2=new Employee("Liyana",30,"Executive",30000);
        Employee E3=new Employee("Lisan",24,"Receptionist",20000);
        E1.displayemployeedetails();
        E2.displayemployeedetails();
        E3.displayemployeedetails();
        
        Employee.displayemptotal();
      
    }
}

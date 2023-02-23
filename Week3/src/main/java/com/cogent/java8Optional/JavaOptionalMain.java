package com.cogent.java8Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
public class JavaOptionalMain {
 
    public static void main(String[] args)
    {
        List<Employee> employeeList = createEmployeeList();
        Optional<Employee> employeeOpt = findEmployee(employeeList,"Gar1y");
        System.out.println("all goes correct even numm info comes");
        //A container object which may or may not contain a non-null value.
        if(employeeOpt.isPresent())
        {
            Employee employee = employeeOpt.get();
            System.out.println("Employee name: "+employee.getName());
        }
        else
        {
            System.out.println("There is no employee with name Adam");
        }
    }
 
    public static Optional<Employee> findEmployee(List<Employee> employeeList,String name)
    {
        for(Employee e:employeeList)
        {
            if(e.getName().equalsIgnoreCase(name))
            {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }
    public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",22);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
    }
}
 

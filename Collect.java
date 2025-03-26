// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Employee{
    int empID;
    String empName;
    double empSalary;
    Employee(int id, String name, double salary){
        this.empID=id;
        this.empName=name;
        this.empSalary=salary;
    }
    
    @Override
    public String toString(){
        return "{"+empID+ "," +empName+ "," +empSalary+"}";
    }
}
class SortByName implements Comparator<Employee>{
    @Override
    public int compare(Employee a, Employee b){
        //return a.empSalary.compareTo(b.empSalary);
        return Double.compare(a.empSalary,b.empSalary);
    }
}
class Main {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(2,"fedrick",500000));
        list.add(new Employee(3,"arreckal",400000));
        list.add(new Employee(7, "ctira",700000));
        list.add(new Employee(1,"1 king sury",100000));
        System.out.println(list);
        //list.sort(new SortByName());
        list.sort((Employee a,Employee b)-> Integer.compare(a.empID,b.empID));
        System.out.println(list);
    }
}
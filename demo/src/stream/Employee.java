package Stream;

public class Employee implements  Comparable<Employee>{


    private int Id;
    String Emp_Name;
    long Salary;

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Emp_Name='" + Emp_Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(int id, String name, long salary)
    {
        this.Id =id;
        this.Emp_Name = name;
        this.Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        this.Salary = salary;
    }

    @Override
    public int compareTo(Employee emp1) {
        if(this.getSalary() > emp1.getSalary()){
            return -1;
        }else if(this.getSalary() < emp1.getSalary()){
            return 1;
        }
        return 0;
    }
}

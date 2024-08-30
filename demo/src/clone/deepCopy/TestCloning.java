package clone.deepCopy;

public class TestCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
       Department department = new Department(24,"IT");
       Employee original = new Employee(25,"Gunwant",department);

        Employee cloned = (Employee) original.clone();

        cloned.getDepartment().setName("Pharma");


        System.out.println("Original will ramain as it is "+original.getDepartment().getName());
        System.out.println(cloned.getDepartment().getName());

    }
}

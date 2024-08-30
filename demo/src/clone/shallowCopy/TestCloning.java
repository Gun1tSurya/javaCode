package clone.shallowCopy;

public class TestCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(24,"IT");
        Employee original = new Employee(25,"Gunwant",department);

        //Lets create a clone of original object
        Employee cloned = (Employee) original.clone();

        //Let's verify using employeeId, if cloning actually worked
        System.out.println(cloned.getEmployeeId());

        System.out.println(original != cloned);

        System.out.println(original.getClass() == cloned.getClass());

        System.out.println(original.equals(cloned));

        cloned.getDepartment().setName("Pharma");
        System.out.println(cloned.getDepartment().getName());
        System.out.println("Original object value also changed: "+original.getDepartment().getName());

    }
}

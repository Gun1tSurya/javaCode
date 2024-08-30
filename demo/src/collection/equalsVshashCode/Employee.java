package collection.equalsVshashCode;

import java.util.Objects;

public class Employee {

    private int registrationNo;

    public int getRegistrationNo() {
        return registrationNo;
    }

    public Employee(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return registrationNo == employee.registrationNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNo);
    }

}

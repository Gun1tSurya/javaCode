package file_IO.serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String type;
    private int no;

    public Vehicle(String type, int no) {
        this.type = type;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", no=" + no +
                '}';
    }
}

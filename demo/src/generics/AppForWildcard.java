package generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle<T>{
    private T vehicleId;

    public Vehicle(T vehicleId) {
        this.vehicleId = vehicleId;
    }

    public T getVehicleId() {
        return vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                '}';
    }
}

class Car extends Vehicle{
    private String carModel;

    public Car(Object vehicleId, String carModel) {
        super(vehicleId);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}


public class AppForWildcard {
    public static void main(String[] args) {
        List<Object> vehicleList = new ArrayList();
        vehicleList.add(new Vehicle(23));
        vehicleList.add(new Vehicle(33));
        vehicleList.add(new Vehicle(43));
        vehicleList.add(new Car(73,"Honda"));
        displayDate(vehicleList);

    }
    public static void displayDate(List<?> list){
        for(Object object:list){
            System.out.println(object);
        }
    }
}

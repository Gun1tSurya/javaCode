package collection.comparableVsComparator;

public class Laptop implements Comparable<Laptop>{

    private String brand;
    private int ram;
    private int price;

    public Laptop(String br, int rm, int pr) {
        this.brand = br;
        this.ram = rm;
        this.price = pr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laps) {
       /* obj1 > obj2 = positive
        obj1 < obj2 = negative
        obj1 == obj2 = zero*/

        if(this.price > laps.getPrice()){
            return 1;
        }
        else{
            return -1;
        }
    }
}

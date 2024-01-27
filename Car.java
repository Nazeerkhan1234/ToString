public class Car {
    int noOfWheel;
    int maxSpeed;
    String Company;

    public Car(int noOfWheel, int maxSpeed, String company) {
        this.noOfWheel = noOfWheel;
        this.maxSpeed = maxSpeed;
        Company = company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheel=" + noOfWheel +
                ", maxSpeed=" + maxSpeed +
                ", Company='" + Company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car mySwift = new Car(4,90,"Maruti");
        System.out.println(mySwift.toString());

    }
}

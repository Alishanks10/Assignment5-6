public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String colour;
    private final double price;
    private int gas;

    public Car(
            String brand,
            String model,
            int year,
            String colour,
            double price,
            int gas)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
        this.gas = gas;
    }

    public void honk(){
        System.out.println("Tuut tuut");
        System.out.println("Brand: " + this.brand +
                " Model: " + this.model +
                " Year: " + this.year +
                " Colour: " + this.colour +
                " Price: " + this.price +
                " Gas: " + this.gas);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "CR-V", 2023, "Red", 50000, 45);
        Car car2 = new Car("Ford", "F-150", 2020, "Black", 25000, 30);
        Car car3 = new Car("BMW", "X5", 2022, "Green", 60000, 65);
        Car car4 = new Car("Mazda", "CX-5", 2019, "White", 15000, 60);
        Car car5 = new Car("Audi", "Q7", 2018, "Silver", 52000, 47);
        Car car6 = new Car("Kia", "Forte", 2020, "Blue", 21000, 56);


        Car[] cars = {car1, car2, car3, car4, car5, car6};
        for(Car car: cars){
            car.honk();
            System.out.println();
        }

        for (int i = 1; i <= 7; i++)
        {
            System.out.println("\nRace turn: " + i + "\n-----------");

            for (Car car: cars)
            {
                int gasConsumption = 5 + (2023 - car.year);
                car.gas -= gasConsumption;
                System.out.println(car.brand + " has gas at turn " + i + ": " + car.gas);
            }
        }
    }
}

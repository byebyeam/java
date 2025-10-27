public class Main {
    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brend)) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int id = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brend)) {
                result[id]= car;
                id++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Car[] myCars = {
            new Car(1, "Lada", "Priora", 2014, "Silver", 300000, "A001AA"),
            new Car(2, "Toyota", "Mark II", 2007, "Cherry", 700000, "O777OO"),
            new Car(3, "Lada", "Granta", 2018, "White", 1200000, "M781KC")
        };

        String curBrand = "Lada";
        Car[] cars = getCarByBrend(myCars, curBrand);
        System.out.println("Find " + curBrand + "s : " + cars.length);

        for(Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }
}
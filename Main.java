public class Main {
    //getCarByBrend()
    public static Car[] getCarByBrend(Car[] cars, String brand) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int id = 0;
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result[id]= car;
                id++;
            }
        }
        
        return result;
    }

    //getCarByBrendAndYearOperational()
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brand, int years) {
        int count = 0;
        for (Car car : cars) {
            if (((2025 - car.getYear()) > years) & (car.getBrand().equals(brand))) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int id = 0;
        for (Car car : cars) {
            if (((2025 - car.getYear()) > years) & (car.getBrand().equals(brand))) {
                result[id] = car;
                id++;
            }
        }

        return result;
    }

    //tests
    public static void main(String[] args) {
        Car[] myCars = {
            new Car(1, "Lada", "Priora", 2014, "Silver", 300000, "A001AA"),
            new Car(2, "Toyota", "Mark II", 2007, "Cherry", 700000, "O777OO"),
            new Car(3, "Lada", "Granta", 2018, "White", 1200000, "M781KC")
        };
        //test 1
        String curBrand = "Lada";
        Car[] cars = getCarByBrend(myCars, curBrand);
        System.out.println("Find " + curBrand + "s : " + cars.length);

        for(Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        //test 2
        int curYears = 10;
        cars = getCarByBrendAndYearOperational(myCars, curBrand, curYears);
        System.out.println("Find " + curBrand + "s : " + cars.length);
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + ": Expluatation years = " + (2025 - car.getYear()));
        }
    }

}
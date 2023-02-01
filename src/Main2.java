import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

// use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("360 CIVIC HONDA", 2320);
        Car car2 = new Car("2022 New Car Model",2302);
        Car car3 = new Car("Train", 301);
        Car[] cars = {car1, car2, car3};
        ArrayList<Car> garage = new ArrayList(Arrays.asList(cars));
        System.out.println(garage);

    }
}

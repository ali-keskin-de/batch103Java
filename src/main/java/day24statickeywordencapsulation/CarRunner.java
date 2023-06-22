package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        // Static variable'lara Obje üzerinden ulaşmak mümkün ancak tavsiye edilm
        // Static variable'lara Class Üzerinden ulaşılması tavsiye edilir.
        System.out.println(car1.counter);// Tavsiye edimeyen ancak mümkün.
        System.out.println(Car.counter);// Tavsiye edilen
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }

}

package day26interface;

public class CarRunner {

    public static void main(String[] args) {
        Engine.stop();// stop() method'u static oldugundan interface ismi ile ulasabildik

        Honda h = new Honda();
        h.eco(); // Eco() (default) static olmadigindan "object" ismi ile ulastim.
        h.start();
    }

}

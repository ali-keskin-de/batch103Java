package day27interface;

public class Cat implements Mammal {
    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {

        // Interface'lerde variable cagrilirken interface ismi ile cagirin,
        // bu hem static variable  olmanin geregi, hem de kodun okurlulugu acisindan güzeldir.
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(age);

    }

}

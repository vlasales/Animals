import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Animal extends Object {

    static Animal azor = new Dog("Azor");

    public static void main(String []args) {
        System.out.println("Nazdar zvířata!");
        System.out.println(azor.hello());

        Animal minda = new Cat("Minda");
        Animal rybicka = new Animal("Doris");

        List<Animal> doma = new ArrayList<Animal>();
        doma.add(azor);
        doma.add(minda);
        doma.add(rybicka);
        
        Iterator<Animal> iter = doma.iterator();
        System.out.println();
        iter.next();
        iter.remove();
        iter.next();
        while (iter.hasNext()) {
            System.out.println(iter.next().feed() + " ");
        }
        
        System.out.println();
        for (Animal zvire : doma) {
            System.out.println(zvire.feed());
        }
    }

    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    
    String feed() {
        return name + ": " + "<silence>";
    }

    String hello() {
        return name + ": " + "<silence>";
    }
    
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    String hello() {
        return name + ": " + "Mňau!";
    }

    String feed() {
        return name + ": " + "Chci maso!";
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    String hello() {
        return name + ": " + "Haf!";
    }

    String feed() {
        return name + ": " + "Stačí mi granule";
    }
}

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Animal extends Object {

    // static Animal azor = new Dog("Azor");
    static Animal azor = null;

    public static void main(String []args) {
        System.out.println("Nazdar zvířata!");
        try {
            System.out.println(azor);
        } catch (NullPointerException e) {
            System.out.println("Nastala chyba " + e.getMessage());
        }
        Animal minda = new Cat("Minda");
        Animal rybicka = new Animal("Doris");
        
        List<Animal> doma = new ArrayList<Animal>();
        try {
            doma.add(azor);
//        } catch (NullPointerException e) {
//            System.out.println("Nastala chyba " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Nastala exception " + e.getMessage());
        }
        doma.add(minda);
        doma.add(rybicka);

        Map<String, Animal> names = new HashMap<String, Animal>();
        try {
            names.put("Azor", azor);
        } catch (Exception e) {
            System.out.println("Nastala exception " + e.getMessage());
        }
        names.put("Minda", minda);
        names.put("Doris", rybicka);
        
        try {
            System.out.println(names.get("Azor").hello());
        } catch (NullPointerException e) {
            System.out.println("Azor: " + e);
        } catch (Exception e) {
            System.out.println("Azor " + e);
        }
        System.out.println(names.get("Minda").hello());
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

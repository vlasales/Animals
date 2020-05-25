import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Animal {

    // static Animal azor = new Dog("Azor");
    static Animal azor = null;

    public static void main(String []args) {
        System.out.println("Nazdar zvířata!");
        try {
            System.out.println(azor);
        } catch (NullPointerException e) {
            System.out.println("Nastala chyba " + e.getMessage());
        }
        Animal minda = new Cat("Minda"); //immutability
        Animal doris = new Animal("Doris", 1);
        Animal korona = new Animal();
        
        System.out.println(minda.getName());
        System.out.println(minda.name);
        
        List<Animal> doma = new ArrayList<Animal>();
        try {
            doma.add(azor);
        } catch (NullPointerException e) {
            System.out.println("Nastala chyba NullPointer:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Nastala exception: " + e.getMessage());
        }
        doma.add(minda);
        doma.add(doris);

        Map<String, Animal> names = new HashMap<String, Animal>();
        try {
            names.put("Azor", azor);
        } catch (Exception e) {
            System.out.println("Nastala exception " + e.getMessage());
        }
        names.put("Minda", minda);
        names.put("Doris", doris);
        
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
    protected int age;

    public Animal() {
        System.out.print("Prázdný konstruktor: ");
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
    //    this.name = br.readLine();
    }

    public Animal(String name) {
        System.out.println("Krátký konstruktor: " + name);
        this.name = name;
    }
    
    public Animal(String name, int age) {
        System.out.println("Dlouhý konstruktor: " + name);
        System.err.println("Error konstruktor: " + name);
        this.name = name;
        this.age = age;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
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

import java.util.*;
public class CatRunner {
    public static void main(String[] args){
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Steve");
        Cat cat3 = new Cat("Jeff");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);
        Cat cat4 = new Cat("Raj");
        Cat oldCat = cats.set(2,cat4);
        System.out.println(cats);
        System.out.println(oldCat);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4.getName());
        System.out.println(cats);
        for(int i = 0; i < cats.size(); i++){
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}

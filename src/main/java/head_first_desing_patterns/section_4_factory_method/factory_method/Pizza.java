package head_first_desing_patterns.section_4_factory_method.factory_method;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void preparation(){
        System.out.println("Preparation: "+name);
        System.out.println("Kneading the dough");
        System.out.println("Adding sauce");
        System.out.println("Toppings:");
        toppings.forEach(System.out::println);
    }

    public void baking(){
        System.out.println("Baking: 25 minutes in 350 C degree");
    }

    public void cutting(){
        System.out.println("Cutting pizza into 8 slices");
    }

    public void packing(){
        System.out.println("Packing of pizza into our official pizza box");
    }

    public String getName() {
        return name;
    }
}

package head_first_desing_patterns.section_4_factory_method.abstract_factory;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Pastry pastry;
    Sauce sauce;
    Vegetables[] vegetables;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void preparation();

    public void baking(){
        System.out.println("Baking: 25 minutes in 180 C degree");
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pastry=" + pastry +
                ", sauce=" + sauce +
                ", vegetables=" + Arrays.toString(vegetables) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}

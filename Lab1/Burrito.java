public class Burrito {

    String size;
    String protein;
    String rice;
    String beans;
    String toppings;
    Boolean guac;

    public Burrito() {
        size = "small";
        protein = "no";
        rice = "no";
        beans = "no";
        toppings = "no";
        guac = false;
    }

    public Burrito(String size, String protein) {
        this.size = size;
        this.protein = protein;
        this.rice = "no";
        this.beans = "no";
        this.toppings = "no";
        this.guac = false;
    }

    Burrito(String size, String protein, String rice,
            String beans, String toppings, boolean guac) {
        this.size = size;
        this.protein = protein;
        this.rice = rice;
        this.beans = beans;
        this.toppings = toppings;
        this.guac = guac;
    }

    public String toString() {
        // size + protein + " Burrito with " + beans + " beans " + toppings +
        return this.size + this.protein + " Burrito with " + this.rice
                + this.beans + this.toppings + this.guac;

    }

}

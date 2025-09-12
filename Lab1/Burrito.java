public class Burrito {

    String size = "";
    String protein = "";
    String rice = "";
    String beans = "";
    String toppings = "";
    Boolean guac = false;

    public Burrito() {
        this.size = "small";
        this.protein = "none";
        this.rice = "none";
        this.beans = "none";
        this.toppings = "none";
        this.guac = false;
    }

    public Burrito(String size, String protein) {
        this.size = size;
        this.protein = protein;
        this.rice = "none";
        this.beans = "none";
        this.toppings = "none";
        this.guac = false;
    }
    public Burrito(String size, String protein, String rice, String beans, String toppings, Boolean guac) {
        this.size = size;
        this.protein = protein;
        this.rice = rice;
        this.beans = beans;
        this.toppings = toppings;
        this.guac = guac;
    }

    // Getters
    public String getRice() {
        if (this.rice == "none") {
            return("no rice ");
        } else {
            return(this.rice + " ");
        }
    }

    public String getSize() {
        if (this.size == "none") {
            return("small ");
        } else {
            return(this.size + " ");
        }
    }
    
    public String getProtein() {
        if (this.protein == "none") {
            return("no protein ");
        } else {
            return(this.protein + " ");
        }
    }

    public String getBeans() {
        if (this.beans == "none") {
            return("no beans ");
        } else {
            return(this.beans + " ");
        }
    }

    public String getToppings() {
        if (this.toppings == "none") {
            return("no toppings ");
        } else {
            return(this.toppings + " ");
        }
    }

    public String getGuac() {
        if (this.guac == false) {
            return("no guacamole ");
        } else {
            return("guacamole ");
        }
    }
    public double getCost() {
        double cost = 5.00;
        if (this.size == "large") {
            cost += 2.50;
        }
        if (this.protein == "chicken" || this.protein == "steak") {
            cost += 2.00;
        } else {
            cost += 3.00;
        }
        if (this.rice != "none") {
            cost += 1.00;
        }
        if (this.beans != "none") {
            cost += 1.00;
        }
        if (this.toppings != "none") {
            cost += 0.00;
        }
        if (this.guac == true) {
            cost += 2.00;
        }
        return cost;
    }

    // Setters
    public void setRice(String rice) {
        this.rice = rice;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setGuac(Boolean guac) {
        this.guac = guac;
    }
    public String toString(){
        return size + protein + " burrito with " + rice + ", " + beans + ", "
                + toppings + ", and" + guac + ". \n Total cost: $" + getCost();
    }
}

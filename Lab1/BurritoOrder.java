public class BurritoOrder {

    public static void main(String[] args) {
        Burrito newBurrito = new Burrito();
        newBurrito.setSize("small");
        newBurrito.setProtein("chicken");
        newBurrito.setRice("white");
        newBurrito.setBeans("brown");
        newBurrito.setToppings("lettuce");
        newBurrito.setGuac(true);

        Burrito SecondBurrito = new Burrito("Large", "Steak");

        SecondBurrito.setRice("white");
        SecondBurrito.setBeans("Brown");
        SecondBurrito.setToppings("lettuce, Chesse, Olives");
        SecondBurrito.setGuac(true);

        Burrito ThirdBurrito = new Burrito("Large", "Steak", "Brown", "Black", "Tomatoes", false);
        Burrito FourthBurrito = new Burrito("Small", "Tofu", "None", "None", "olives", false);
        Burrito FifthBurrito = new Burrito("large", "carnita", "None", "None", "No Toppings", true);
        Burrito SixthBurrito = new Burrito("Small", "chicken", "None", "None", "Lettuce, cheese", false);
        System.out.println("Burrito 1: " + newBurrito);
        System.out.println("Burrito 2: " + SecondBurrito);
        System.out.println("Burrito 3: " + ThirdBurrito);
        System.out.println("Burrito 4: " + FourthBurrito);
        System.out.println("Burrito 5: " + FifthBurrito);
        System.out.println("Burrito 6: " + SixthBurrito);
    }
}
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
  System.out.println("Burrito 1: " + newBurrito);
  System.out.println("Burrito 2: " + SecondBurrito);
  System.out.println("Burrito 3: " + ThirdBurrito);
 }
}
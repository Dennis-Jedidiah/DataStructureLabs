public abstract class Burrito {
 
 String size = "";
 String protein= "";
 String rice = "";
 String beans = "";
 String toppings= "";
 Boolean guac= false;

 public Burrito() {
  this.size = "small";
  this.protein= "none";
  this.rice= "none";
  this.beans= "none";
  this.toppings= "none";
  this.guac= false ;
 } 

 public Burrito(String size, String protein){
  this.size= size;
  this.protein= protein;
   this.rice= "none";
  this.beans= "none";
  this.toppings= "none";
  this.guac= false ;
 }

}

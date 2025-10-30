/*
 * this code aims to demonstrate base class reference in java
 */

 public class Veggies{
    void benefits()
    {
        System.out.println("Vegetables are a rich source of vitamins and minerals.");
    }
 }

 class Cauliflower extends Veggies{
    @Override
    void benefits(){
        super.benefits();
        System.out.println("Cauliflowers are rich in antioxidants.");
    }
 }

 class Carrots extends Veggies{
    @Override 
    void benefits()
    {
        System.out.println("Carrots are rich in Vitamin A");
    }
 }

 class VegRef{
    public static void main(String args[]){
        System.out.println("Learn about some Veggies!");
        Veggies ref;
        ref = new Carrots();
        ref.benefits();
        ref = new Cauliflower();
        ref.benefits();
    }
 }

 /*
  * Learn about some Veggies!
Carrots are rich in Vitamin A
Vegetables are a rich source of vitamins and minerals.
Cauliflowers are rich in antioxidants.
  */
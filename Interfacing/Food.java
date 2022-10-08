package Food;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;

public abstract class Food {
   String name;
   double calorie_count;
 
   
   
   Food(){
	   this.name = this.getClass().getSimpleName();
	   String full_class_name = this.name;
	   this.name = getNiceName(full_class_name);
   }
   
   public static String getNiceName(String toChange) {
	   ArrayList<String> ind_names = new ArrayList<String>();
	   int prev = 0;
	   for(int i =0; i<toChange.length(); i++) {
		   if('A'<=toChange.charAt(i)&& (toChange.charAt(i)<='Z')) {
			   String one = toChange.substring(prev,i);
			   ind_names.add(one);
			   prev = i;
		   }
	   }
	  ind_names.add(toChange.substring(prev,toChange.length()));
	  for(int i =0; i<ind_names.size(); i++) {
		  String to_caps = ind_names.get(i);
		  to_caps = to_caps.toLowerCase();
		  ind_names.set(i, to_caps);
	  }
	   String actual_name = String.join(" ", ind_names);
	   return actual_name;
   }
   
   Food(String name, double calorie_count){
	   this.name = name;
	   this.calorie_count = calorie_count;
   }
   
   public abstract String getFlavor();
   public String toString() {
	  String addition = "";
	  if(this instanceof Spicy) {
		  Spicy s = (Spicy) this;
		  addition = " Spicy Level: " + s.getSpicyLevel();
	  }
//	   if(addition.equals("")) {
//		   return this.name + " tastes like " + this.getFlavor();
//	   }
	   return this.name + " tastes like " + this.getFlavor()+addition;
   }
   
   public static void main(String[] args) {
	   Food[] Foods = new Food[] {
			new spicyChickenBurrito(), new peanutButterAndJellySandwich()   
	   };
	   for(int i =0; i<Foods.length; i++) {
		   System.out.println(Foods[i].toString());
	   }
   }
   
   
   
}

class spicyChickenBurrito extends Food implements Spicy{
	

	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Spicy Chicken";
	}

	@Override
	public int getSpicyLevel() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}

class peanutButterAndJellySandwich extends Food{
	

	@Override
	public String getFlavor() {
		// TODO Auto-generated method stub
		return "Peanut and Jam";
	}
	
}

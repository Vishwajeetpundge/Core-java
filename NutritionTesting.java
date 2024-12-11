package overriding_class;



abstract class Food{
	double proteins;
	double fats;
	double carbs;
	double tastyScore;
	
	
	public Food(double proteins, double fats, double carbs, double tastyScore) {
		super();
		this.proteins = proteins;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}


	public abstract void getMacroNutrients();
}

class Egg extends Food{
	int tastyScore = 7;
    String type = "non-vegetarian";
	public Egg(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
		 
	}
	@Override
	public void getMacroNutrients() {
	    System.out.println("Egge is "+this.type);
		System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		 System.out.println("Taste :"+this.tastyScore);
	}
	
}
class Bread extends Food{
	int tastyScore = 8;
	String type = "vegetarian";
	public Bread(double proteins, double fats, double carbs, double tastyScore) {
		super(proteins, fats, carbs, tastyScore);
		 
	}
	@Override
	public void getMacroNutrients() {
		 
		 System.out.println("Bread is "+this.type);
		System.out.println("A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
        System.out.println("Taste :"+this.tastyScore);
	}
	
}

public class NutritionTesting {

	public static void main(String[] args) {
		 Food fo=null;
		 fo=new Egg(90.0,1.5, 40.9, 0);
		 fo.getMacroNutrients();
         System.out.println(".....................................");
		 fo=new Bread(3.9,2.1, 18.1, 0);
		 fo.getMacroNutrients();

	}

}
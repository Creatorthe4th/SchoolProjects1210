public class FoodItem {
    private String name;
    private double fat;
    private double carbohydrates;
    private double protein;

    // Default constructor
    public FoodItem() {
        name = "Water";
        fat = 0.0;
        carbohydrates = 0.0;
        protein = 0.0;
    }

    // Constructor with parameters
    public FoodItem(String name, double fat, double carbohydrates, double protein) {
        this.name = name;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }
    public String getName(){
        return name;
    }
    public double getFat(){
        return fat;
    }
    public double getCarbs(){
        return carbohydrates;
    }
    public double getProtein(){
        return protein;
    }
    // Method to calculate the number of calories for a given number of servings
    public double getCalories(double numServings) {
        double caloriesPerServing = (fat * 9) + (carbohydrates * 4) + (protein * 4);
        return numServings * caloriesPerServing;
    }

    // Method to print the nutritional information
    public void printInfo() {
        System.out.println("Nutritional information per serving of " + name + ":");
        System.out.printf("  Fat: %.2f g\n", fat);
        System.out.printf("  Carbohydrates: %.2f g\n", carbohydrates);
        System.out.printf("  Protein: %.2f g\n", protein);
    }
}

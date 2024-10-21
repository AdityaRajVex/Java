package C.myHealth;

public class BMI {
    //attributes
    private double weight;
    private double height;
    //constructor
    public BMI(){
        this.weight = 1.0;
        this.height = 1.0;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    // Get/Set Weight
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Get/Set Height
    public double getHeight() {
    return height;
    }
    public void setHeight(double height) {
    this.height = height;
    }

    public double getBMI(){
        return (weight / Math.pow(height, 2)) * 703;
    }

}

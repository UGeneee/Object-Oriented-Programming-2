package week12_interface;

public class Water implements Drinkable {
    public int getNumGlasses() {
        return 0;
    }
    public void getWaterSource() {
        System.out.println("Meow");
    }
    
    public double calcFullTime() {
        return 0.0;
    }
    
    public double calcOverTime() {
        return 0.0;
    }
    public static void main(String[] args) {
        Water h2o = new Water();
        h2o.getWaterSource();
    }
}

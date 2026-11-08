package week8_inheritance.HandsOn06Act2;

public class Exam {

    private String message; 
    private double price;
    private boolean isFinished;

    public Exam() {
        message = "Good luck";
    }

    public Exam(String period, String level) {
        
    }
    
    public double getPrice() {
        return price;
    }

    public boolean isIsFinished() {
        return isFinished;
    }

}

class Midterm extends Exam {
    
    public Midterm() {
        super();
        System.out.println("Exam has started.");
    }
    
}

class Essay extends Midterm {
    
}

// #8
// class Essay extends Quiz { }
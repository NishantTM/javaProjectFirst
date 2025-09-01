public class Calculatorone {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a , int b, int c){
        return a + b + c;
    }
    
    public double calculate(double a, double b){
        return 0;
    }
}

class Addition extends Calculator{
    public double calculate(double a, double b){
        return a + b;
    }
}

class Subtraction extends Calculator{
    public double calculate(double a, double b){
        return a - b;
    }
}
class Multiplication extends Calculator{
    public double calculate(double a, double b){
        return a * b;
    }
}

// Main class




public class TestPolymorphism {
    
    public static void main(String[] args) {
        // ---- Compile-time Polymorphism (Overloading) ----
        Calculator calc = new Calculator();
        System.out.println("Overloading Examples:");
        System.out.println("add(5, 10) = " + calc.add(5, 10));
        System.out.println("add(2.5, 3.7) = " + calc.add(2.5, 3.7));
        System.out.println("add(1, 2, 3) = " + calc.add(1, 2));

        // ---- Runtime Polymorphism (Overriding) ----
        System.out.println("\nOverriding Examples:");
        Calculator c1 = new Addition();
        Calculator c2 = new Subtraction();
        Calculator c3 = new Multiplication();

        System.out.println("Addition:  10 + 5 = " + c1.calculate(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + c2.calculate(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + c3.calculate(10, 5));
    }
    
}

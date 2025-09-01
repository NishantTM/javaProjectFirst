public class Basics {
    public static void main(String[] args) {
        int age = 20;
        double price = 100;
        // Char Grade = 'A';
        boolean isStudent = true;
        String name = "Nishant singh";

        int a = 20, b = 30;
        System.out.println("Sum of two numbers:"+ (a+b));
        System.out.println("Compare two numbers:"+ (a<b));


        // Conditional statement
    
        if (age > 21) {
            System.out.println("You are eligible to vote");
            
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        //Looping statement

        System.out.println("Numbers from 1 to 20");
        for(int i = 1; i<=20; i++){
            System.out.println(i);
        }

    }
    
}

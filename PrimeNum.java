public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("The prime number from 2 to 20 is:");
        for(int num = 2; num<=20; num ++){
            boolean isPrime = true;
            for(int i = 2; i<=num/2; i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num +"");
                
            }
        }
    }
    
}

abstract class Payment {

    public abstract void pay(int amount);

    public void DisplayMessage(){
        System.out.println("Payment is payment is processing");
    } 
}
// subclass 1
class CreditCard extends Payment{
    @Override
    public void pay(int amount){
        System.out.println("Paid"+ amount +"using credit card");
    }
}

// Subclass 2 
class Upipayment extends Payment{
    @Override 
    public void pay(int amount){
        System.out.println("Paid"+ amount+"using Upayment");
        }
        public static void main(String[] args) {
            Payment p1 = new Payment() {

                @Override
                public void pay(int amount) {
                    System.out.println("Paid " + amount + " using anonoimus method");
                }
                
            };
            p1.DisplayMessage();
            p1.pay(1000);
        }
    }





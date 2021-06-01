public class CreditCard extends SelectPay {
    String cardNumber;

    public CreditCard(){
        cardNumber = "";
        super.PayBy = "Credit Card";
    }

    void Pay() {
       System.out.println("You pay by " + super.PayBy + " Number " + cardNumber + ".");
    }

    public void Set(String CreditNumber){
        cardNumber = CreditNumber;
    }

}

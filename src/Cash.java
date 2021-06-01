public class Cash extends SelectPay {
    String payBy;

    public Cash(){
        super.PayBy = "Cash";
    }

    @Override
    void Set(String CreditNumber) {
        
        
    }

    @Override
    void Pay() {
        System.out.println("You pay by " + super.PayBy + ".");
        
    }
    
}

public class Promotion1 extends Promotion{

    public Promotion1(Payment temp){
        super.tempPayment = temp;
    }
    void Sale() {
        int sale = 30;
        int sum = super.tempPayment.getpay();
        sum = sum * (100 - sale) / 100;
        super.tempPayment.setpay(sum);
        super.tempPayment.setPromotion("Promotion1 sale 30%");
    }
    
}

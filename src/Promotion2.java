public class Promotion2 extends Promotion{
    public Promotion2(Payment temp){
        super.tempPayment = temp;
    }
    void Sale() {
        int sale = 50;
        int sum = super.tempPayment.getpay();
        sum = sum * (100 - sale) / 100;
        super.tempPayment.setpay(sum);
        super.tempPayment.setPromotion("Promotion2 sale 50%");
    }
}

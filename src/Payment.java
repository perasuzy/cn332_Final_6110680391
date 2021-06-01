public class Payment {
    BookingRoom payBooking;
    int allPay;
    String Pro="";

    public Payment(BookingRoom tempBooking){
        payBooking = tempBooking;
        allPay = 500;
    }

    public void CalculatePay(){
        allPay = 500;
        int tempBed = payBooking.getBed();
        boolean tempWifi = payBooking.getWifi();
        int tempDate = payBooking.getDate();

        while(tempBed-- > 0){
            allPay += 200;
        }
        if(tempWifi) allPay += 200;
        allPay *= tempDate;
        
    }

    public void totalPay(){

        if(Pro != ""){
            System.out.println("You will pay " + allPay + " Bath"+" with " + Pro);
        }else{
            System.out.println("You will pay " + allPay + " Bath");
        }
        
    }

    public int getpay(){
        return allPay;
    }
    public void setpay(int temp){
        allPay = temp;
    }

    public void setPromotion(String temp){
        Pro = temp;
    }
}

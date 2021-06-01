
public class Main {
    public static void main(String[] args){
       
       System.out.println();
       System.out.println();

       BookingRoom perasuBooking = new BookingRoom();
       perasuBooking.setBed(2);                                             //ใส่จำนวนเตียงที่ต้องการ
       perasuBooking.setWifi(true);                                         //ต้องการห้องที่มีไวไฟหรือไม
       perasuBooking.setdate(3);                                            //เลือกจำนวนวันที่เข้าพัก
       perasuBooking.detail();                                              //ขอดูรายละเอียดการจอง

       Payment perasuPay = new Payment(perasuBooking);
       perasuPay.CalculatePay();                                            //คำนวนค่าใช้จ่ายจากการจอง
       perasuPay.totalPay();                                                //ขอดูยอดเงินที่ต้องจ่าย


       //Promotion perasuUsePromotion1 = new Promotion1(perasuPay);
       //perasuUsePromotion1.Sale();

        Promotion perasuUsePromotion2 = new Promotion2(perasuPay);          //เลือกการจ่ายเงินโดยใช้โปรโมชั้นที่สองลดราคา 50%
        perasuUsePromotion2.Sale();                                         //คำนวนราคาหลังใช้โปรโมชั่นเเล้ว
        
        perasuPay.totalPay();                                               //ขอดูยอดเงินที่ต้องจ่าย


       SelectPay perasuSelectPay = new CreditCard();                        //เลือกจ่ายโดยใช้บัตรเคดิตการ์ด
       perasuSelectPay.Set("123456789");                                    //ตั้งค่าหมายเลยบัตรเคดิต
       perasuSelectPay.Pay();                                               //ทำการจ่ายตัง
       
       //SelectPay perasuSelectPay2 = new Cash();
       //perasuSelectPay2.Pay();
     
       System.out.println();
       
    }
}
public class BookingRoom implements Room {
    /*Bed bed = new Bed();
    Wifi wifi = new Wifi();
    Date date = new Date();*/

    int bed;
    boolean wifi;
    int date;
     
    public BookingRoom(){
        bed = 1;
        wifi = false;
        date = 1;
    }

    public BookingRoom(int tempbed,boolean tempwifi,int tempdate){
        bed = tempbed;
        wifi = tempwifi;
        date = tempdate;
    }


    public void detail() {
        String stringWifi = "";
        if(wifi) stringWifi = "& Wifi";
        System.out.println("You Booking " + bed + " Bed " + stringWifi + " and You booking " + date + " Day.");
    
    }

    public void setBed(int tempbed) {
        bed = tempbed;
    }
    public void setWifi(boolean tempwifi) {
        wifi = tempwifi;
    }
    public void setdate(int tempdate) {
        date = tempdate;
    }

    public int getBed() {
        return bed;
    }
    public boolean getWifi() {
        return wifi;
    }
    public int getDate() {
        return date;
    }
}

package carcomponents;

public class EntertainmentSystem {
    String radio;
    String SatNav;
    boolean bluetooth;
     public EntertainmentSystem(String radio, String SatNav, boolean bluetooth){
         this.radio = radio;
         this.SatNav = SatNav;
         this.bluetooth = bluetooth;
     }

    public String getRadio() {
        return radio;
    }

    public String getSatNav() {
        return SatNav;
    }
    public boolean getBluetooth() {
        return bluetooth;
    }


    public String canTurnRadioOn(){
         return "Radio is on";
     }
    public String canTurnRadioOff(){
        return "Radio is off";
    }
    public String canConnectBluetooth(){
         return "Bluetooth is connected";
    }
    public String canDisconnectBluetooth(){
        return "Bluetooth is disconnected";
    }
    public String canGiveDirections(){
         return "Here are your directions";
    }
}

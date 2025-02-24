package pametniUredaji;

public class Main {
    public static void main(String[] args) {


        SmartLight s1 = new SmartLight("Lumen");
        SmartThermostat t1 = new SmartThermostat("Termo");
        SmartSpeaker sp1 = new SmartSpeaker("Pill");
        s1.performAction();


        s1.remoteControl("pojačaj");
        System.out.println( s1.updateFirmvare("2.22.331c"));
        System.out.println( s1.displayStatus());
        System.out.println("*********************");
        System.out.println(t1.updateFirmvare("23434.332"));
        System.out.println( t1.displayStatus());

        t1.performAction();
        t1.remoteControl("pojačaj");
        System.out.println( t1.displayStatus());


        System.out.println("*********************");

        sp1.remoteControl("pojačaj");
        System.out.println(sp1.updateFirmvare("23232323.22"));
        sp1.performAction();
        System.out.println(sp1.displayStatus());
    }
}

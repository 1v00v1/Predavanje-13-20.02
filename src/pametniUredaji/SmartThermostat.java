package pametniUredaji;

import java.util.Scanner;

public class SmartThermostat extends SmartDevices implements RemoteControllable {

    private String ime;
    private int temperatura = 0;


    public SmartThermostat(String ime) {
        this.ime = ime;
    }

    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("pojačaj")) {
            temperatura += 10;
            System.out.println("Temperatura pojačan na " + temperatura);

        } else if (command.equalsIgnoreCase("smanji")) {
            if (temperatura > 0) {
                temperatura -= 10;
                System.out.println("Temperatura smanjen na " + temperatura);
            }

        }
    }

    @Override
    void performAction() {
        System.out.println("postavljam  temperaturu na 28 stupnjeva");
        temperatura = 28;


    }

    @Override
    String displayStatus() {
        return "Termostat " + ime + " na temperaturi " + temperatura;
    }
}

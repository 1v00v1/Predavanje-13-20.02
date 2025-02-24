package pametniUredaji;

public class SmartLight extends SmartDevices implements RemoteControllable {

    private String name;
    private boolean upaljeno = false;
    private int intezitet = 0;

    public SmartLight(String name) {
        this.name = name;
    }

    @Override
    public void remoteControl(String command) {

        if (command.equalsIgnoreCase("pojačaj")) {
            intezitet += 1;
            System.out.println("Intezitet pojačan na "+intezitet);

        } else if (command.equalsIgnoreCase("smanji")) {
            if (intezitet > 0) {
                intezitet -= 1;
                System.out.println("Intezitet smanjen na "+intezitet);
            }

        }

    }

    @Override
    void performAction() {
        if (upaljeno) {
            System.out.println("gasim uređaj " + name);
            upaljeno = false;
        } else {
            System.out.println("Palim uređaj " + name);
            upaljeno = true;
        }
    }

    @Override
    String displayStatus() {

        if (upaljeno) {
            return "Uređaj je upaljen \nInzezitet svijetla je : " + intezitet;
        } else {
            return "Uređaj je ugašen";
        }
    }
}

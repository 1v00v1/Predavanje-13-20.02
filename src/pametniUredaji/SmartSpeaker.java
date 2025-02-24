package pametniUredaji;

public class SmartSpeaker extends SmartDevices implements RemoteControllable{
   private String name;
    private int volume=10;

    public SmartSpeaker(String name) {
        this.name = name;
    }

    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("pojačaj")) {
            volume += 10;
            System.out.println("Glasnoča pojačana na " + volume);

        } else if (command.equalsIgnoreCase("smanji")) {
            if (volume > 0) {
                volume -= 10;
                System.out.println("Glasnoča smanjena na " + volume);
            }

        }
    }

    @Override
    void performAction() {
        System.out.println("Puštam Glazbu");
    }

    @Override
    String displayStatus() {
        return "Smart Speaker "+ name +" svira glazbu na glasnoči "+volume;
    }
}

package pametniUredaji;

abstract class SmartDevices {

    abstract void performAction();

    abstract String displayStatus();

    String updateFirmvare(String version){
      return "Updating to version "+version;
    }
}
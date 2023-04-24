package complete.bridge;

import complete.bridge.devices.Device;
import complete.bridge.devices.Radio;
import complete.bridge.devices.Tv;
import complete.bridge.remotes.AdvancedRemote;
import complete.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    //TO-DO: Implement the method testDevice()
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        //Create the new BasicRemote instance
        BasicRemote basicRemote = new BasicRemote();
        //Power on the device
        basicRemote.power();
        //Display the status of device
        System.out.println("volume: " + device.getVolume());
        System.out.println("channel" + device.getChannel());

        System.out.println("Tests with advanced remote.");
        //Create the new AdvancedRemote instance
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        //Power on the device
        advancedRemote.power();

        //Mute the device
        advancedRemote.mute();

        //Display the status of device
        System.out.println("volume: " + device.getVolume());
        System.out.println("channel" + device.getChannel());
    }
}

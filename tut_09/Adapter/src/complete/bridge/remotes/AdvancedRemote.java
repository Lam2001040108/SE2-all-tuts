package complete.bridge.remotes;

import complete.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    //TO-DO: Implement the mute() method
    public void mute() {
    	//Display the current volume status is 'mute'
        System.out.println("Mute volume");
        //Set the volume to 0
        this.device.setVolume(0);
    }
}

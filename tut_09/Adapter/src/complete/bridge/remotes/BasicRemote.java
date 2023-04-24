package complete.bridge.remotes;

import complete.bridge.devices.Device;

public class BasicRemote implements Remote {
	protected Device device;

	public BasicRemote() {
	}

	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void power() {
		System.out.println("Remote: power toggle");
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}

	//TO-DO: Implement the volumeDown() method
	@Override
	public void volumeDown() {
		//Display the current status is 'volume down'
		System.out.println("Current volume: " + device.getVolume());
        //Decrease the current volume for 10
		this.device.setVolume(device.getVolume() - 10);
		System.out.println("Current volume: " + device.getVolume());
	}

	//TO-DO: Implement the volumeUp() method
	@Override
	public void volumeUp() {
		//Display the current status is 'volume up'
		System.out.println("Current volume: " + device.getVolume());
		//Increase the current volume for 10
		this.device.setVolume(device.getVolume() + 10);
		System.out.println("Current volume: " + device.getVolume());
	}

	//TO-DO: Implement the channelDown() method
	@Override
	public void channelDown() {
		//Display the current status is 'channel down'
		System.out.println("Current channel: " + device.getChannel());
        //Decrease the current channel for 1
		this.device.setChannel(device.getChannel() - 1);
		System.out.println("Current channel: " + device.getChannel());
	}
	
	//TO-DO: Implement the channelUp() method
	@Override
	public void channelUp() {
		//Display the current status is 'channel up'
		System.out.println("Current channel: " + device.getChannel());
        //Increase the current channel for 1
		this.device.setChannel(device.getChannel() + 10);
		System.out.println("Current channel: " + device.getChannel());
	}
}

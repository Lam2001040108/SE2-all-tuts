package singleton;

//Create the FIT class with getInstance method()
public class FIT {
	private static FIT instance = null;
	public String text;

	private FIT() {
		text = "Faculty of Information Technology - Hanoi University";
	}

	// TO-DO: Implement the getInstance method
	public static FIT getInstance() {
		/*
		 * if 'instance' is equal to null, set 'instance' as a new object
		 * otherwise, return 'instance'
		 */
		if (instance == null) {
			instance = new FIT();
		}
		return instance;
	}

	// TO-DO: Implement 2 below methods
	public String toUpper() {
		return this.text.toUpperCase();

	}

	public String toLower() {
		// Set the given text to lower case
		return this.text.toLowerCase();
	}
}

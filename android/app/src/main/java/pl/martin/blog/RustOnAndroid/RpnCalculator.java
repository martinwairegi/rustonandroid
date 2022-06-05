package pl.martin.blog.RustOnAndroid;

public class RpnCalculator {
	// Used to load the 'native-lib' library on application startup.
	static {
		System.loadLibrary("rpn");
	}

	public static native Result rpn(String expression);
}

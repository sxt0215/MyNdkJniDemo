package creditcloud.com.myndkjnidemo;

/**
 * Created by sxt on 16/6/15.
 */
public class MyJni {
    static{
        System.loadLibrary("jni");
    }
    public native String print(String str);
}

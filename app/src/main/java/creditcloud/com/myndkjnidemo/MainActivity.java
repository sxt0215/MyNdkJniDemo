package creditcloud.com.myndkjnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_text = (TextView) findViewById(R.id.tv_text);
        MyJni myJni = new MyJni();
        tv_text.setText(myJni.print("cs"));
    }
}

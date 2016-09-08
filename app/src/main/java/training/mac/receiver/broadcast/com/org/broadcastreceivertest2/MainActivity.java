package training.mac.receiver.broadcast.com.org.broadcastreceivertest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("training.mac.receiver.broadcast.com.org.broadcastreceivertest2.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}

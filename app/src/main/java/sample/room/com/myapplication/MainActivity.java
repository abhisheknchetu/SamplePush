package sample.room.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Hello World");
    }

    private void testUpload(){
        int i = 15;
        int ii = 50;

        String iString = Integer.toString(i);
        String iiString;

        if (ii<=100)
            iiString = Integer.toString(ii - 9);

    }
}

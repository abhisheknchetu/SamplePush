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
    }
/*

    private void pullMethod(){
        Log.i(TAG, "Push Method created");

    }
*/
    private void testUpload(){
        int i = 10;
        int j = 20;
        int k = 30;
    }

    private void pushMethod(){
        Log.i(TAG, "Push Method Created");
    }

    private void secondBranch(){
        Log.i(TAG, "Second Branch Created");
    }
}

package application.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle Step ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the onCreate() event");
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    public void onClickBtn(View v){
        if (v.getId() == R.id.bDisplay)
        {
            Intent newIntent = new Intent(MainActivity.this , dislay.class);
            startActivity(newIntent);
        }
    }

    public void onStart(){
        super.onStart();
        Log.d(tag, "In the onStart() event");

    }
    public void onRestart(){
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }
    public void onResume(){
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }
    public void onPause(){
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    public void onStop(){
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }
}
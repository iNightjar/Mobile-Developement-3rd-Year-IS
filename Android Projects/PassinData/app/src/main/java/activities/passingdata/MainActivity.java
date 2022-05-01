package activities.passingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i = new Intent("activities.passingdata.SecondActivity");
        // use putExtra () to add new name/value pairs
        i.putExtra("str1", "this is a string");
        i.putExtra("age1", 25);
        // use the bundle object to add new name/value pairs
        Bundle extras = new Bundle();
        extras.putString("str2", "this is another string");
        extras.putInt("age2", 35);
        // attach the bundle object to the intent object
        i.putExtras(extras);
        // start the activity to get a result back
        startActivityForResult(i, 1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            // if hte result is ok
            if (resultCode == RESULT_OK) {
                // get the result using getIntExtra()--
                Toast.makeText(this, Integer.toString(data.getIntExtra("age3", 0)), Toast.LENGTH_SHORT).show();
                // get the result using getData()--
                Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
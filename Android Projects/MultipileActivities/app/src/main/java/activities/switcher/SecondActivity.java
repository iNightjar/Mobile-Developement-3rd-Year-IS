package activities.switcher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void onClick(View view){
        Intent data = new Intent();
         // get the EditText view
        EditText txt_username= (EditText)findViewById(R.id.txtUsername);
        // set the data to pass back
        data.setData(Uri.parse(txt_username.getText().toString()));
        setResult(RESULT_OK, data);
        // close the activity
        finish();
    }
}

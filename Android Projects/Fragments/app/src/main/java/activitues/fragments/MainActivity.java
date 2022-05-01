package activitues.fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        // get the current display info --
//        WindowManager windowManager = getWindowManager();
//        DisplayMetrics display = this.getResources().getDisplayMetrics();
//
//        int width = display.widthPixels;
//        int height = display.heightPixels;
//        if (width > height) {
//            // landscape mode
//            Fragment1 fragment1 = new Fragment1();
//            // android.R.id.content refers to the content
//            // view of the activity
//            fragmentTransaction.replace(
//                    android.R.id.content, fragment1);
//        } else {
//            // portrait mode
//            Fragment2 fragment2 = new Fragment2();
//            fragmentTransaction.replace(
//                    android.R.id.content, fragment2);
//        }
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }
}
package first.learn.listviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    public  static String  Message = "";

    EditText etOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Screen 2");

        etOne = (EditText)findViewById(R.id.etOne);
        System.out.println("Calling Method : OnCreate - Activity 2");


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                System.out.println("Calling Method : Post Delayed - Activity 2");

            }
        },500);

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Calling Method : OnStart - Activity 2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Calling Method : OnResume - Activity 2");
    }


    /*
    Activity Closing :
     */

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Calling Method : onPause - Activity 2");
    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Calling Method : onStop - Activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Calling Method : onDestroy - Activity 2");
    }

    @Override
    public void onBackPressed() {


        String s = etOne.getText().toString();

        Message = s ;



        super.onBackPressed();
    }
}
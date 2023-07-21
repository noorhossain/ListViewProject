package first.learn.listviewproject;

import static first.learn.listviewproject.Common.showStaticCustomDialog;
import static first.learn.listviewproject.MainActivity2.Message;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btnOne, btnTwo;
    TextView tvOne;
    ListView listView, listView2;

    /*
   Activity Starting  :
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Screen One ");

        listView2 = (ListView) findViewById(R.id.listView2);
        listView2.setFastScrollEnabled(false);
        listView2.setFastScrollAlwaysVisible(false);
        listView2.setVerticalScrollBarEnabled(false);


        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            list.add("Item : " + i);
        }


        if (list.size() > 4) {
            System.out.println("Element List  : " + list.get(4));
        } else {
            // Again Network Call :
            System.out.println("Element List  : " + list.get(3));
        }


        String[] array = {"apple", "Banana", "Cucumber", "Dragon"};

        if (array.length > 4) {
            System.out.println("Element : Array : " + array[4]);
        } else {
            System.out.println("Element : Array : " + "NetWork Call Again");
        }


        /// String To Array :


        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, list);
        listView2.setAdapter(adapter2);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


//                if (position == 0) {
//                    Toast.makeText(MainActivity.this, "Books Subject : " + position, Toast.LENGTH_SHORT).show();
//
//                } else if (position == 1) {
//                    Toast.makeText(MainActivity.this, "Books Preface : " + position, Toast.LENGTH_SHORT).show();
//
//                } else if (position==2) {
//                    Toast.makeText(MainActivity.this, "Books Chapter : " + position, Toast.LENGTH_SHORT).show();
//
//                } else if (position==3) {
//                    Toast.makeText(MainActivity.this, "Introduction Two Modern World", Toast.LENGTH_SHORT).show();
//
//                }else {
//                    Toast.makeText(MainActivity.this, "Introduction Two Modern World extra", Toast.LENGTH_SHORT).show();
//
//                }


                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Books Subject : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Books Preface : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Books Chapter : " + position, Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Introduction Two Modern World", Toast.LENGTH_SHORT).show();
                        break;
                    case 100:
                        Toast.makeText(MainActivity.this, "Introduction Two Modern World extra 100", Toast.LENGTH_SHORT).show();
                        break;

                    case 101:
                        Toast.makeText(MainActivity.this, "Introduction Two Modern World extra", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Introduction Two Modern World Default", Toast.LENGTH_SHORT).show();
                        break;

                }


//                String a = list.get(position);
//
//                new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("You Clicked")
//                        .setMessage("Position : " + position + " Item : " + a)
//                        .setPositiveButton("ok", null)
//                        .create().show();

            }
        });


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        System.out.println("Calling Method : onWindowFocusChanged - Activity 1");
    }

    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("Calling Method : OnStart - Activity 1");

    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Calling Method : OnResume - Activity 1 ");

    }


    /*
    Activity Closing :
     */

    @Override
    protected void onPause() {
        System.out.println("Calling Method : onPause - Activity 1");
        super.onPause();

    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Calling Method : onStop - Activity 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Calling Method : onDestroy - Activity 1");
    }
}
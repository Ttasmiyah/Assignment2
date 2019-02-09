package com.example.user.assignment2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    public void init() {
       TableLayout table_1 = (TableLayout) findViewById(R.id.table1);
        for (int i= 1; i<=50; i++) {
            TableRow row = new TableRow(this);
            TextView tv1 = new TextView(this);
            tv1.setText("" + i);
            tv1.setTextColor(Color.BLACK);
            tv1.setGravity(Gravity.CENTER);
            row.addView(tv1);
            TextView tv2 = new TextView(this);
            tv2.setText("      17.01.04.0" + i);
            tv2.setTextColor(Color.WHITE);
            tv2.setGravity(Gravity.CENTER);
            row.addView(tv2);
            TextView tv3 = new TextView(this);
            tv3.setText(" 01xxxxxxxx" + i);
            tv3.setTextColor(Color.WHITE);
            tv3.setGravity(Gravity.RIGHT);
            row.addView(tv3);
            table_1.addView(row);
        }

    }
}


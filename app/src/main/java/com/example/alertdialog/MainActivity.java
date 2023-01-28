package com.example.alertdialog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * @author inbar menahem
 * @version 1.0
 * @since 10/1/2023
 * the activity making alarts in different situations.
 */
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb;
    LinearLayout lyout;
    Random rand = new Random();
    Random rand2 = new Random();
    Random rand3 = new Random();
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adb = new AlertDialog.Builder(this);
        lyout = findViewById(R.id.lyout);
        si = new Intent(this, creditsAct.class);
    }

    /**
     * shows alart when the first button is clicked
     *
     * @param view the view
     * @return shows the dialog alart on the screen
     */
    public void firstBtn(View view) {
        adb.setTitle("first click");
        adb.setMessage("this is a simple alert");
        adb.setIcon(0);
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        adb.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Second btn.
     * shows alart when the sec button is clicked
     * @param view the view
     * @return shows the dialog alart on the screen
     */
    public void secondBtn(View view) {
        adb.setIcon(R.drawable.tenniscourt3);
        adb.setMessage("this is a simple alert");
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        adb.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Third btn.
     * shows alart when the 3rd button is clicked
     * @param view the view
     * @return shows the dialog alart on the screen
     */
    public void thirdBtn(View view) {
        adb.setIcon(R.drawable.tenniscourt3);
        adb.setMessage("this is a simple alert");
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Forth btn.
     * shows alart when the 4th button is clicked
     * @param view the view
     * @return shows the dialog alart on the screen
     */
    public void forthBtn(View view) {
        adb.setIcon(0);
        adb.setMessage("change color alart");
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int currentColor = Color.argb(255, rand.nextInt(256), rand2. nextInt(256), rand3.nextInt(256));
                lyout.setBackgroundColor(currentColor);
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    /**
     * Fifth btn.
     * shows alart when the 5th button is clicked
     * @param view the view
     * @return shows the dialog alart on the screen
     */
    public void fifthBtn(View view) {
        adb.setIcon(0);
        adb.setMessage("change color alart");
        adb.setPositiveButton("change color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                int currentColor = Color.argb(255, rand.nextInt(256), rand2. nextInt(256), rand3.nextInt(256));
                lyout.setBackgroundColor(currentColor);
            }
        });
        adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        adb.setPositiveButton("white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                lyout.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog ad = adb.create();
        ad.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.credits){
            startActivity(si);
        }
        return super.onOptionsItemSelected(item);
    }
}
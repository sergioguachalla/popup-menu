package com.example.popupmenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonPopupMenu, buttonPopupMenu2;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPopupMenu = findViewById(R.id.btPopupMenu);
        buttonPopupMenu2 = findViewById(R.id.btPopupMenu2);

        relativeLayout = findViewById(R.id.RelativeLayout);
        buttonPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,buttonPopupMenu);
                popupMenu.getMenuInflater().inflate(R.menu.layout_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if(menuItem.getItemId() == R.id.popupMenuOne){
                            Toast.makeText(MainActivity.this,"Elegido uno", Toast.LENGTH_LONG);


                        }

                        if(menuItem.getItemId() == R.id.popupMenuTwo){
                            Toast.makeText(MainActivity.this,"Elegido dos", Toast.LENGTH_LONG);

                        }

                        if(menuItem.getItemId() == R.id.popupMenuThree){
                            Toast.makeText(MainActivity.this,"Elegido tres", Toast.LENGTH_LONG);

                        }

                        if(menuItem.getItemId() == R.id.popupMenuFour){
                            Toast.makeText(MainActivity.this,"Elegido cuatro", Toast.LENGTH_LONG);

                        }

                        return true;
                    }
                });
                popupMenu.show();

            }
        });

        buttonPopupMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,buttonPopupMenu2);
                popupMenu.getMenuInflater().inflate(R.menu.layout_second, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if(menuItem.getItemId() == R.id.Menu2Item1){
                            Toast.makeText(MainActivity.this,"Elegido azul", Toast.LENGTH_LONG).show();
                            relativeLayout.setBackgroundColor(Color.BLUE);
                        }

                        if(menuItem.getItemId() == R.id.Menu2Item2){
                            Toast.makeText(MainActivity.this,"Elegido rojo", Toast.LENGTH_LONG).show();
                            relativeLayout.setBackgroundColor(Color.RED);
                        }

                        if(menuItem.getItemId() == R.id.Menu2Item3){
                              Toast.makeText(MainActivity.this,"Elegido amarillo", Toast.LENGTH_LONG).show();
                            relativeLayout.setBackgroundColor(Color.YELLOW);
                        }

                        if(menuItem.getItemId() == R.id.Menu2Item4){
                            Toast.makeText(MainActivity.this,"Elegido verde", Toast.LENGTH_LONG).show();
                            relativeLayout.setBackgroundColor(Color.GREEN);
                        }

                        if(menuItem.getItemId() == R.id.Menu2Item5){
                            Toast.makeText(MainActivity.this,"Elegido celeste", Toast.LENGTH_LONG).show();
                            relativeLayout.setBackgroundColor(Color.CYAN);
                        }
                        return true;
                    }
                });
                popupMenu.show();

            }
        });



    }
}
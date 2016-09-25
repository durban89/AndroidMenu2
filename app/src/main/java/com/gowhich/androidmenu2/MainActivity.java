package com.gowhich.androidmenu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuItem menuItem = menu.add(1001,100,1,"系统菜单");
        menuItem.setTitle("菜单一");

        MenuItem menuItem2 = menu.add(1001,101,2,"客户菜单");
        menuItem2.setTitle("菜单二");

        MenuItem menuItem3 = menu.add(1001,103,3,"用户菜单");
        menuItem3.setTitle("菜单三");


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 100:
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                item.setIntent(intent);
                break;
            case 101:
                Toast.makeText(MainActivity.this, "选择了客户菜单", Toast.LENGTH_SHORT).show();
                break;
            case 102:
                Toast.makeText(MainActivity.this, "选择了用户菜单", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}

package org.m2i.atelier04_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.option_favorite){
            showFavorite();
            return true;
        } else if (item.getItemId() == R.id.option_settings) {
            showSettings();
            return true ;
        } else {
            return super.onOptionsItemSelected(item);
        }

        /*switch (item.getItemId()){
            case R.id.option_favorite:
                showFavorite();
                return true ;
            case R.id.option_settings:
                showSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
    }

    void showFavorite(){
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
    }

    void showSettings(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
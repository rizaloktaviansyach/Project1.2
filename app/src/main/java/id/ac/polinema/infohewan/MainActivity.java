package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Detail1(View view) {
        //link ke DaftarActivity
        Intent intent = new Intent(this, DaftarActivity.class);
        startActivity(intent);
    }

    public void Detail2(View view) {
        //link ke Daftar2Activity
        Intent intent = new Intent(this, Daftar2Activity.class);
        startActivity(intent);
    }

    public void Detail3(View view) {
        //link ke Daftar3Activity
        Intent intent = new Intent(this, Daftar3Activity.class);
        startActivity(intent);
    }

    public void Detail4(View view) {
        //link ke Daftar4Activity
        Intent intent = new Intent(this, Daftar4Activity.class);
        startActivity(intent);
    }
}

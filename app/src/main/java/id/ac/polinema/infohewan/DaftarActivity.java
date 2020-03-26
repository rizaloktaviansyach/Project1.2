package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.adapter.DaftarAdapter;
import id.ac.polinema.infohewan.adapter.GridAdapter;
import id.ac.polinema.infohewan.model.GambarHewan;

public class DaftarActivity extends AppCompatActivity {
    private static final String TAG = "DaftarActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");


            RecyclerView teamsView = findViewById(R.id.rv_teams);

            List<GambarHewan> teams = new ArrayList<>();
            String imageName = getIntent().getStringExtra("image_name");
            setImage(imageName);
            teams.add(new GambarHewan("https://upload.wikimedia.org/wikipedia/commons/0/0c/Cow_female_black_white.jpg", "Mamalia"));
            teams.add(new GambarHewan("https://upload.wikimedia.org/wikipedia/commons/8/84/Schoenechse.jpg", "Reptil"));

            DaftarAdapter adapter = new DaftarAdapter(this, teams);
            teamsView.setAdapter(adapter);

            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
            teamsView.setLayoutManager(layoutManager);
        }
    }

    private void setImage(String imageName){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.titleText);
        name.setText(imageName);
    }
}

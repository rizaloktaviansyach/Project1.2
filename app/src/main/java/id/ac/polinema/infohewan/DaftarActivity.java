package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.adapter.GridAdapter;
import id.ac.polinema.infohewan.model.GambarHewan;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<GambarHewan> teams = new ArrayList<>();
        teams.add(new GambarHewan("https://upload.wikimedia.org/wikipedia/commons/0/0c/Cow_female_black_white.jpg", "Mamalia"));
        teams.add(new GambarHewan("https://upload.wikimedia.org/wikipedia/commons/8/84/Schoenechse.jpg", "Reptil"));

        GridAdapter adapter = new GridAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);
        teamsView.setLayoutManager(layoutManager);
    }
}

package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.adapter.GridAdapter;
import id.ac.polinema.infohewan.model.GambarHewan;

public class Daftar4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar4);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<GambarHewan> teams = new ArrayList<>();
        teams.add(new GambarHewan("", "Ular", ""));
        teams.add(new GambarHewan("", "Kura-kura", ""));
        teams.add(new GambarHewan("", "Kadal", ""));
        teams.add(new GambarHewan("", "Dinosaurus", ""));
        teams.add(new GambarHewan("", "Tokek", ""));
        teams.add(new GambarHewan("", "Kadal Sawah", ""));
        teams.add(new GambarHewan("", "Bunglon", ""));
        teams.add(new GambarHewan("", "Iguana", ""));
        teams.add(new GambarHewan("", "Komodo", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));
//        teams.add(new GambarHewan("", "", ""));

        GridAdapter adapter = new GridAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}

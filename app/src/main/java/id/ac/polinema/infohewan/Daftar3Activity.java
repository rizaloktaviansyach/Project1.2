package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.adapter.GridAdapter;
import id.ac.polinema.infohewan.model.GambarHewan;

public class Daftar3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar3);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<GambarHewan> teams = new ArrayList<>();
        teams.add(new GambarHewan("", "Kupu-kupu", ""));
        teams.add(new GambarHewan("", "Semut", ""));
        teams.add(new GambarHewan("", "Lebah", ""));
        teams.add(new GambarHewan("", "Nyamuk", ""));
        teams.add(new GambarHewan("", "Tungau", ""));
        teams.add(new GambarHewan("", "Lalat", ""));
        teams.add(new GambarHewan("", "Jangkrik", ""));
        teams.add(new GambarHewan("", "Mantis", ""));
        teams.add(new GambarHewan("", "Kecoa", ""));
        teams.add(new GambarHewan("", "Capung", ""));
        teams.add(new GambarHewan("", "Belalang", ""));
        teams.add(new GambarHewan("", "Kalajengking", ""));
        teams.add(new GambarHewan("", "Siput", ""));
        teams.add(new GambarHewan("", "Kissing Bug", ""));
        teams.add(new GambarHewan("", "Laba-laba", ""));
        teams.add(new GambarHewan("", "Mole Cricket", ""));
        teams.add(new GambarHewan("", "Rayap", ""));
        teams.add(new GambarHewan("", "", ""));
        teams.add(new GambarHewan("", "", ""));
        teams.add(new GambarHewan("", "", ""));

        GridAdapter adapter = new GridAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}

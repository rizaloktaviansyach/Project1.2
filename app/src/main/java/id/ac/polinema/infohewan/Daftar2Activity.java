package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.adapter.GridAdapter;
import id.ac.polinema.infohewan.model.GambarHewan;

public class Daftar2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar2);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<GambarHewan> teams = new ArrayList<>();
        teams.add(new GambarHewan("", "Hiu", ""));
        teams.add(new GambarHewan("", "Gurita", ""));
        teams.add(new GambarHewan("", "Ubur-ubur", ""));
        teams.add(new GambarHewan("", "Kura-kura", ""));
        teams.add(new GambarHewan("", "Kepiting", ""));
        teams.add(new GambarHewan("", "Bulu Babi", ""));
        teams.add(new GambarHewan("", "Lobster", ""));
        teams.add(new GambarHewan("", "Singa Laut", ""));
        teams.add(new GambarHewan("", "Walrus", ""));
        teams.add(new GambarHewan("", "Lumba-lumba", ""));
        teams.add(new GambarHewan("", "Paus", ""));
        teams.add(new GambarHewan("", "Nemo", ""));
        teams.add(new GambarHewan("", "Belut Laut", ""));
        teams.add(new GambarHewan("", "Godzila", ""));
        teams.add(new GambarHewan("", "Kraken", ""));
        teams.add(new GambarHewan("", "Mermaid Man", ""));
        teams.add(new GambarHewan("", "Bernacle Boy", ""));
        teams.add(new GambarHewan("", "Kerapu", ""));
        teams.add(new GambarHewan("", "Kerang", ""));
        teams.add(new GambarHewan("", "Kuda Laut", ""));

        GridAdapter adapter = new GridAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}

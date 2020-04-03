package id.ac.polinema.infohewan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.infohewan.model.GambarHewan;

public class TampilanActivity extends AppCompatActivity {
    private static final String TAG = "DaftarActivity";
    List<GambarHewan> teams = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        getIncomingIntent();
    }
    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");
            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageDescription = getIntent().getStringExtra("image_desc");
            setImage(imageUrl,imageName,imageDescription);
        }
    }

    private void setImage(String imageUrl,String imageName, String imageDescription){
        Log.d(TAG, "setImage: setting te image and name to widgets.");
        ImageView image = findViewById(R.id.image);
        Glide.with(this).asBitmap().load(imageUrl).into(image);
        TextView name = findViewById(R.id.titleText);
        TextView desc = findViewById(R.id.textDeskripsi);
        desc.setText(imageDescription);
        name.setText(imageName);
    }
}

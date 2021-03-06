package id.ac.polinema.infohewan.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.infohewan.R;
import id.ac.polinema.infohewan.TampilanActivity;
import id.ac.polinema.infohewan.model.GambarHewan;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    private Context context;
    private List<GambarHewan> items;
    public GridAdapter(Context context, List<GambarHewan> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_grid, parent, false);
        return new GridAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final GambarHewan item = items.get(position);
        holder.nameText.setText(item.getName());
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TampilanActivity.class);
                intent.putExtra("image_url", item.getImage());
                intent.putExtra("image_name", item.getName());
                intent.putExtra("image_desc", item.getDescription());
                context.startActivity(intent);
            }
        });
        Glide.with(context).load(item.getImage()).into(holder.imgImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgImage;
        TextView nameText;
        CardView parent_layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
            parent_layout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

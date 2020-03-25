package id.ac.polinema.infohewan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.infohewan.R;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GambarHewan item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getImage()).into(holder.imgImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgImage;
        TextView nameText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}

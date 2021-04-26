package com.example.onthi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<Product>  arrayList;
    private LayoutInflater layoutInflater;

    public ProductAdapter(Context context, ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_product,parent,false);

        return new ProductViewHolder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        Product pro =arrayList.get(position);
        holder.tvName.setText(pro.getName());
        holder.tvMota.setText(pro.getMota());
        holder.tvSl.setText(String.valueOf(pro.getSoLuong()));
        holder.img.setImageResource(pro.getImg());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        ProductAdapter productAdapter;
        TextView tvName,tvMota,tvSl;
        ImageView img;


        public ProductViewHolder(@NonNull View itemView,ProductAdapter productAdapter) {
            super(itemView);
            productAdapter = this.productAdapter;
            tvName=itemView.findViewById(R.id.tvName);
            tvMota=itemView.findViewById(R.id.tvMota);
            tvSl=itemView.findViewById(R.id.tvSL);
           img=itemView.findViewById(R.id.img);
        }
    }
}

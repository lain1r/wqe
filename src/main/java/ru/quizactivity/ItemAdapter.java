package ru.quizactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        Item item = itemList.get(position);
        holder.tvNumber.setText("Номер: " + item.getName());
        holder.tvAmount.setText("Сумма: " + item.getAmount() + " руб.");
        holder.tvDate.setText("Дата: " + item.getDate());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void updateData(List<Item> newItemList){
        this.itemList = newItemList;
        notifyDataSetChanged();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNumber, tvAmount, tvDate;

        ViewHolder(View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.tvChequeNumber);
            tvAmount = itemView.findViewById(R.id.tvChequeAmount);
            tvDate = itemView.findViewById(R.id.tvChequeDate);
        }
    }
}

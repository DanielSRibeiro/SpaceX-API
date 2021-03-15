package com.example.spacex_api.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.Model.Payloads;
import com.example.spacex_api.Model.RocketModel;
import com.example.spacex_api.R;

import java.util.ArrayList;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder> {

    ArrayList<RocketModel> arrayList;

    public MeuAdapter(ArrayList<RocketModel> rocketArray) {
        this.arrayList = rocketArray;
    }

    @NonNull
    @Override
    public MeuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meu_adapter, parent, false);
        return new MeuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeuViewHolder holder, int position) {
        RocketModel arrayLists = arrayList.get(position);
        holder.textViewSucesso.setText("Falha na Missão");
        holder.textViewNome.setText("Nome: "+ arrayLists.getRocketName());
        holder.textViewData.setText("Lançamento: "+arrayLists.getData());

        if(arrayLists.getSucesso()){
            holder.textViewSucesso.setText("Sucesso na Missão");
        }

        for (Payloads payloads : arrayLists.getRocket().getSecondStage().getPayloads()){

            holder.textViewTipo.setText(payloads.getTipo());
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MeuViewHolder extends RecyclerView.ViewHolder{

        TextView textViewNome, textViewData, textViewSucesso, textViewTipo;

        public MeuViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNome = itemView.findViewById(R.id.textViewNome);
            textViewData = itemView.findViewById(R.id.textViewData);
            textViewSucesso = itemView.findViewById(R.id.textViewSucesso);
            textViewTipo = itemView.findViewById(R.id.textViewTipo);
        }
    }
}

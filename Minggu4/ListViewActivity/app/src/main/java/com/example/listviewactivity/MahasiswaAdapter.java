package com.example.listviewactivity;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int vierType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa, parent, false);
        return new  MahasiswaViewHolder(view);

    }



    
    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.txtName.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtNoHp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() { return (dataList != null) ? dataList.size() : 0; }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName, txtNim , txtNoHp;

        public MahasiswaViewHolder (View itemview){
            super (itemview);
            txtName = (TextView) itemview.findViewById(R.id.txt_namamahasiswa);
            txtNim = (TextView) itemview.findViewById(R.id.txt_nimmahasiswa);
            txtNoHp = (TextView) itemview.findViewById(R.id.txt_nohpmahasiswa);
        }
    }

}

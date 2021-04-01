package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nana", "E41192308", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Hinata", "E41192348", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Klee", "E41198753", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Christa", "E41197623", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Eren", "E41199741", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Reki", "E41191307", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Langa", "E41196632", "123456789"));
    }
}

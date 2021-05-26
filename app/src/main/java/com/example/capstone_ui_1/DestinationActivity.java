package com.example.capstone_ui_1;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;


import com.example.capstone_ui_1.Data.ChosunDAO;
import com.example.capstone_ui_1.Data.ChosunDTO;
import com.example.capstone_ui_1.Data.CustomAdapter;
import com.example.capstone_ui_1.Data.LaLo;
import com.example.capstone_ui_1.Data.RecyclerViewClickInterface;

import java.util.ArrayList;
import java.util.List;


public class DestinationActivity extends AppCompatActivity implements RecyclerViewClickInterface {
    private RecyclerView recyclerView;
    CustomAdapter adapter;

    //세부 목적지 배열
    ArrayList<ChosunDTO> chosunList;
    ArrayList<ChosunDTO> laloList;
    //자동완성용 배열
    ArrayList<String> chosuns = new ArrayList<>();
    ArrayList<com.example.capstone_ui_1.Data.LaLo> lalos = new ArrayList<>();

    ChosunDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination2);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //DB에서 테이블 불러오기
        initDB();


        adapter = new CustomAdapter(chosunList, this, this);

        recyclerView.setAdapter(adapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("목적지를 입력하세요.");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s.toString());
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    private void initDB() {
        loadBuilding();
        setChosunList(chosuns, chosunList);
        setLaloList(lalos, laloList);

        loadBP();

    }

    private void loadBP() {
        dao = new ChosunDAO(getApplicationContext());
        dao.createDatabase();
        dao.open();
    }

    private void loadBuilding() {
        ChosunDAO dao = new ChosunDAO(getApplicationContext());

        dao.createDatabase();
        dao.open();
        chosunList = dao.getTableData();
        laloList = dao.getTableData();
        dao.close();
    }

    private void setChosunList(ArrayList<String> chosuns, ArrayList<ChosunDTO> chosunList) {
        for (ChosunDTO o : chosunList) {
            chosuns.add(o.getBuilding());
            chosuns.add(o.getMajor());
            chosuns.add(o.getProfessor());
            chosuns.add(Double.toString(o.getLatitude()));
            chosuns.add(Double.toString(o.getLongtitude()));
        }
    }

    private void setLaloList(ArrayList<LaLo> lalos, ArrayList<ChosunDTO> laloList) {
        for (ChosunDTO o : laloList) {
            LaLo lalo = new LaLo();
            lalo.setLa(o.getLatitude());
            lalo.setLo(o.getLongtitude());
            lalos.add(lalo);
        }
    }

    @Override
    public void onItemClick(int position) {
        //Toast.makeText(this, Double.toString(lalos.get(position).getLa()) + " " + Double.toString(lalos.get(position).getLo()), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Lo", lalos.get(position).getLo());
        intent.putExtra("La", lalos.get(position).getLa());
        startActivityForResult(intent,101);
    }

    @Override
    public void onLongItemClick(int position) {
        chosuns.remove(position);
        lalos.remove(position);
//        CustomAdapter.notifyItemRemoved(position);
    }


}

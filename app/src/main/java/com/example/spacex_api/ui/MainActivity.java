package com.example.spacex_api.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.spacex_api.Model.RocketModel;
import com.example.spacex_api.Network.APIService;
import com.example.spacex_api.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RocketModel> rocketArray = new ArrayList<RocketModel>();
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        chamaRetrofit();

    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void chamaRetrofit() {
        APIService service = ApiClient.getService();
        service.getRockets("desc").enqueue(new Callback<ArrayList<RocketModel>>() {
            @Override
            public void onResponse(Call<ArrayList<RocketModel>> call, Response<ArrayList<RocketModel>> response) {
                Log.d("TAG", "onResponse: ");

                if (response.isSuccessful()){
                    rocketArray.addAll(response.body());
                    chamaAdapter();

                } else{
                    Toast.makeText(MainActivity.this, "Code: "+response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<RocketModel>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void chamaAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        progressBar.setVisibility(View.GONE);
        recyclerView.setAdapter(new MeuAdapter(rocketArray));
    }
}
package me.dio.simulator01.R00.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import me.dio.simulator01.R00.data.MatchesApi;
import me.dio.simulator01.R00.domain.Match;
import me.dio.simulator01.databinding.ActivityMainBinding;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private MatchesApi matchesApi;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://luanamouro.github.io/matches_simulator01_api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesApi.class);

    }

    private void setupMatchesList() {
       matchesApi.getMatches().enqueue(new Callback<List<Match>>() {
           @Override
           public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {

           }

           @Override
           public void onFailure(Call<List<Match>> call, Throwable t) {

           }
       });
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas, na ação de swipe.
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas.
    }
}

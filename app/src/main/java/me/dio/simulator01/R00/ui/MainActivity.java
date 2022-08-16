package me.dio.simulator01.R00.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator01.databinding.ActivityMainBinding;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

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
    }

    private void setupMatchesList() {
        //TODO Listar as partidas (api).
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas, na ação de swipe.
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas.
    }
}

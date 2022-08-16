package me.dio.simulator01.R00.data;


import java.util.List;

import me.dio.simulator01.R00.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}

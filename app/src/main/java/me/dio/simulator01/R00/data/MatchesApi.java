package me.dio.simulator01.R00.data;


import java.util.List;

import me.dio.simulator01.R00.domain.Match;
import retrofit2.Call;

public interface MatchesApi {

    Call<List<Match>>;
}

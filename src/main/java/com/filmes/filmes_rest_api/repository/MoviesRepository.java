package com.filmes.filmes_rest_api.repository;

import com.filmes.filmes_rest_api.model.MoviesModel;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<MoviesModel, Integer> {
}
package com.filmes.filmes_rest_api.repository;

import com.filmes.filmes_rest_api.model.RatingsModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface RatingsRepository extends CrudRepository<RatingsModel, Integer> {
    List<RatingsModel> findByCoduser(Integer codUser);
}

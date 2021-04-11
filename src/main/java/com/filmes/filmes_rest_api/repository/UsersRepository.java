package com.filmes.filmes_rest_api.repository;

import com.filmes.filmes_rest_api.model.UsersModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<UsersModel, Integer> {
    Optional<UsersModel> findByEmail(String email);
}

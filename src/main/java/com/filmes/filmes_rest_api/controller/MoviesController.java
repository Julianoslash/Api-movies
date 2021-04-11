package com.filmes.filmes_rest_api.controller;

import com.filmes.filmes_rest_api.model.RatingsModel;
import com.filmes.filmes_rest_api.model.MoviesModel;
import com.filmes.filmes_rest_api.model.UsersModel;
import com.filmes.filmes_rest_api.repository.RatingsRepository;
import com.filmes.filmes_rest_api.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class MoviesController {

    @Autowired
    private MoviesRepository moviesRepository;

    @Autowired
    private RatingsRepository ratingsRepository;

    @GetMapping(path = "/api/movies")
    public List<MoviesModel> getMovies(){
        return (List<MoviesModel>) moviesRepository.findAll();
    }

    @GetMapping(path = "/api/movies/{id}")
    public ResponseEntity getFilmByID(@PathVariable("id") Integer id){
        return moviesRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/movies")
    public MoviesModel saveMovies(@RequestBody MoviesModel movie){
        return moviesRepository.save(movie);
    }

    @DeleteMapping(path = "/api/movies")
    public void deleteMovie(@RequestBody MoviesModel movie){
        moviesRepository.delete(movie);
    }

    @PutMapping(path = "/api/movies")
    public MoviesModel updateMovie(@RequestBody MoviesModel movie){
        return moviesRepository.save(movie);
    }

    @GetMapping(path = "/api/ratings")
    public List<RatingsModel> getRating(){
        return (List<RatingsModel>) ratingsRepository.findAll();
    }

    @GetMapping(path = "/api/ratings/{codUser}")
    public List<RatingsModel> findByEmail(@PathVariable Integer codUser){
        return (List<RatingsModel>) ratingsRepository.findByCoduser(codUser);
    }

    @PostMapping(path = "/api/ratings")
    public RatingsModel saveRating(@RequestBody RatingsModel rating){
        return ratingsRepository.save(rating);
    }

    @DeleteMapping(path = "/api/ratings")
    public void deleteRating(@RequestBody RatingsModel rating){
        ratingsRepository.delete(rating);
    }
    
}

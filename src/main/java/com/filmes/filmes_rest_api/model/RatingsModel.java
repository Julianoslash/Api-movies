package com.filmes.filmes_rest_api.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "ratings")
public class RatingsModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy = "increment")
    public Integer cod_rating;

    @Column(nullable = false)
    public Integer coduser;

    @Column(nullable = false)
    public Integer cod_movie;

    @Column(nullable = false)
    public Integer rating;

    public Integer getCod_rating() {
        return cod_rating;
    }

    public void setCod_rating(Integer cod_rating) {
        this.cod_rating = cod_rating;
    }

    public Integer getCod_user() {
        return coduser;
    }

    public void setCod_user(Integer cod_user) {
        this.coduser = cod_user;
    }

    public Integer getCod_movie() {
        return cod_movie;
    }

    public void setCod_movie(Integer cod_movie) {
        this.cod_movie = cod_movie;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
package com.filmes.filmes_rest_api.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "movies")
public class MoviesModel {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy = "increment")
    public Integer cod_movie;

    @Column(nullable = false, length = 50)
    public String title;

    @Column(nullable = false, length = 10)
    public String date_launch;

    @Column(nullable = false, length = 250)
    public String info;

    public Integer getCod_movie() {
        return cod_movie;
    }

    public void setCod_movie(Integer cod_movie) {
        this.cod_movie = cod_movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_launch() {
        return date_launch;
    }

    public void setDate_launch(String date_launch) {
        this.date_launch = date_launch;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

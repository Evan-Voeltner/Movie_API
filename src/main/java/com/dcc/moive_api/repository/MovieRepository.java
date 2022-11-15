package com.dcc.moive_api.repository;

import com.dcc.moive_api.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    public List<Movie> findByGenre(String genre);
}

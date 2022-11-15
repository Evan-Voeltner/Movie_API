package com.dcc.moive_api.repository;

import com.dcc.moive_api.data.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}

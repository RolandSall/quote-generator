package com.example.myfirstspringbootapplication.repos;

import com.example.myfirstspringbootapplication.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface QuoteRepository extends JpaRepository<Quote, UUID> {










  /*  @Query(value = "SELECT * FROM quote ORDER BY random() LIMIT 1 ", nativeQuery = true)
    Quote getRandomQuote ();*/

}

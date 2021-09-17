package com.example.myfirstspringbootapplication.services;

import com.example.myfirstspringbootapplication.models.Quote;
import com.example.myfirstspringbootapplication.repos.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class QuoteService implements IQuoteService {

    private QuoteRepository quoteRepository;

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public void createQuote(Quote quote) {
        UUID quoteUUID = UUID.randomUUID();
        quote.setId(quoteUUID);
        quoteRepository.save(quote);
    }




    /*@Override
    public Quote getRandomQuote() {
        return quoteRepository.getRandomQuote();
    }*/
}

package com.example.myfirstspringbootapplication.controllers.quote;

import com.example.myfirstspringbootapplication.models.Quote;
import com.example.myfirstspringbootapplication.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quotes")
public class QuoteController {


    private QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @PostMapping
    public ResponseEntity<?> createQuote(@RequestBody QuoteApiRequest request) {
        try {
            Quote quote = getQuoteModelFromRequest(request);
            quoteService.createQuote(getQuoteModelFromRequest(request));
            return ResponseEntity.status(HttpStatus.CREATED).body("Created");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }





    /*
    @GetMapping("/random")
    public ResponseEntity<?> getRandomQuote() {
        try {
            Quote randomQuote = quoteService.getRandomQuote();
            return ResponseEntity.status(HttpStatus.OK).body(randomQuote);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
*/

    private Quote getQuoteModelFromRequest(QuoteApiRequest request) {
        return Quote.builder()
                .name(request.getName())
                .text(request.getText())
                .build();
    }

}

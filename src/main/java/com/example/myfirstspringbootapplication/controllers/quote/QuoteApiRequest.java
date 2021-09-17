package com.example.myfirstspringbootapplication.controllers.quote;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class QuoteApiRequest {
    private String text;
    private String name;
}

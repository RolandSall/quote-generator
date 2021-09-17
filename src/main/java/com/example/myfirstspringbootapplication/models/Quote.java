package com.example.myfirstspringbootapplication.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Quote {

    @Id
    private UUID id;
    private String text;
    private String name;


}



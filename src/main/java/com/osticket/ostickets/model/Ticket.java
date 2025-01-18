package com.osticket.ostickets.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection="Ticket")
public class Ticket {
    
    @Id
    private String id;
    private String description;
    private String datetime;
    
   


    
}

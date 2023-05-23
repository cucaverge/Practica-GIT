package com.coderhouse.Clase8.controller;


import com.coderhouse.Clase8.middleware.ResponseHandler;
import com.coderhouse.Clase8.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClientController {
    /*@Autowired
    private ClientService clientService;*/

    @PostMapping
    public ResponseEntity postClient(@RequestBody Client client) {
        try {
            System.out.println(client);

            ClientController clientService = null;
            ResponseEntity clientSaved = clientService.postClient(client);
            return ResponseHandler.generateResponse(
                    "Data retrieved successfully",
                    HttpStatus.OK,
                    clientSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }
}
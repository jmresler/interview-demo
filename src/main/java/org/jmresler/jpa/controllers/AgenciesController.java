package org.jmresler.jpa.controllers;

import org.jmresler.jpa.model.Agencies;
import org.jmresler.jpa.model.dtos.AgenciesDTO;
import org.jmresler.jpa.services.AgenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = AgenciesController.PATH)
@RestController
public class AgenciesController {

    public static final String PATH = "/agencies";

    @Autowired
    protected AgenciesService service;

    @GetMapping(path = "/id/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Agencies> getAgenciesById(@PathVariable("id") final Integer id) {
        var agencies = service.findAgenciesById(id);
        return ResponseEntity.ok(agencies);
    }

    @GetMapping(path = "/ori/{ori}", consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AgenciesDTO>> getAgenciesByOri(@PathVariable("ori") final String ori) {
        var agenciesList = service.findAgenciesByOri(ori);
        return ResponseEntity.ok(agenciesList);
    }

}

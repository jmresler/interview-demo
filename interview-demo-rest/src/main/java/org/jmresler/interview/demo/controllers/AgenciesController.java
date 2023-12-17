package org.jmresler.interview.demo.controllers;

import org.jmresler.interview.demo.services.AgenciesService;
import org.jmresler.interview.demo.model.Agencies;
import org.jmresler.interview.demo.model.dtos.AgenciesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = AgenciesController.PATH)
public class AgenciesController {

    public static final String PATH = "/agencies";

    @Autowired
    protected AgenciesService service;

    @GetMapping(path = "/byid/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Agencies> getAgenciesById(@PathVariable("id") final Integer id) {
        var agencies = service.findAgenciesById(id);
        return ResponseEntity.ok(agencies);
    }

    @GetMapping(path = "/byori/{ori}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AgenciesDTO>> getAgenciesByOri(@PathVariable("ori") final String ori) {
        var agenciesList = service.findAgenciesByOri(ori);
        return ResponseEntity.ok(agenciesList);
    }

}

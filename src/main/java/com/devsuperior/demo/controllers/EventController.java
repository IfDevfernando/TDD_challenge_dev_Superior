package com.devsuperior.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.services.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	
	@Autowired
	private EventService service;

	@PutMapping(value = "/{id}")
	public ResponseEntity<EventDTO> delete(@PathVariable long id, @RequestBody EventDTO dto) {
		return ResponseEntity.ok(service.update(id, dto));
	}

}

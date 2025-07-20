package com.selise.studio.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selise.studio.api.model.dto.StudioDto;
import com.selise.studio.api.model.response.Response;
import com.selise.studio.api.service.StudioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/studios")
public class StudioController {
    
    @Autowired
    private StudioService studioService;

    @GetMapping("")
    public ResponseEntity<Response<StudioDto>> getAllStudios() {
        return ResponseEntity.ok().body(studioService.getAllStudios());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Response<StudioDto>> getStudioById(@PathVariable Long id) {
        return ResponseEntity.ok().body(studioService.getStudioById(id));
    }

    @GetMapping("/search?area={area}")
    public ResponseEntity<Response> getStudioByArea(@PathVariable String area) {
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/nearby?lat={lat}&lng={lng}&radius={radiusInKm}")
    public ResponseEntity<Response> getNearbyStudio(
        @PathVariable double lat, 
        @PathVariable double lng, 
        @PathVariable int radiusInKm
    ) {
        return ResponseEntity.ok().body(null);
    }
}

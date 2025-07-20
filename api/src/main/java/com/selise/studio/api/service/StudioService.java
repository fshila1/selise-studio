package com.selise.studio.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selise.studio.api.model.dto.StudioDto;
import com.selise.studio.api.model.entity.Studio;
import com.selise.studio.api.model.response.Response;
import com.selise.studio.api.repository.StudioRepository;

@Service
public class StudioService {

    @Autowired
    private StudioRepository studioRepository;
    
    public Response<StudioDto> getAllStudios() {
        Response<StudioDto> response = new Response<StudioDto>(2000, "fail", null, null);
        List<StudioDto> studioList = studioRepository.findAll().stream()
        .map(studio -> new StudioDto(studio.getId(), studio.getName(), studio.getType(), 
            studio.getLocationId(), studio.getContactId(), studio.getDescription(), 
            studio.getPricePerHour(), studio.getCurrency(), studio.getRating()))
        .collect(Collectors.toList());

        response.setResponseCode(1000);
        response.setResponseStatus("success");
        response.setDataList(studioList);
        return response;
    }

    public Studio getExistingStudio(Long id) {
        Studio studio = null;
        if(studioRepository.findById(id).isPresent()) 
            return studioRepository.findById(id).get();
        return studio;
    }

    public Response<StudioDto> getStudioById(Long id) {
        Response<StudioDto> response = new Response<StudioDto>(2000, "fail", null, null);
        Studio studio = getExistingStudio(id);
        if(studio != null) {
            response.setResponseCode(1000);
            response.setResponseStatus("success");
            response.setDataObj(new StudioDto(studio.getId(), studio.getName(), studio.getType(), 
                studio.getLocationId(), studio.getContactId(), studio.getDescription(), 
                studio.getPricePerHour(), studio.getCurrency(), studio.getRating()));
        } else {
            response.setResponseStatus("not_found");
        }
        return response;
    }

    public Response<StudioDto> getStudioByArea() {
        Response<StudioDto> response = new Response<StudioDto>(2000, "fail", null, null);
        return response;
    }

    public Response<StudioDto> getNearbyStudio() {
        Response<StudioDto> response = new Response<StudioDto>(2000, "fail", null, null);
        return response;
    }
}

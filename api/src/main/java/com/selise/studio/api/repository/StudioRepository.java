package com.selise.studio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selise.studio.api.model.entity.Studio;

@Repository
public interface StudioRepository extends JpaRepository<Studio, Long> {
    
}

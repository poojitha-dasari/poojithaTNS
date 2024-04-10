package com.example.service;

import java.util.List;

import com.example.entity.Placement;

public interface PlacementService {

	Placement savePlacement(Placement placement);

	List<Placement> fetchPlacementList();

	Placement fetchPlacementById(Long id);

	void deletePlacementById(Long id);

	

}

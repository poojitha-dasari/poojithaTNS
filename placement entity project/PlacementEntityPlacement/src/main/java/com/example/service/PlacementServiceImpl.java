package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.example.entity.Placement;
import com.example.repository.PlacementRepository;

//import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;

@Service
public class PlacementServiceImpl implements PlacementService {
	
	
	@Autowired
    private PlacementRepository placementRepository;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return placementRepository.save(placement);
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return placementRepository.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return placementRepository.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		
		 placementRepository.deleteById(id);
		
	}
	
	
	
	

}

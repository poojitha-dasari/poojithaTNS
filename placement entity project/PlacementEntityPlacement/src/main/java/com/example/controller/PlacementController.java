package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.example.entity.Placement;
import com.example.service.PlacementService;

//import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;

@RestController
public class PlacementController {
	
	@Autowired
    private PlacementService placementService;
	
	@PostMapping("/placements")
	public Placement savePlacement(@RequestBody Placement placement) {
    	
    	return placementService.savePlacement(placement);
		
	}
	
	
	 @GetMapping("/placements")
	    public List<Placement> fetchPlacementList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return placementService.fetchPlacementList();
	    }
	
	 
	 
	 @GetMapping("/placements/{id}")
	    public Placement fetchPlacementById(@PathVariable("id") Long id)
	            {
	        return placementService.fetchPlacementById(id);
	    }
	 
	 
	  @DeleteMapping("/placements/{id}")
	    public String deletePlacementById(@PathVariable("id") Long id) {
		  placementService.deletePlacementById(id);
	        return "Placement deleted Successfully!!";
	    }
	 
	 
	
}

package com.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app2.dao.FlatDao;
import com.app2.exceptions.FlatException;
import com.app2.model.Flat;

@RestController
public class MyController {
	
	@Autowired
	private FlatDao flatDao;
	
	
	@PostMapping("/addflat")
	public ResponseEntity<Flat> saveDetails(@RequestBody Flat flat) {
		Flat flat2= flatDao.save(flat);
		return new ResponseEntity<>(flat2,HttpStatus.CREATED);
	}
	
	@GetMapping("/getflats")
	public ResponseEntity<List<Flat>> getFlats(){
		List<Flat> flats= flatDao.findAll();
		
		return new ResponseEntity<>(flats,HttpStatus.OK);
	}
	
	
	@GetMapping("/getflat/{id}")
	public Flat getFlatById(@PathVariable("id") Integer id) {
		return flatDao.findById(id).orElseThrow(() -> new FlatException("Flat does not exists with this "+id));
	}
	
	@PutMapping("/updateprice/{id}")
	public String updateFlatPriceById(@PathVariable("id") Integer id,@RequestParam("price") Integer price) {
		
		Flat flat= flatDao.findById(id).orElseThrow(() -> new FlatException("Flat does not exists with this "+id));
		if(flat!=null) {
			flat.setPrice(price);
		
			flatDao.save(flat);
			return "updated successfully";
		}
		else throw new FlatException("WRONG ID.....");
	}
	
	@PutMapping("/updatenumberofrooms/{id}")
	public String updateNumberOfRoomsById(@PathVariable("id") Integer id,@RequestParam("numberofroom") Integer rooms) {
		
		Flat flat= flatDao.findById(id).orElseThrow(() -> new FlatException("Flat does not exists with this "+id));
		if(flat!=null) {
			flat.setNoOfRooms(rooms);
		    
			flatDao.save(flat);
			return "updated successfully";
		}
		else throw new FlatException("WRONG ID.....");
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") Integer id) {
		
		Flat flat= flatDao.findById(id).orElseThrow(() -> new FlatException("No Flat exists with this "+id));
		if(flat!=null) {
			 
			flatDao.deleteById(id);
			return "deleted successfully";
		}
		else throw new FlatException("WRONG ID.....");
	}

	
	
	
	
	
}

package elasticsearch.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elasticsearch.project.document.Vehicle;
import elasticsearch.project.service.VehicleService;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
	
	private final VehicleService service;
	
	@Autowired
	public VehicleController(VehicleService service) {
		this.service = service;
	}
	
	@PostMapping
	public void index(@RequestBody final Vehicle vehicle) {
		service.index(vehicle);
	}
	
	@GetMapping("/{id}")
	public Vehicle getById(@PathVariable final String id) {
		return service.getById(id);
	}
}

package elasticsearch.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elasticsearch.project.document.Vehicle;
import elasticsearch.project.search.SearchRequestDTO;
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
	
	@PostMapping("/search")
	public List<Vehicle> search(@RequestBody final SearchRequestDTO dto) {
		return service.search(dto);
	}
	
	@GetMapping("/search/{date}")
	public List<Vehicle> searchByDate(@PathVariable 
			                          @DateTimeFormat(pattern = "yyyy-MM-dd")
			                          final Date date) {
		return service.searchByDate(date);
	}
	
	@PostMapping("/search_by_date/{date}")
	public List<Vehicle> searchByDate(@RequestBody final SearchRequestDTO dto,
			                          @PathVariable
			                          @DateTimeFormat(pattern = "yyyy-MM-dd")
	                                  final Date date) {
		return service.searchByDate(dto, date);
	}
}

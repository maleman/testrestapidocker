package ni.maleman.testrestapi.controller.oilconsumption;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ni.maleman.testrestapi.dao.entity.OilConsumption;
import ni.maleman.testrestapi.dao.repository.OilConsumptionRepository;

@RestController
@RequestMapping("/api/v1/")
public class OilConsumptionController {

	private OilConsumptionRepository repository;
	
	@Autowired
	OilConsumptionController(OilConsumptionRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/oilconsumption")
	List<OilConsumption> all(){
		return repository.findAll();
	}
}

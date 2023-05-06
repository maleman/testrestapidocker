package ni.maleman.testrestapi.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ni.maleman.testrestapi.dao.entity.OilConsumption;

public interface OilConsumptionRepository extends JpaRepository<OilConsumption, Long> {

}

package ni.maleman.testrestapi.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="test_api_rest" ,name = "t_oil")
public class OilConsumption {
	
	public OilConsumption() {
		
	}
	
	public OilConsumption(Long id, String region, String country, Integer year, Integer production,
			Integer consumption) {
		super();
		this.id = id;
		this.region = region;
		this.country = country;
		this.year = year;
		this.production = production;
		this.consumption = consumption;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "production")
	private Integer production;
	
	@Column(name = "consumption")
	private Integer consumption;
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getProduction() {
		return production;
	}
	public void setProduction(Integer production) {
		this.production = production;
	}
	public Integer getConsumption() {
		return consumption;
	}
	public void setConsumption(Integer consumption) {
		this.consumption = consumption;
	}
}

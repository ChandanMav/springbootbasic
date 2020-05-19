/**
 * 
 */
package cta.accenture.com.graph.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chandan.w.kumar
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String gender;
	private String city;
	private String district;
	private String state;
	private String nationality;
	private Date confirmedTime;
	private String statecode;
	@JsonProperty("lat")
	private String addressLat;
	@JsonProperty("long")
	private String addressLong;

}

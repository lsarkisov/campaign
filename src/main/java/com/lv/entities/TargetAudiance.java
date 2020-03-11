package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class TargetAudiance {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private ArrayList<Integer> ageRange;
	private ArrayList<String> languages;
	private ArrayList<String> genders;
	private ArrayList<String> locations;
	private ArrayList<String> interests;
	private ArrayList<String> KeyWords;

	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "target_id")
	private List<TargetAudiance> platformId;
}
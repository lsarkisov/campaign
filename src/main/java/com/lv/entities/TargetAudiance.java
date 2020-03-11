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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@Basic
	private ArrayList<Integer> ageRange;
	private ArrayList<String> languages;
	private ArrayList<String> genders;
	private ArrayList<String> locations;
	private ArrayList<String> interests;
	private ArrayList<String> KeyWords;

	@OneToMany
	@JoinColumn(name = "fb_target_id")
	@JsonIgnore
	private List<TargetAudiance> facebookId;
}
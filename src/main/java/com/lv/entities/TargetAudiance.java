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

	@Column(name = "age_range")
	private ArrayList<Integer> ageRange;

	@Column(name = "languages")
	private ArrayList<String> languages;

	@Column(name = "genders")
	private ArrayList<String> genders;

	@Column(name = "locations")
	private ArrayList<String> locations;

	@Column(name = "interests")
	private ArrayList<String> interests;

	@Column(name = "key_words")
	private ArrayList<String> KeyWords;

	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "target_id")
	private List<TargetAudiance> platformId;
}
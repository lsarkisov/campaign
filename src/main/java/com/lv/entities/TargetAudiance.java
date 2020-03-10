package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@NoArgsConstructor
public class TargetAudiance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Basic
	private ArrayList<Integer> ageRange;
	private ArrayList<String> languages;
	private ArrayList<String> genders;
	private ArrayList<String> locations;
	private ArrayList<String> interests;
	private ArrayList<String> keyWords;

	@OneToOne
	private TargetAudiance targetId;

	@OneToOne
	@JoinColumn(name = "fb_target_id")
	private Facebook facebookId;

	@OneToOne(mappedBy = "targetAudiance")
	private Google google;

	@OneToOne(mappedBy = "targetAudiance")
	private Instagram instagram;
}
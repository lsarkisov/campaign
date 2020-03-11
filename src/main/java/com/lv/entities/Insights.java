package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Insights {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double clickThroughRate;
	private Long websiteVisits;
	private double costPerClick;
	private double advancedKpi1;
	private Long clicks;
	private Long impressions;
	private double advancedKpi2;
	private double nanosScore;

	@OneToMany
	@JoinColumn(name = "insights_id")
	@JsonIgnore
	private List<Insights> platformId;
}

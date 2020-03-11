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

	@Column(name = "clicks")
	private Long clicks;

	@Column(name = "impressions")
	private Long impressions;

	@Column(name = "website_visits")
	private Long websiteVisits;

	@Column(name = "nanos_score")
	private double nanosScore;

	@Column(name = "cost_per_click")
	private double costPerClick;

	@Column(name = "advanced_kpi_1")
	private double advancedKpi1;

	@Column(name = "advanced_kpi_2")
	private double advancedKpi2;

	@Column(name = "click_through_rate")
	private double clickThroughRate;

	@OneToMany
	@JoinColumn(name = "insights_id")
	@JsonIgnore
	private List<Insights> platformId;
}

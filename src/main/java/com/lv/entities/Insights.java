package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Insights {

	@Id
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

	@OneToOne
	private Insights insightId;

	@OneToOne(mappedBy = "facebookId")
	private Facebook facebook;

	@OneToOne(mappedBy = "insights")
	private Google google;

	@OneToOne(mappedBy = "insights")
	private Instagram instagram;
}

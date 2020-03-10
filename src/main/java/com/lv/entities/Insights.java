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

	@OneToOne(mappedBy = "insights")
	private Facebook facebook;

	@OneToOne(mappedBy = "insights")
	private Google google;

	@OneToOne(mappedBy = "insights")
	private Instagram instagram;

	@Override
 	public String toString(){
		return 
			"Insights{" + 
			"click_through_rate = '" + clickThroughRate + '\'' + 
			",website_visits = '" + websiteVisits + '\'' + 
			",cost_per_click = '" + costPerClick + '\'' + 
			",advanced_kpi_1 = '" + advancedKpi1 + '\'' + 
			",clicks = '" + clicks + '\'' + 
			",impressions = '" + impressions + '\'' + 
			",advanced_kpi_2 = '" + advancedKpi2 + '\'' + 
			",nanos_score = '" + nanosScore + '\'' + 
			"}";
		}
}

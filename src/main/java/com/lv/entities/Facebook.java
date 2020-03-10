package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Facebook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime endDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime startDate;

	@OneToOne(
			targetEntity = TargetAudiance.class,
			mappedBy = "targetId",
			cascade = CascadeType.ALL)
	@JoinColumn
	private TargetAudiance targetAudiance;

	@OneToOne(
			targetEntity = Insights.class,
			mappedBy = "insightId",
			cascade = CascadeType.ALL)
	@JoinColumn
	private Insights insights;

	@OneToOne(
			targetEntity = Creatives.class,
			mappedBy = "creativesId",
			cascade = CascadeType.ALL)
	@JoinColumn
	private Creatives creatives;

	private Long totalBudget;
	private Long remainingBudget;
	private String status;

    @OneToOne
	@JsonIgnore
    private Platforms facebookId;
}

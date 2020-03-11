package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Facebook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@NotNull
	@Column(name = "start_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@NotNull
	@Column(name = "end_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

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

	@Column(name = "total_budget")
	private Long totalBudget;

	@Column(name = "remaining_budget")
	private Long remainingBudget;

	private String status;

    @OneToOne
	@JsonIgnore
    private Platforms facebookId;
}

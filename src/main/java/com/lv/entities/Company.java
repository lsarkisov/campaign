package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@MappedSuperclass
public class Company {
    @Id
    @JsonIgnore
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

    @ManyToOne(
            targetEntity = TargetAudiance.class,
            cascade = CascadeType.ALL)
    @JoinColumn
    private TargetAudiance targetAudiance;

    @ManyToOne(
            targetEntity = Insights.class,
            cascade = CascadeType.ALL)
    @JoinColumn
    private Insights insights;

    @ManyToOne(
            targetEntity = Creatives.class,
            cascade = CascadeType.ALL)
    @JoinColumn
    private Creatives creatives;

    @Column(name = "total_budget")
    private Long totalBudget;

    @Column(name = "remaining_budget")
    private Long remainingBudget;

    private String status;
}

package com.lv.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@MappedSuperclass
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = DateTimeFormat.ISO.DATE_TIME)
    private long startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = DateTimeFormat.ISO.DATE_TIME)
    private Long endDate;

    @OneToOne(cascade = CascadeType.ALL)
    private TargetAudiance targetAudiance;

    @OneToOne(cascade = CascadeType.ALL)
    private Insights insights;

    @OneToOne(cascade = CascadeType.ALL)
    private Creatives creatives;

    private Long totalBudget;
    private Long remainingBudget;
    private String status;

    @OneToOne
    private Platforms platform;

    @Override
    public String toString() {
        return "Companies{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", targetAudiance=" + targetAudiance +
                ", insights=" + insights +
                ", creatives=" + creatives +
                ", totalBudget=" + totalBudget +
                ", remainingBudget=" + remainingBudget +
                ", status='" + status + '\'' +
                ", platform=" + platform +
                '}';
    }
}
package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Instagram {
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
    @JoinColumn(name = "instagram_id")
    private Platforms instagramId;
}

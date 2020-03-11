package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class PlatformsData {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "goal")
  private String goal;

  @Column(name = "total_budget")
  private Long totalBudget;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "status")
  private String status;

  @ManyToOne(
          targetEntity = Platform.class,
          cascade = CascadeType.ALL)
  @JoinColumn
  private Platform platforms;

}

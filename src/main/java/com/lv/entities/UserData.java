package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class UserData {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String goal;

  @Column(name = "total_budget")
  private int totalBudget;
  private String name;
  private String status;

  @ManyToOne(
          targetEntity = Platforms.class,
          cascade = CascadeType.ALL)
  @JoinColumn
  private Platforms platforms;

}

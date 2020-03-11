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
  private String goal;
  private Long totalBudget;
  private String name;
  private String status;

  @ManyToOne(
          targetEntity = Platform.class,
          cascade = CascadeType.ALL)
  @JoinColumn
  private Platform platforms;

}

package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class UserData {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String goal;
  private int totalBudget;
  private String name;
  private String status;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn
  private Platform platforms;

  @Override
  public String toString() {
    return "UserData{"
        + "goal = '"
        + goal
        + '\''
        + ",total_budget = '"
        + totalBudget
        + '\''
        + ",name = '"
        + name
        + '\''
        + ",id = '"
        + id
        + '\''
        + ",status = '"
        + status
        + '\''
        + ",platforms = '"
        + platforms
        + '\''
        + "}";
  }
}

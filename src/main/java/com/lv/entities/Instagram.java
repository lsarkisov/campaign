package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Instagram extends Company {
    @OneToOne
    @JoinColumn(name = "instagram_id")
    @JsonIgnore
    private Platform platformId;
}

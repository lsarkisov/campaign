package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Instagram extends Company {
    @OneToOne
    @JoinColumn(name = "instagram_id")
    private Platform platformId;
}

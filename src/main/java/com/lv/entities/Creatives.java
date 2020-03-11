package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Creatives {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String image;
	private String header;
	private String description;
	private String url;
	private String header2;
	private String header1;

	@OneToMany
	@JoinColumn(name = "creatives_id")
	@JsonIgnore
	private List<Creatives> platformId;
}

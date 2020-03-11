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

	private String url;
	private String image;
	private String description;

	private String header;

	@Column(name = "header_1")
	private String header_1;

	@Column(name = "header_2")
	private String header_2;

	@OneToMany
	@JsonIgnore
	@JoinColumn(name = "creatives_id")
	private List<Creatives> platformId;
}

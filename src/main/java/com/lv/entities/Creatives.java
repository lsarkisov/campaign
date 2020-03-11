package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Creatives {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "url", nullable = false)
	private String url;

	@Column(name = "image", nullable = false)
	private String image;

	@Size(min = 10, max = 500)
	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "header")
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

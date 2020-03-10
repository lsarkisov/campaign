package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Creatives {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String image;
	private String header;
	private String description;
	private String url;
	private String header2;
	private String header1;

	@OneToOne
	private Creatives creativesId;

	@OneToOne(mappedBy = "facebookId")
	private Facebook facebook;

	@OneToOne(mappedBy = "creatives")
	private Google google;

	@OneToOne(mappedBy = "creatives")
	private Instagram instagram;
}

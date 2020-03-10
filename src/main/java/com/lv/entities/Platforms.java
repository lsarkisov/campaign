package com.lv.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Platforms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Long id;

	@ManyToOne(
			targetEntity = Facebook.class,
			cascade = CascadeType.ALL)
	@JoinColumn
	private Facebook facebook;

	@OneToOne(
			targetEntity = Google.class,
			mappedBy = "googleId",
			cascade = CascadeType.ALL)
	@JoinColumn
	private Google google;

	@OneToOne(
			targetEntity = Instagram.class,
			mappedBy = "instagramId",
			cascade = CascadeType.ALL)
	@JoinColumn
	private Instagram instagram;

	@OneToMany
	@JsonIgnore
	private List<Platforms> userData;
}

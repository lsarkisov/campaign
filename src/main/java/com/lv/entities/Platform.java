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
public class Platform {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(
			targetEntity = Facebook.class,
			cascade = CascadeType.ALL)
	@JoinColumn
	private Facebook facebook;

	@ManyToOne(
			targetEntity = Google.class,
			cascade = CascadeType.ALL)
	@JoinColumn
	private Google google;

	@ManyToOne(
			targetEntity = Instagram.class,
			cascade = CascadeType.ALL)
	@JoinColumn
	private Instagram instagram;

	@OneToMany
	@JsonIgnore
	private List<Platform> userData;
}

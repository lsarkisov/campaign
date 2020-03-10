package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Platform {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Facebook facebook;

	@OneToOne(cascade = CascadeType.ALL)
	private Google google;

	@OneToOne(cascade = CascadeType.ALL)
	private Instagram instagram;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Platform> userData;

	@Override
 	public String toString(){
		return 
			"Platform{" +
			"facebook = '" + facebook + '\'' + 
			",google = '" + google + '\'' + 
			",instagram = '" + instagram + '\'' + 
			"}";
		}
}

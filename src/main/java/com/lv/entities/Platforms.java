package com.lv.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Platforms{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private Facebook facebook;

	@OneToOne(cascade = CascadeType.ALL)
	private Google google;

	@OneToOne(cascade = CascadeType.ALL)
	private Instagram instagram;

	@Override
 	public String toString(){
		return 
			"Platforms{" + 
			"facebook = '" + facebook + '\'' + 
			",google = '" + google + '\'' + 
			",instagram = '" + instagram + '\'' + 
			"}";
		}
}

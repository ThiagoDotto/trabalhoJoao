package br.com.thiago.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value="vod")
public class Vodcar extends Bebida {

	
	private int qntDestilado;
}

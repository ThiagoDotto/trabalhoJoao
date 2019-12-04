package br.com.thiago.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Data
@DiscriminatorValue(value = "Vin")
@Entity
public class Vinho extends Bebida {

	private String idade;


	@Enumerated(EnumType.STRING)
	private TipoVinho tipo;

}

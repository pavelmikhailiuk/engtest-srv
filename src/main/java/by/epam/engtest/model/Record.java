package by.epam.engtest.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Record {
	@Id
	@GeneratedValue
	private Long id;

	@Column
	@NotBlank
	private String rusWord;
	@Column
	@NotBlank
	private String engWord;
	@Column
	private String glossary;
	@Column
	private String history;
}

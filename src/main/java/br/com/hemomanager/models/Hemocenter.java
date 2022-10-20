package br.com.hemomanager.models;

import java.io.Serializable;
import java.sql.Time;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_HEMOCENTER")
public class Hemocenter implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Column(length = 100)
    private String name;

    @NotBlank
    @Column(length = 15)
    private String cnpj;

    @NotBlank
    @Column(length = 15)
    private String cep;

    @NotBlank
    @Column(length = 45)
    private String street;

    private Time startOperation;

    private Time endOperation;

    private Integer quantityService;
}

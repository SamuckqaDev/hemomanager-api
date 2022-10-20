package br.com.hemomanager.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TB_STOCK")
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDateTime dateInserted;

    private LocalDateTime dateWithdrawal;

    @NotBlank
    @Column(length = 10)
    private String bloodType;

    @NotBlank
    private Integer quantityBag;

    @OneToMany
    private Hemocenter hemocenter;
}

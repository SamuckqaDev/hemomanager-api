package br.com.hemomanager.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    @Column(length = 100)
    private String name;

    @NotBlank
    @Column(length = 15)
    private String cpf;

    @NotBlank
    @Column(length = 9)
    private String gender;

    @NotBlank
    @Column(length = 9)
    private Date birth;

    @NotBlank
    @Column(length = 100)
    private String email;

    @NotBlank
    @Column(length = 20)
    private String password;

    @NotBlank
    @Column(length = 10)
    private String bloodType;

    @NotBlank
    @Column(length = 15)
    private String phone;

    @NotBlank
    @Column(length = 20)
    private String role;

}

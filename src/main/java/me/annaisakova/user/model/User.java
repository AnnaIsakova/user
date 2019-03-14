package me.annaisakova.user.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column
    private String login;

    @NotNull
    @Column
    private String password;
}

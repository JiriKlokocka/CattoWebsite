package com.eliska.cattowebsite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    //@Column(name = "nickname")
    private String Nickname;

    @Getter
    @Setter
    private String LName;

    @Getter
    @Setter
    private String FName;

    @Getter
    @Setter
    @Column(name = "lastlogon")
    private Instant LastLogon;

    @Getter
    @Setter
    private String Email;

    @Getter
    @Setter
    @Column(name = "passwrd")
    private String Password;

    @Getter
    @Setter
    private String Phonenum;

    @Getter
    @Setter
    private String BAN;

    @Getter
    @Setter
    private Long IdAddress;

    @Getter
    @Setter
    private Long IdUsertype;

}

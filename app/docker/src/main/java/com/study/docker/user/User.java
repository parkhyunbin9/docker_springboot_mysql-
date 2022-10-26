package com.study.docker.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;


    private String username;

    private String email;

    private String password;

    private String picture;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public User(String username, String email, String password, String picture, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User(String username, String email, String picture, Role role) {
        this.username = username;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public User update(String username, String picture){
        this.username = username;
        this.picture = picture;
        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

    public String getRoleName() {
        return this.role.getTitle();
    }
}

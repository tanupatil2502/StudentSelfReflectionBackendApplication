package com.tanu.StudentSelfReflection.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationUserId;

    private String username;
    private String email;
    private String pwd;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;


    @OneToOne
    @JoinColumn(name = "personal_info_id")
    private PersonalInfo personalInfo;
}
package com.profile.aboutme.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "username", unique = true)
    private String username;

    private String password;

    @Column(name = "joined_at",updatable = false)
    private String joined_at;

    private String last_edited;

    private int active;

    private int gender;

    private String profile_image;

    private String qrcode_url;

    private String user_description;


    @ManyToMany
    @JoinTable(name = "social_user",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "social_id")
    )
    private List<Social> socials;

    @ManyToOne()
    @JoinColumn(name = "role", referencedColumnName = "role_id")
    private Role role;

    public User() {
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJoined_at() {
        return joined_at;
    }

    public void setJoined_at(String joined_at) {
        this.joined_at = joined_at;
    }

    public String getLast_edited() {
        return last_edited;
    }

    public void setLast_edited(String last_edited) {
        this.last_edited = last_edited;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getQrcode_url() {
        return qrcode_url;
    }

    public void setQrcode_url(String qrcode_url) {
        this.qrcode_url = qrcode_url;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public List<Social> getSocials() {
        return socials;
    }

    public void setSocials(List<Social> socials) {
        this.socials = socials;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

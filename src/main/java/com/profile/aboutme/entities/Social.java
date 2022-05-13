package com.profile.aboutme.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Social")
public class Social {

    @Id
    @Column(name = "social_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long social_id;

    @Column(length = 1000)
    private String url;

    private String display_name;

    private int is_show;

    @ManyToOne()
    @JoinColumn(name = "social_type", referencedColumnName = "social_code")
    private SocialType social_type;

    @ManyToOne()
    @JoinColumn(name = "user", referencedColumnName = "user_id")
    @JsonIgnore
    private User user;

    public Social() {
    }

    public Long getSocial_id() {
        return social_id;
    }

    public void setSocial_id(Long social_id) {
        this.social_id = social_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getIs_show() {
        return is_show;
    }

    public void setIs_show(int is_show) {
        this.is_show = is_show;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SocialType getSocial_type() {
        return social_type;
    }

    public void setSocial_type(SocialType social_type) {
        this.social_type = social_type;
    }
}

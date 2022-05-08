package com.profile.aboutme.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Social")
public class Social {

    @Id
    @Column(name = "social_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long social_id;

    private String url;

    private String display_name;

    private int is_show;

    @ManyToMany(mappedBy = "socials")
    private List<User> users;

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

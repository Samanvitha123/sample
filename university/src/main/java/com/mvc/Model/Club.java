/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.Model;

/**
 *
 * @author DELL
 */
public class Club {
    private String id;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String clubname;
    private String clubdescr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubdescr() {
        return clubdescr;
    }

    public void setClubdescr(String clubdescr) {
        this.clubdescr = clubdescr;
    }
    
    
}

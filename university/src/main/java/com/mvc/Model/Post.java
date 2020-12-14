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
public class Post {
    private String post_title;
    private String post_descr;
    private String pos_vote;
    private String neg_vote;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_descr() {
        return post_descr;
    }

    public void setPost_descr(String post_descr) {
        this.post_descr = post_descr;
    }

    public String getPos_vote() {
        return pos_vote;
    }

    public void setPos_vote(String pos_vote) {
        this.pos_vote = pos_vote;
    }

    public String getNeg_vote() {
        return neg_vote;
    }

    public void setNeg_vote(String neg_vote) {
        this.neg_vote = neg_vote;
    }
    
    
}

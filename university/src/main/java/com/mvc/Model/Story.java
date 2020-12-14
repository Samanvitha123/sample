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
public class Story {
    private String id;
    private String story_name;
    private String story_descr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStory_name() {
        return story_name;
    }

    public void setStory_name(String story_name) {
        this.story_name = story_name;
    }

    public String getStory_descr() {
        return story_descr;
    }

    public void setStory_descr(String story_descr) {
        this.story_descr = story_descr;
    }
    
    
    
}

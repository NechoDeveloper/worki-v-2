/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.video.VideoCategoriesFacade;
import java.util.*;
import entities.VideoCategories;
/**
 *
 * @author ahmed
 */
@ManagedBean
@SessionScoped
public class videocontroller {
    @EJB
    private VideoCategoriesFacade videoCategoriesFacade;

    
    public videocontroller() {
    }
    public List<VideoCategories> findall(){
        return this.videoCategoriesFacade.findAll();
    }
    
}

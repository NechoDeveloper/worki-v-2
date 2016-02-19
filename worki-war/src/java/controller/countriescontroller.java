/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.CountriesFacade;
import entities.*;
import java.util.*;
/**
 *
 * @author ahmed
 */
@ManagedBean
@SessionScoped
public class countriescontroller {
    @EJB
    private CountriesFacade countriesFacade;

   
    public countriescontroller() {
    }
    public List<Countries> findall(){
        return this.countriesFacade.findAll();
    }
}

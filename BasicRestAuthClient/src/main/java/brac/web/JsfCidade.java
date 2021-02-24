/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brac.web;

import brac.data.model.Cidade;
import java.util.ArrayList;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alera
 */
@Named(value = "jsfCidade")
@RequestScoped
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    public JsfCidade() {
    }
 
    public ArrayList<Cidade> getCidades(){
     return    new brac.resources.RestCidadeClient("user1","pass2").getAll();
    }
    
}

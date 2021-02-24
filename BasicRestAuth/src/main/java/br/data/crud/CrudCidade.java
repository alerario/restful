/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import bra.data.model.Cidade;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author alera
 */
public class CrudCidade {
    
    public Collection<Cidade> getAll(){
        ArrayList<Cidade> lcid = new ArrayList();
        lcid.add(new Cidade(1, "Assis"));
        lcid.add(new Cidade(2, "Cornelio Procopio"));
        lcid.add(new Cidade(3, "Londrina"));
        
        return lcid;
    }
}

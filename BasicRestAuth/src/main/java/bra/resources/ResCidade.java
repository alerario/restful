/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bra.resources;

import bra.data.model.Cidade;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author alera
 */
@Path("cidade")
@RequestScoped
public class ResCidade {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ResCidade
     */
    public ResCidade() {
    }

    /**
     * Retrieves representation of an instance of bra.resources.ResCidade
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Cidade> getAll() {
        //TODO return proper representation object
        return new br.data.crud.CrudCidade().getAll();
    }

    /**
     * PUT method for updating or creating an instance of ResCidade
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}

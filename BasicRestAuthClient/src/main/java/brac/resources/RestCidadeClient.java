/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brac.resources;

//import br.data.model.Cidade;
import brac.data.model.Cidade;
import java.util.ArrayList;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;

/**
 * Jersey REST client generated for REST resource:CidadeResource [cidade]<br>
 * USAGE:
 * <pre>
 *        ClienteRest client = new ClienteRest();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author alexandrelerario
 */
public class RestCidadeClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/BasicRestAuth/resources/";
    private String user;
    private String password;

    public RestCidadeClient(String user, String password) {
        this.user = user;
        this.password = password;
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("cidade");
    
    }

    
    public ArrayList<Cidade> getAll(){
        String upt= user+":"+password;
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, upt).get(ArrayList.class);
    }
    public void close() {
        client.close();
    }
    
}

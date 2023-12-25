package br.com.infnet.service;


import br.com.infnet.model.Venda;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface VendaService {
    @GET
    @Path("/{id}")
    Venda obterPorId(Long id);
}

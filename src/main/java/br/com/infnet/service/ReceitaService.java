package br.com.infnet.service;

import br.com.infnet.model.Receita;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Collection;

@RegisterRestClient
public interface ReceitaService {

    @GET
    Collection<Receita> obterLista();

    @GET
    @Path("/{id}")
    Receita obterPorId(@PathParam("id")Long id);

    @POST
    Receita incluir(Receita vacina);

    @PUT
    @Path("/{id}")
    Receita atualizar(@PathParam("id")Long id, Receita vacina);

    @DELETE
    @Path("/{id}")
    void excluir(@PathParam("id")Long id);
}

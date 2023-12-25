package br.com.infnet.controller;

import br.com.infnet.exception.VendaNotFoundException;
import br.com.infnet.model.Receita;
import br.com.infnet.service.ReceitaService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;
import java.util.Map;

@Path("/receita")
public class ReceitaController {

    @Inject
    private ReceitaService receitaService;

    @GET
    @Path("/lista")
    public Response lista() {
        List<Receita> receitas = (List<Receita>) receitaService.obterLista();

        return Response.ok(receitas).build();
    }

    @GET
    @Path("/{id}")
    public Response buscaPorId(@PathParam(value = "id") Long id) {
        try {
            Receita receita = receitaService.obterPorId(id);

            return Response.ok(receita).build();

        }catch (VendaNotFoundException ex){

            return Response.status(RestResponse.Status.NOT_FOUND).entity(Map.of("Message", "Não Encontrado")).build();
        }
    }

    @POST
    @Transactional
    public Response incluir(Receita receita) {

        receitaService.incluir(receita);

        return Response.accepted(receita).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response atualizar(@PathParam("id") Long id, Receita receita) {

        receita = receitaService.atualizar(id, receita);

        return Response.ok(receita).build();
    }

    @DELETE
    @Path(value = "/{id}")
    @Transactional
    public Response excluir(@PathParam("id") Long id) {

        receitaService.excluir(id);

        return Response.noContent().build();
    }
}

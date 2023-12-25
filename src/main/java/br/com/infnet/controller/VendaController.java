package br.com.infnet.controller;

import br.com.infnet.exception.VendaNotFoundException;
import br.com.infnet.model.Venda;
import br.com.infnet.service.VendaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.Map;

@Path("/venda")
public class VendaController {

    @Inject
    private VendaService vendaService;

    @GET
    @Path(value = "/{id}")
    public Response buscaPorId(@PathParam(value = "id") Long id) {
        try {
            Venda venda = vendaService.obterPorId(id);

            return Response.ok(venda).build();

        }catch (VendaNotFoundException ex){

            return Response.status(RestResponse.Status.NOT_FOUND).entity(Map.of("Message", "Não Encontrado")).build();
        }
    }
}

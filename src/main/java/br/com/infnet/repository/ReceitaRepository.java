package br.com.infnet.repository;

import br.com.infnet.model.Receita;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReceitaRepository implements PanacheRepository<Receita> {
}

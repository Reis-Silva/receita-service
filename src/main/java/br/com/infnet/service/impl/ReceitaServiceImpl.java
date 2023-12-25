package br.com.infnet.service.impl;


import br.com.infnet.model.Receita;
import br.com.infnet.repository.ReceitaRepository;
import br.com.infnet.service.ReceitaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;

import java.util.Collection;

@ApplicationScoped
public class ReceitaServiceImpl implements ReceitaService {

    @Inject
    private ReceitaRepository receitaRepository;

    @Override
    @Retry(maxRetries = 3)
    @Timeout(100)
    public Collection<Receita> obterLista(){
        return receitaRepository.listAll();
    }
    @Override
    public Receita obterPorId(Long id){
        return receitaRepository.findById(id);
    }

    @Override
    public Receita incluir(Receita vacina) {
        receitaRepository.persist(vacina);
        return vacina;
    }

    @Override
    @Retry(maxRetries = 3)
    @Timeout(100)
    public Receita atualizar(Long id, Receita receita) {
        Receita receitaUpdate = receitaRepository.findById(id);

        receitaUpdate.setAssinatura(receita.getAssinatura());
        receitaUpdate.setInformacoes(receita.getInformacoes());
        receitaUpdate.setCid(receita.getCid());
        receitaUpdate.setTipo(receita.getTipo());

        receitaRepository.persistAndFlush(receitaUpdate);

        return receitaUpdate;
    }

    @Override
    public void excluir(Long id) {
        receitaRepository.deleteById(id);
    }
}

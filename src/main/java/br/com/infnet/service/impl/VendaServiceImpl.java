package br.com.infnet.service.impl;


import br.com.infnet.model.Venda;
import br.com.infnet.repository.VendaRepository;
import br.com.infnet.service.VendaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class VendaServiceImpl implements VendaService {

    @Inject
    private VendaRepository vendaRepository;
    @Override
    public Venda obterPorId(Long id) {
        return vendaRepository.findById(id);
    }
}

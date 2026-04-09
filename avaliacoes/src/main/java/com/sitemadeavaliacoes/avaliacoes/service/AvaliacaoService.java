package com.sitemadeavaliacoes.avaliacoes.service;

import com.sitemadeavaliacoes.avaliacoes.model.Avaliacoesmodel;
import com.sitemadeavaliacoes.avaliacoes.repositoy.AvaiacoesReposiory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AvaliacaoService {
    private final AvaiacoesReposiory avaiacoesReposiory;
    public AvaliacaoService(AvaiacoesReposiory avaiacoesReposiory) {
        this.avaiacoesReposiory = avaiacoesReposiory;
    }

    //CADASTRAR AVALIAÇÃO
    public Avaliacoesmodel CadastrarAvaliação(Avaliacoesmodel avaliacoesmodel) {
        return avaiacoesReposiory.save(avaliacoesmodel);
    }
    //BUSCAR POR ID
    public List<Avaliacoesmodel> buscarPorId(Long id){
        return avaiacoesReposiory.findAll().stream()
                .filter(a -> a.getId() == id)
                .toList();
    }
    //SALVAR AVALIAÇÃO
    public Avaliacoesmodel salvarAvaliacao(Avaliacoesmodel avaliacoesmodel) {
        return avaiacoesReposiory.save(avaliacoesmodel);
    }

    //DELETAR
    public void DeletarAvaliacoesmodel(Long id){
        avaiacoesReposiory.deleteById(id);
    }
    //LISTAR
    public AvaiacoesReposiory Listaravaliacoes(){
        return avaiacoesReposiory;
    }
}

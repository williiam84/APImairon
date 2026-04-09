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

    public Avaliacoesmodel salvarAvaliacao(Avaliacoesmodel avaliacoesmodel) {
        return avaiacoesReposiory.save(avaliacoesmodel);
    }

    public List<Avaliacoesmodel> Listaravaliacoes(){
        return avaiacoesReposiory.findAll();
    }

    public Avaliacoesmodel buscarPorId(Long id){
        return avaiacoesReposiory.findById(id).orElse(null);
    }

    public void deletar(Long id){
        avaiacoesReposiory.deleteById(id);
    }
}
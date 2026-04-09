package com.sitemadeavaliacoes.avaliacoes.controller;

import com.sitemadeavaliacoes.avaliacoes.model.Avaliacoesmodel;
import com.sitemadeavaliacoes.avaliacoes.repositoy.AvaiacoesReposiory;
import com.sitemadeavaliacoes.avaliacoes.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class AvaliacoesController {
    private final AvaliacaoService avaliacaoService;
    public  AvaliacoesController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }
    @GetMapping("/avaliacoes")
public List<Avaliacoesmodel> getAvaliacoes(){
    return avaliacaoService.Listaravaliacoes();
}
    @PostMapping("/avaliacoes")
    public Avaliacoesmodel Save(@RequestBody Avaliacoesmodel avaliacoesmodel){
        return avaliacaoService.CadastrarAvaliação(avaliacoesmodel);
    }
    @DeleteMapping("/avaliacoes/{id}")
    public void deletarAvaliacoes(@PathVariable Long id){
         avaliacaoService.DeletarAvaliacoesmodel(id);
    }
}

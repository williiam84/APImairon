package com.sitemadeavaliacoes.avaliacoes.controller;

import com.sitemadeavaliacoes.avaliacoes.model.Avaliacoesmodel;
import com.sitemadeavaliacoes.avaliacoes.service.AvaliacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/avaliacoes")
public class AvaliacoesController {

    private final AvaliacaoService avaliacaoService;

    public AvaliacoesController(AvaliacaoService avaliacaoService) {
        this.avaliacaoService = avaliacaoService;
    }

    // 🔍 LISTAR TODAS
    @GetMapping
    public List<Avaliacoesmodel> listar() {
        return avaliacaoService.Listaravaliacoes();
    }

    // 🔍 BUSCAR POR ID
    @GetMapping("/{id}")
    public Avaliacoesmodel buscarPorId(@PathVariable Long id) {
        return avaliacaoService.buscarPorId(id);
    }

    // 💾 SALVAR
    @PostMapping
    public Avaliacoesmodel salvar(@RequestBody Avaliacoesmodel avaliacoesmodel) {
        return avaliacaoService.salvarAvaliacao(avaliacoesmodel);
    }

    // ❌ DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        avaliacaoService.deletar(id);
    }
}
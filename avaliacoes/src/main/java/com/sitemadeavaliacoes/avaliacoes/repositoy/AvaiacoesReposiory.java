package com.sitemadeavaliacoes.avaliacoes.repositoy;

import com.sitemadeavaliacoes.avaliacoes.model.Avaliacoesmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaiacoesReposiory extends JpaRepository<Avaliacoesmodel, Long> {
}

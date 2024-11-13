package br.com.mateus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

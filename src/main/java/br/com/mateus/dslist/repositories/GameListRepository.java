package br.com.mateus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mateus.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

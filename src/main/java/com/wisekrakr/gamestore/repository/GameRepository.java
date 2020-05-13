package com.wisekrakr.gamestore.repository;


import com.wisekrakr.gamestore.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {


}

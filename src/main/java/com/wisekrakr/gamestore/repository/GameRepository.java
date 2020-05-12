package com.wisekrakr.gamestore.repository;


import com.wisekrakr.gamestore.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface GameRepository extends JpaRepository<Game, Long> {


}

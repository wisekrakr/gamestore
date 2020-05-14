package com.wisekrakr.gamestore.repository;


import com.wisekrakr.gamestore.entity.Game;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @RestResource(path = "category-id")
    Page<Game> findByCategoryId(@Param("id") Long id, Pageable pageable);

    @RestResource(path = "searchbykeyword")
    Page<Game> findByNameContaining(@Param("name") String keyword, Pageable pageable);

}


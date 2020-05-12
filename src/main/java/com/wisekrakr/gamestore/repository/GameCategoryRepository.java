package com.wisekrakr.gamestore.repository;

import com.wisekrakr.gamestore.entity.GameCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "gameCategory", path = "game-category")
public interface GameCategoryRepository extends JpaRepository<GameCategory, Long> {
}

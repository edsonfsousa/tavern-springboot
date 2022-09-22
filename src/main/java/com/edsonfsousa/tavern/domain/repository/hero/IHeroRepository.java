package com.edsonfsousa.tavern.domain.repository.hero;

import com.edsonfsousa.tavern.domain.entity.hero.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IHeroRepository extends JpaRepository<HeroEntity, UUID> {

}

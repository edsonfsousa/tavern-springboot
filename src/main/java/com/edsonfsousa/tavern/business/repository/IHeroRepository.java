package com.edsonfsousa.tavern.business.repository;

import com.edsonfsousa.tavern.business.entity.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IHeroRepository extends JpaRepository<HeroEntity, UUID>{

}

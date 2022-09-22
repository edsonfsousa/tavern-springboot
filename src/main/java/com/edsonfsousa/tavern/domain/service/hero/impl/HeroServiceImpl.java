package com.edsonfsousa.tavern.domain.service.hero.impl;

import com.edsonfsousa.tavern.domain.mapper.hero.IHeroMapper;
import com.edsonfsousa.tavern.domain.repository.hero.IHeroRepository;
import com.edsonfsousa.tavern.domain.service.hero.IHeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeroServiceImpl implements IHeroService {

    @Autowired
    private IHeroRepository heroRepository;

    private IHeroMapper heroMapper;

}

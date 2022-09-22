package com.edsonfsousa.tavern.domain.service;

import com.edsonfsousa.tavern.domain.mapper.hero.IHeroMapper;
import com.edsonfsousa.tavern.domain.repository.hero.IHeroRepository;
import com.edsonfsousa.tavern.domain.service.hero.impl.HeroServiceImpl;
import com.edsonfsousa.tavern.domain.vo.HeroVOBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HeroServiceTest {

    private IHeroMapper heroMapper;

    @Mock
    private IHeroRepository heroRepository;

    @InjectMocks
    private HeroServiceImpl heroService;

    private HeroVOBuilder heroVOBuilder;

    @BeforeEach
    void setUp(){
        heroVOBuilder = HeroVOBuilder.builder().build();
    }
}

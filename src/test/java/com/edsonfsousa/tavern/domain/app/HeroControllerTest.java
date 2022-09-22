package com.edsonfsousa.tavern.domain.app;

import com.edsonfsousa.tavern.app.v1.controller.HeroController;
import com.edsonfsousa.tavern.domain.service.hero.impl.HeroServiceImpl;
import com.edsonfsousa.tavern.domain.vo.HeroVOBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@ExtendWith(MockitoExtension.class)
public class HeroControllerTest {

    @Mock
    private HeroServiceImpl HeroService;

    @InjectMocks
    private HeroController heroController;

    private MockMvc mockMvc;

    private HeroVOBuilder heroVOBuilder;

    @BeforeEach
    void setUp(){
        heroVOBuilder = HeroVOBuilder.builder().build();
        mockMvc = MockMvcBuilders.standaloneSetup(heroController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }
}

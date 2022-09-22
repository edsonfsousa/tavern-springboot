package com.edsonfsousa.tavern.app.v1.controller;

import com.edsonfsousa.tavern.app.v1.open_api.IHeroControllerOpenApi;
import com.edsonfsousa.tavern.domain.service.hero.IHeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class HeroController implements IHeroControllerOpenApi {

    @Autowired
    private IHeroService heroService;
}

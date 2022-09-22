package com.edsonfsousa.tavern.domain.mapper.hero.impl.model_mapper.impl;

import com.edsonfsousa.tavern.domain.entity.hero.HeroEntity;
import com.edsonfsousa.tavern.domain.mapper.hero.IHeroMapper;
import com.edsonfsousa.tavern.domain.vo.hero.HeroRequestVO;
import com.edsonfsousa.tavern.domain.vo.hero.HeroResponseVO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("carMapperModelMapper")
public class HeroMapperImpl implements IHeroMapper {

    private final ModelMapper mapper = new ModelMapper();

    public HeroMapperImpl() {
    }

    @Override
    public HeroEntity toHeroEntity(HeroRequestVO input) {
        return mapper.map(input, HeroEntity.class);
    }

    @Override
    public HeroRequestVO toHeroRequestVO(HeroEntity input) {
        return mapper.map(input, HeroRequestVO.class);
    }

    @Override
    public HeroResponseVO toHeroResponseVO(HeroEntity input) {
        return mapper.map(input, HeroResponseVO.class);
    }
}
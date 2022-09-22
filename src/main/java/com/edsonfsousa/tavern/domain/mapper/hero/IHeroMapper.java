package com.edsonfsousa.tavern.domain.mapper.hero;

import com.edsonfsousa.tavern.domain.entity.hero.HeroEntity;
import com.edsonfsousa.tavern.domain.vo.hero.HeroRequestVO;
import com.edsonfsousa.tavern.domain.vo.hero.HeroResponseVO;

public interface IHeroMapper {

    HeroEntity toHeroEntity(HeroRequestVO input);

    HeroRequestVO toHeroRequestVO(HeroEntity input);

    HeroResponseVO toHeroResponseVO(HeroEntity input);
}

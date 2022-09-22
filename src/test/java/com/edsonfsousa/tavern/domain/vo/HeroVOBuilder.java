package com.edsonfsousa.tavern.domain.vo;


import com.edsonfsousa.tavern.domain.vo.hero.HeroResponseVO;
import lombok.Builder;

import java.util.UUID;


@Builder
public class HeroVOBuilder {

    @Builder.Default
    private final UUID id = UUID.randomUUID();

    @Builder.Default
    private final String name = "Edson Fernandes de Sousa";

    @Builder.Default
    private final int age = 14;

    @Builder.Default
    private final String skill = "Veloz";

    public HeroResponseVO buildHeroResponseVO() {
        return new HeroResponseVO(id, name, age, skill);
    }
}

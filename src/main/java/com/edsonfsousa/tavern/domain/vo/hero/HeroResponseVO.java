package com.edsonfsousa.tavern.domain.vo.hero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeroResponseVO {

    private UUID id;

    private String name;

    private Integer age;

    private String skill;

    public HeroResponseVO(UUID id, String name, int age, String skill) {

    }
}

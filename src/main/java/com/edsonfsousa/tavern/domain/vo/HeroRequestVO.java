package com.edsonfsousa.tavern.domain.vo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
public class HeroRequestVO {

    @NotBlank
    @Size(min = 3, max = 60)
    @Column(nullable = false, length = 20, unique = true)
    private String name;

    @NotBlank
    @Size(min = 14)
    @Column(nullable = false, length = 20, unique = true)
    private Integer age;

    @NotBlank
    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20, unique = true)
    private String skill;
}

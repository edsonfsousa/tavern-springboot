package com.edsonfsousa.tavern.domain.vo.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HeroRequestVO {

    @NotBlank
    @NotNull
    @Size(min = 3, max = 60)
    private String name;

    @NotBlank
    @NotNull
    @Min(14)
    private Integer age;

    @NotBlank
    @NotNull
    @Size(min = 3, max = 20)
    private String skill;
}

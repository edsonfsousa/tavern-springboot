package com.edsonfsousa.tavern.domain.entity.hero;

import com.edsonfsousa.tavern.domain.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "heroes")
public class HeroEntity extends BaseEntity {

    @NotBlank
    @Size(min = 3, max = 60)
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank
    @Size(min = 14)
    @Column(name = "age", nullable = false)
    private Integer age;

    @NotBlank
    @Size(min = 3, max = 20)
    @Column(name = "skill", nullable = false)
    private String skill;
}

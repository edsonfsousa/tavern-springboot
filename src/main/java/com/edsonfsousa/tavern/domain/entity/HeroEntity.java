package com.edsonfsousa.tavern.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "heroes")
public class HeroEntity extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "skill", nullable = false)
    private String skill;
}

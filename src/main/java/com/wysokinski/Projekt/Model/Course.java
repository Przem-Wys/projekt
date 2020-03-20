package com.wysokinski.Projekt.Model;

import com.wysokinski.Projekt.Model.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@EqualsAndHashCode
@Table(name = "course")
public class Course extends BaseEntity {


    @Column(name = "name")
    private String name;

}

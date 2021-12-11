package ru.dstu.fuzzytest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id_b;
    @Column
    String type;
    @Column
    Double size;
    @Column
    Integer age;
    @Column
    Integer flooded;
    @Column
    Long municipality_id;

}

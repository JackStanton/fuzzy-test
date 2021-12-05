package ru.dstu.fuzzytest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Municipality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;
    @Column
    String name;
    @Column
    Double alitude;
    @Column
    Double area_size;
    @Column
    Integer inhabit;
    @Column
    Integer pollution;
    @Column
    Integer opinion_q;
    @Column
    Integer n_days_snow;
    @Column
    Long id_dist;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "municipality",cascade = CascadeType.ALL)
//    List<Building> buildings;
}

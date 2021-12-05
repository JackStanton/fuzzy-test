package ru.dstu.fuzzytest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;
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

//    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
//    @JoinColumn(name = "municipality_id")
//    Municipality municipality;


}
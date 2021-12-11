package ru.dstu.fuzzytest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LFuzzy {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private double M;
  private double B;
}

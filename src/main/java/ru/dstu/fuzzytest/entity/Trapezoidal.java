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
public class Trapezoidal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long fuzzyId;
  private double A;
  private double m1;
  private double m2;
  private double B;
}

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
public class LingTerm5 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long fuzzyId;
  private double veryNegative;
  private double negative;
  private double neutral;
  private double positive;
  private double veryPositive;
}

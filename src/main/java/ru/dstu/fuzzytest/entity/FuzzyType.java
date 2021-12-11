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
public class FuzzyType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idType;
  private String name;
}

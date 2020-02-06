package com.example.javaNorthwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.javaNorthwind.Privileges")
@Table(name = "privileges")
public class Privileges {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"privilege_name\"", nullable = true)
  private String privilegeName;
}
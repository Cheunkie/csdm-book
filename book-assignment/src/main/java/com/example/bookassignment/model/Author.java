package com.example.bookassignment.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Author {


  private @Id
  @Column( name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;

  @Column(name = "First_Name")
  @NonNull
  private String FirstName;

  @Column(name = "Last_Name")
  @NonNull
  private String LastName;

  @Column(name = "DoB")
  @NonNull
  private LocalDate DoB;


}


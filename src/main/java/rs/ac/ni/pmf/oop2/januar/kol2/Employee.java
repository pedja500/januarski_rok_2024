package rs.ac.ni.pmf.oop2.januar.kol2;

import lombok.Value;

import java.util.List;
@Value
public class Employee {
       String id;
       String firstName;
       String lastName;
       int salary;
      List<Project> projects;
    }

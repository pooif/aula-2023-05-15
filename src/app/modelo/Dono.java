package app.modelo;

import java.util.ArrayList;
import java.util.List;

public class Dono {

  private List<Pet> pets = new ArrayList<>();
  private String nome;

  public Dono(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void addPet(Pet p) { // polimorfismo/covariância
    this.pets.add(p);
  }

  public List<Pet> getPets() {
    return pets;
  }
  
  
}

package app.modelo;

// Cachorro **É UM** Pet
// subtipo de Pet, subclasse de Pet,
// especialização de Pet, logo,
// deve cumprir o Contrato de Pet
public class Cachorro extends Pet {

  public Cachorro(String nome) {
    // super("Bob"); // new Pet("Bob")
    super(nome);
  }

  public void latir() {
    System.out.println("au au!");
  }

}

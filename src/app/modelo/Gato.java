package app.modelo;

public class Gato extends Pet {

  public Gato(String nome) {
    super(nome);
  }
  
  public void miar() {
    System.out.println("miau!");
  }

}

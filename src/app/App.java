package app;

import java.util.Date;
import java.util.List;

import app.modelo.Cachorro;
import app.modelo.Dono;
import app.modelo.Fabricante;
import app.modelo.Gato;
import app.modelo.Pet;
import app.modelo.Produto;

class App {
  public static void main(String[] args) {
    // também implica um new Pet (implícito)
    // covariância (Cachorro é covariante de Pet)
    Pet mimi = new Cachorro("Bidu"); 
    //System.out.println(c.getNome()); // Bidu
    mimi = new Gato("Mimi");
    //System.out.println(c.getNome()); // Mimi
    // c = new Pet("Teste");
    System.out.println(mimi.getNome());
    // c = "asdas";
    // c = 23123;
    // c = new App[2];
    // c = new Date();
    Pet alfredo = new Cachorro("Alfredo");

    Dono gabriel = new Dono("Gabriel");
    gabriel.addPet(mimi); // 0
    gabriel.addPet(alfredo); // 1

    System.out.println(gabriel.getPets());

    Pet p = gabriel.getPets().get(0);

    Gato gato = (Gato) gabriel.getPets().get(0);
    //gato.miar();

    if (gabriel.getPets().get(1) instanceof Cachorro) {
      // if vai entrar
      ((Cachorro) gabriel.getPets().get(1)).latir();
    }

    if (gabriel.getPets().get(1) instanceof Gato) {
      // if não vai entrar
      ((Gato) gabriel.getPets().get(1)).miar();
    }
  }
}
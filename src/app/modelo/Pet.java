package app.modelo;

// é a superclasse, generalização,
// é um supertipo, é abstrato

// classes abstratas não podem ser instanciadas,
// a ideia geral é que elas são incompletas.
public abstract class Pet { // é abstrata, proíbe o new

  // protected -> visível às subclasses
  protected String nome;

  public Pet(String nome) {
    if (nome == null || nome.isBlank()) {
      throw new IllegalArgumentException("Nome é obrigatório");
    }
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }
  
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " " + nome;
  }
}

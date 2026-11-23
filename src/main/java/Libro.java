import java.util.Objects;

/**
 * Representa un libro de la biblioteca universitaria que puede prestarse y devolverse.
 */
public class Libro {

  private final String titulo;
  private final String autor;
  private boolean disponible = true;

  /**
   * Crea un libro disponible para préstamo.
   *
   * @param titulo título del libro
   * @param autor autor del libro
   */
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public boolean estaDisponible() {
    return disponible;
  }

  /**
   * Presta el libro y lo marca como no disponible.
   *
   * @throws IllegalStateException si el libro ya está prestado
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException("Libro no disponible");
    }

    disponible = false;
  }

  /**
   * Devuelve el libro y lo marca nuevamente como disponible.
   */
  public void devolver() {
    disponible = true;
  }

  /**
   * Compara el título del libro con otro título por contenido.
   *
   * @param otroTitulo título a comparar
   * @return {@code true} si ambos títulos tienen el mismo contenido
   */
  public boolean esMismoTitulo(String otroTitulo) {
    return Objects.equals(titulo, otroTitulo);
  }
}

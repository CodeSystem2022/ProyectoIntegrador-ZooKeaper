public class Decesos {
    //Atributos de la clase (Caracteristicas)
    public String especie;
    public int cantidad;
    /**
   * @param ali
   * @param can
   */
  public Decesos(String esp, int can)
    {
        especie=esp;
        cantidad=can;
    }
    @Override
    public String toString() {
        return "La cantidad de " + especie + " es de " + cantidad;
    }
}

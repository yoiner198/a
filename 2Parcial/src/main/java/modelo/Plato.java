
package modelo;

public class Plato {
    private int codigo; 
    private String nPlato;
    private String proteina;
    private int cant;
    private int precio;

    public Plato() {
    }

    public Plato(int codigo, String nPlato, String proteina, int cant, int precio) {
        this.codigo = codigo;
        this.nPlato = nPlato;   
        this.proteina = proteina;
        this.cant = cant;
        this.precio = precio;
    }

    public Plato(int codigo, String nPlato, int cant) {
        this.codigo = codigo;
        this.nPlato = nPlato;
        this.cant = cant;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getnPlato() {
        return nPlato;
    }

    public void setnPlato(String nPlato) {
        this.nPlato = nPlato;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }


    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}

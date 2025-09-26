
package tp5_5;

/**
 *
 * @author vazqu
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario; // Asociacion bidireccional
    private PlacaMadre placaMadre; // Composicion
    
    public Computadora(String marca, String numeroSerie, Propietario propietario, 
                      String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
        
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }
    
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    
    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }
    
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public void setPlacaMadre(String modelo, String chipset) {
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    
    @Override
    public String toString() {
        return marca + " (S/N: " + numeroSerie + ")\n" +
               "Propietario: " + (propietario != null ? propietario.toString() : "Sin propietario") + "\n" +
               "Placa Madre: " + (placaMadre != null ? placaMadre.toString() : "Sin placa madre");
    }
}

package Asalariado;

public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String region, String nombre, long dni, int diasVacaciones) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }
    
    //Getter y Setter

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}

public class Edificio implements ImpactoEcologico {
    //Datos del Edificio
    private String direccion;
    private int cantCuartos;
    private int cantHabitantes;
    private int aniodeFuncionamiento;
    //Datos de Actividad
    private double factordeEmision;
    private double kWxdia;
    private double litrosxdia;

    public Edificio(String direccion, int cantCuartos, int cantHabitantes,
                    int aniodeFuncionamiento, double factordeEmision, double kWxdia, double litrosxdia) {
        this.direccion = direccion;
        this.cantCuartos = cantCuartos;
        this.cantHabitantes = cantHabitantes;
        this.aniodeFuncionamiento = aniodeFuncionamiento;
        this.factordeEmision = factordeEmision;
        this.kWxdia = kWxdia;
        this.litrosxdia = litrosxdia;
    }

    //Getter y Setter
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantCuartos() {
        return cantCuartos;
    }

    public void setCantCuartos(int cantCuartos) {
        this.cantCuartos = cantCuartos;
    }

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public int getAniodeFuncionamiento() {
        return aniodeFuncionamiento;
    }

    public void setAniodeFuncionamiento(int aniodeFuncionamiento) {
        this.aniodeFuncionamiento = aniodeFuncionamiento;
    }

    public double getFactordeEmision() {
        return factordeEmision;
    }

    public void setFactordeEmision(double factordeEmision) {
        this.factordeEmision = factordeEmision;
    }

    public double getkWxdia() {
        return kWxdia;
    }

    public void setkWxdia(double kWxdia) {
        this.kWxdia = kWxdia;
    }

    public double getLitrosxdia() {
        return litrosxdia;
    }

    public void setLitrosxdia(double litrosxdia) {
        this.litrosxdia = litrosxdia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return (kWxdia * (aniodeFuncionamiento * 365) + litrosxdia * (aniodeFuncionamiento * 365)) * factordeEmision;
    }

    @Override
    public String toString() {
        return "Edificio:" +
                "\nDireccion del Edificio: " + direccion +
                "\nCantidad de Cuartos: " + cantCuartos +
                "\nCantidad de Habitantes:" + cantHabitantes +
                "\nAños de Funcionamiento:" + aniodeFuncionamiento +
                "\n================================================" +
                "\nDatos de Actividad: " +
                "\nFactor de Emision: " + factordeEmision +
                "\nKilovatios por Dia: " + kWxdia +
                "\nLitros por Dia: " + litrosxdia;
    }
}

public class Articulo {

    private String codigo_barra;
    private String denominacion;
    private int unidades;
    private double precio_compra;
    private int beneficio; // Valor entre 0-100
    private double pvp;

    public Articulo() {
    }

    public Articulo(String codigo_barra, String denominacion, int unidades, double precio_compra, int beneficio) {
        this.codigo_barra = codigo_barra;
        this.denominacion = denominacion;
        this.unidades = unidades;
        this.precio_compra = precio_compra;
        this.beneficio = beneficio;
        this.calcularPvP();
    }

    public void setCodigo_barra(String codigo_barra){
        this.codigo_barra = codigo_barra;
    }
    public String getCodigo_barra(){
        return this.codigo_barra;
    }

    public void setDenominacion(String denominacion){
        this.denominacion = denominacion;
    }
    public String getDenominacion(){
        return this.denominacion;
    }
    public void setUnidades(int unidades){
        this.unidades = unidades;
    }
    public int getUnidades(){
        return this.unidades;
    }
    public void setPrecio_compra(double precio_compra){
        this.precio_compra = precio_compra;
        this.calcularPvP();
    }
    public double getPrecio_compra(){
        return this.precio_compra;
    }
    public void setBeneficio(int beneficio){
        this.beneficio = beneficio;
        this.calcularPvP();
    }
    public int getBeneficio(){
        return this.beneficio;
    }
    public double getPvp(){
        return this.pvp;
    }

    public void calcularPvP(){
        pvp = precio_compra + ((precio_compra * beneficio)/100);
    }
}

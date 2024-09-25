package org.example.MODELOS;

public class Apartamentos {
    private Long id;
    private String localizacion;
    private Integer precio;
    private Integer numeroBaños;
    private Integer numeroHabitaciones;
    private Integer numeroCocinas;
    private Boolean tienePatio;

    public Apartamentos() {
    }

    public Apartamentos(Long id, String localizacion, Integer precio, Integer numeroBaños, Integer numeroHabitaciones, Integer numeroCocinas, Boolean tienePatio) {
        this.id = id;
        this.localizacion = localizacion;
        this.precio = precio;
        this.numeroBaños = numeroBaños;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroCocinas = numeroCocinas;
        this.tienePatio = tienePatio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(Integer numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getNumeroCocinas() {
        return numeroCocinas;
    }

    public void setNumeroCocinas(Integer numeroCocinas) {
        this.numeroCocinas = numeroCocinas;
    }

    public Boolean getTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(Boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    @Override
    public String toString() {
        return "Apartamentos{" +
                "id=" + id +
                ", localizacion='" + localizacion + '\'' +
                ", precio=" + precio +
                ", numeroBaños=" + numeroBaños +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", numeroCocinas=" + numeroCocinas +
                ", tienePatio=" + tienePatio +
                '}';
    }
}

package com.felipe.evaluacion1;

public class ListElements {
    public String color;
    public String name;
    public String ciudad;
    public String status;

    public ListElements(String color, String name, String ciudad, String status) {
        this.color = color;
        this.name = name;
        this.ciudad = ciudad;
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

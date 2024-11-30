/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Evaluacion.model;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fechaCaducidad;
    private int stockMinimo;
    private int stockMaximo;
    private double precioUnitario;
    private String categoria;
    private String marca;

    // Constructor vacío
    public Producto() {}

    // Constructor con todos los campos
    public Producto(String nombre, LocalDate fechaCaducidad, int stockMinimo, int stockMaximo,
                    double precioUnitario, String categoria, String marca) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.stockMinimo = stockMinimo;
        this.stockMaximo = stockMaximo;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.marca = marca;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
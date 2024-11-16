/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhoja
 */

public class Estudiante {
    private int id;
    private String codigo;
    private String nombre;
    private String email;
    private int coloniaId;
    private int carreraId;

    // Constructor, getters y setters
    public Estudiante(String codigo, String nombre, String email, int coloniaId, int carreraId) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.coloniaId = coloniaId;
        this.carreraId = carreraId;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getColoniaId() { return coloniaId; }
    public void setColoniaId(int coloniaId) { this.coloniaId = coloniaId; }
    public int getCarreraId() { return carreraId; }
    public void setCarreraId(int carreraId) { this.carreraId = carreraId; }
}


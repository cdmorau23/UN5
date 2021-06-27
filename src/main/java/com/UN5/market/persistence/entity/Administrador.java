package com.UN5.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Admin")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Integer idAdmin;
    @Column(name="nombre")
    private String nombre;
    @Column(name="correo")
    private String correo;
    @Column(name="contraseña")
    private String contraseña;

    @OneToMany(mappedBy = "administrador")
    private List<AdminRestaurante> administradores;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<AdminRestaurante> getAdminRestaurantes() {
        return administradores;
    }

    public void setAdminRestaurantes(List<AdminRestaurante> adminRestaurantes) {
        this.administradores = adminRestaurantes;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

}
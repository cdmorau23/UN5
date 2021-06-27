package com.UN5.market.persistence.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "RESTAURANTE")
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Restaurante")
    private Integer idRestaurante;

    private String nombre ;
    private String slogan;
    private String QRcode;
    private Integer totalMesas;

    @OneToMany(mappedBy = "restaurante")
    private List<Producto> productos;

    @OneToMany(mappedBy = "restaurante")
    private List<Compra> compras;

    @OneToMany(mappedBy = "restaurante")
    private List<AdminRestaurante> adminRestaurantes;



    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Integer getTotalMesas() {
        return totalMesas;
    }

    public void setTotalMesas(Integer totalMesas) {
        this.totalMesas = totalMesas;
    }

    public String getQRcode() {
        return QRcode;
    }

    public void setQRcode(String QRcode) {
        this.QRcode = QRcode;
    }



   public List<AdminRestaurante> getAdminRestaurantes() {
        return adminRestaurantes;
    }

    public void setAdminRestaurantes(List<AdminRestaurante> adminRestaurantes) {
        this.adminRestaurantes = adminRestaurantes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
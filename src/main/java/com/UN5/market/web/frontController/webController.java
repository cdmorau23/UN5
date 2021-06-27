package com.UN5.market.web.frontController;

import com.UN5.market.domain.Product;
import com.UN5.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class webController {

    @Autowired
    private ProductService ProductService;

    private int restauranteId=1;

    @GetMapping("/clienteMenu.html")
    public String clienteMenu(Model model) {
        List<Product> productos= ProductService.getAll();
        model.addAttribute("productos",productos);
        return "clienteMenu";
    }

    @GetMapping("/productos.html")
    public String productosAdmin(Model model){
        List<Product> productos= ProductService.getAll();
        model.addAttribute("productos",productos);
        return "productos";
    }

    @GetMapping ("/pedidos.html")
    public String pedidosEmpleado(){
        return "pedidos";
    }

    @GetMapping ("/restaurantesBuscador.html")
    public String restaurantesAdminBuscador() {
        return "restaurantesBuscador";
    }

    @GetMapping ("/restauranteAgregarBuscador.html")
    public String restauranteAgregarAdminBuscador(){
        return "restauranteAgregarBuscador";
    }

    @GetMapping ("/register.html")
    public String register(){
        return "register";
    }

    @GetMapping ("/productoDetalles.html")
    public String productoDetallesAdmin(){
        return "productoDetalles";
    }

    @GetMapping ("/productoAgregar.html")
    public String productoAgregarAdmin(){
        return "productoAgregar";
    }

    @GetMapping ("/principal.html")
    public String principal(){
        return "principal";
    }

    @GetMapping ("/pedidoDetalles.html")
    public String pedidoDetallesEmpleado(){
        return "pedidoDetalles";
    }

    @GetMapping ("/login.html")
    public String login(){
        return "login";
    }

    @GetMapping ("/localDatosBuscador.html")
    public String localDatosAdminBuscador(){
        return "localDatosBuscador";
    }

    @GetMapping ("/localDatos.html")
    public String localDatosAdmin(){
        return "localDatos";
    }

    @GetMapping ("/estadisticas.html")
    public String estadisticasAdmin(){
        return "estadisticas";
    }

    @GetMapping ("/cuenta.html")
    public String cuentaAdmin(){
        return "cuenta";
    }

    @GetMapping ("/cuentaBuscador.html")
    public String cuentaAdminBuscador(){
        return "cuentaBuscador";
    }

    @GetMapping ("/carrito.html")
    public String carrito(){
        return "carrito";
    }

}

package com.ejemplo.tiendaalamano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ejemplo.tiendaalamano.model.Productos;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;

@Controller
@RequestMapping(path = "/productos")
public class ProductoController {
	
    @Autowired
    private ProductoRepository productosRepository;

    @GetMapping(value = "/agregar")
    public String agregarProducto(Model model) {
        model.addAttribute("producto", new Productos());
        return "productos/agregar_producto";
    }

    @GetMapping(value = "/mostrar")
    public String mostrarProductos(Model model) {
        model.addAttribute("productos", productosRepository.findAll());
        return "productos/ver_productos";
    }

    @PostMapping(value = "/eliminar")
    public String eliminarProducto() {
        return "redirect:/productos/mostrar";
    }

    @PostMapping(value = "/editar")
    public String actualizarProducto(@ModelAttribute Productos producto, RedirectAttributes redirectAttrs) {
        productosRepository.save(producto);
        redirectAttrs
                .addFlashAttribute("mensaje", "Editado correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/productos/mostrar";
    }
    
}
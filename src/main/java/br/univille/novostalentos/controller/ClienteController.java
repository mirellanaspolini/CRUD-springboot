package br.univille.novostalentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.novostalentos.entity.Cliente;
import br.univille.novostalentos.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;
    
    @GetMapping
    public ModelAndView index() {

        var listaCliente = service.getAll();
        return new ModelAndView("cliente/index", "listaClientes", listaCliente);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {

        var cliente = new Cliente();
        return new ModelAndView("cliente/form", "cliente", cliente);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Cliente cliente) {
        
        service.save(cliente);
        return new ModelAndView("redirect:/clientes");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id) {

        var umCliente = service.findById(id);
        return new ModelAndView("cliente/form", "cliente", umCliente);
    }
}

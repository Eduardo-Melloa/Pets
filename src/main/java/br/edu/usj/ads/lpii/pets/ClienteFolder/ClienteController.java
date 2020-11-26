package br.edu.usj.ads.lpii.pets.ClienteFolder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping(value="/")
    public ModelAndView getListaClientes() {
        List<Cliente> listaClientes= clienteRepository.findAll();
        
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listaClientes", listaClientes);

        return modelAndView;
    }

    @GetMapping(value="/cadastroClientes")
    public ModelAndView getCadastroCliente() {
        Cliente novoCliente= new Cliente(); 
        
        ModelAndView modelAndView = new ModelAndView("cadastroClientes");
        modelAndView.addObject("novoCliente", novoCliente);

        return modelAndView;
    }
    
    @PostMapping(value="/adicionar")
    public String postCadastroCliente(Cliente cliente) {
        clienteRepository.save(cliente);
        
        return "redirect:/";
    }
    
    


}

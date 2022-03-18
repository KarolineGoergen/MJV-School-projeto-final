package com.mjv.school.projetofinal.controler;

import java.util.List;

import com.mjv.school.projetofinal.model.Livros;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class Controller {
    @PostMapping()
    public void gravar(Livros livro){
        System.out.println("Gravando");
    }
    @PutMapping()
    public void editar(Livros livro){
        System.out.println("Editando");   
    }
    @DeleteMapping()
    public void excluir(int id){
        System.out.println("Excluindo");   
    }
    @GetMapping()
    public List<Livros> listar(){
        System.out.println("Listando");
        return null;
    }
    
}

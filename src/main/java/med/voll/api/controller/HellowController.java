package med.voll.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //*Anotação do tipo api rest controller
@RequestMapping("hello") //*Anotação de qual a URL a classe vai responder
public class HellowController {


    @GetMapping //* Metodo para mostrar na tela um dos metodos HTTP!
    public String olaMundo(){

        return "Heelo Word!";




    }





}

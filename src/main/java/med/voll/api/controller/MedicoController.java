package med.voll.api.controller;

import med.voll.api.medico.DadosCadastrarMedico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//*Record retornando dados de uma classe imutavél
@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;


    @PostMapping   //*Resquisição HTTP para enviar dados
    public void cadastrar (@RequestBody DadosCadastrarMedico dados){  //* Declara como String e uma requisição do corpo RequestBody passa o Json inteiro





    }


}

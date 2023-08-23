package med.voll.api.controller;

import med.voll.api.pacientes.DadosPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//*Fazendo um controlador mapeando para paciente e retornando do insominia uma requisição de corpo
//* inteiro de um Jason através do RequestBody
@RestController
@RequestMapping("paciente")
public class PacienteController {

    @PostMapping
    public void dadosPaciente (@RequestBody DadosPaciente dados){

        System.out.println(dados);
    }







}

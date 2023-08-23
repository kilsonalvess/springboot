package med.voll.api.medico;

import med.voll.api.endereco.DadosEnderecoMedico;

public record DadosCadastrarMedico(String nome, String email, String crm , Especialidade especialidade, DadosEnderecoMedico endereco) {
}


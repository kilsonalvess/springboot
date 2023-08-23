package med.voll.api.pacientes;

import med.voll.api.endereco.DadosEnderecoPaciente;

public record DadosPaciente(String nome , String email, String cpf, DadosEnderecoPaciente endereco) {
}

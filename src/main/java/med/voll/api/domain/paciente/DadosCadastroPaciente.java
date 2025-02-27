package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "Nome é Obrigatório") String nome,
        @NotBlank(message = "Email é obrigatório") @Email(message = "Formato do email é inválido") String email,
        @NotBlank(message = "Telefone é obrigatório") String telefone,
        @NotBlank(message = "CRM é obrigatório") @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}", message = "Formato do CPF é inválido") String cpf,
        @NotNull(message = "Dados do endereço são obrigatórios") @Valid DadosEndereco endereco
) {
}
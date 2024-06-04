package dio.desafio.banco.oo;

import java.util.UUID;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Cliente {
    private String id = UUID.randomUUID().toString();
    @NonNull
    private String cpf;
    @NonNull
    private String nome;
}

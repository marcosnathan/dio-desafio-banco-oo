## Desafio DIO Banco Digital usando POO


Nesse desafio usamos POO para abastrair um Banco. Foi utilizada a biblioteca [Lombok](https://projectlombok.org/) para reduzir a verbosidade do Java para definição Java Beans e criação de novos objetos.

Exemplo de código:

```Java
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
```
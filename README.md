# Api_correio

Projeto Criado com o intuito de buscar qualquer CEP brasileiro.
Porém, os que estão especialmente dispiniveis para busca são de SP e MG.


# Conceito

Basicamente, ao subir o container, ela baixa esse csv com 900k de endereços e salva na tabela 'correio.address 39; dentro do MySQL.
Depois do setup é possível pesquisar de forma fácil, via API REST, qualquer cep Brasileiro.

# Pilha

-> Java 11+
-> MySQL
-> Spring family
-> Composição do Docker

# Cobertura de testículos

100% coberto por testes de integrações, utilizando:
-> org.mock-server
-> com.h2database

# Para compilar e testar

Execute no terminal: docker-compose up

Importante: Ao construir e subir uma API, ela pode demorar de 3 a 5 minutos para baixar todos os CEPs e insira no MySQL.
Enquanto esse setup não termina, você receberá o erro 503, conforme exemplo abaixo.

# Exemplos para testar

curl http://localhost:6868/zip/03358150
200 OK

``` Java
{
    "zipcode": "03358150",
    "street": "Rua Ituri",
    "district": "Vila Formosa",
    "state": "SP",
    "city": "São Paulo"
}


503 serviço indisponível

{
    "timestamp": "2023-01-16T23:27:34.962+00:00",
    "status": 503,
    "error": "Service Unavailable",
    "message": "This service is being installed, please wait a few moments.",
    "path": "/zip/03358150"
}
```

curl http://localhost:6868/zip/9999999
204 Sem Conteúdo



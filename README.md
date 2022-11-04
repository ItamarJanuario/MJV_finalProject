# MJV Projeto Final

#### Autor

- [Itamar Januario Lemos Junior]

#### Descrição do projeto

- Ecommerce de games focado em vendas de games digitais.

##### Tecnologias

* Java
* JPA Hibernate
* Postgres SQL
* Spring Boot
* Swagger


##### Diagrama de Classe
![](https://i.imgur.com/3I7PEyY.png)

##### Endpoints
* Usuarios
  ![](https://i.imgur.com/XPFTpMb.png)
* Enderecos
  ![](https://i.imgur.com/DI0CGu0.png)
* Produtos
  ![](https://i.imgur.com/hpPQA24.png)
* Pedidos
  ![](https://i.imgur.com/qIvrz6h.png)

##### Apresentação

1. Cadastro de Usuarios
2. Cadastro de Endereço
3. Cadastro de Produtos
4. cadastro de pedidos

##### JSON Cadastros

* Cadastrando um Usuario para teste
```
{
  "nome": "Itamar Januario Lemos Junior",
  "senha": "itamarpassword",
  "email": "itamar@email.com"
}
```

* Cadastrando um Endereço
```
{
    "logradouro": "TV Carlos Almeida Ruim",
    "cep": "48.325.154",
    "cidade": "Itamar City",
    "numero": 39,
    "bairro": "Campos verdes Lagos",
    "complemento": "Proximo ao chalé",
    "pais": "Russia"
}
```

* Cadastrando um Produto
```
{
    "nome": "Minecraft",
    "descricao": "Minecraft é um jogo eletrônico dos gêneros sandbox e sobrevivência que não possui objetivos específicos a serem alcançados",
    "valor": 30.00,
    "desenvolvedora": "Mojang Studios"
}

{
    "nome": "Tom Clancy's Rainbow Six Siege",
    "descricao": "É um jogo de tiro na primeira pessoa táctico",
    "valor": 29.50,
    "desenvolvedora": "Ubisoft"
}
```

* Criando um pedido
```
{
  "id": 1,
  "dataCompra": "2022-11-03",
  "statusPedido": "PENDENTE",
  "valorTotalCompra": 0.0,
  "listaItem": []
}
```

* Criando um item
```
{
    "id": 2,
    "produto": null
}
```

* Setando o pedido como confirmado


## License

MIT

**Free Software, Hell Yeah!**



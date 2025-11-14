Classe: Produto
Representa um item vendido numa loja. Possui um identificador, nome e preço. Deve permitir atualizar o preço e aplicar um desconto percentual.


```md

+-------------------------------------+
|        Produto                      |
+-------------------------------------+
| - id: int                           |
| - nome: string                      |
| - preco: double                     |
+-------------------------------------+
| + AtualizarPreco(valor: double):void|
| + Desconto(senha: double): void     |
+-------------------------------------+

```


🟨 Nível 2 — Intermediário

Classe: Pedido
Um pedido possui um código, data de criação e um status (por exemplo: "aberto", "pago", "cancelado").
Contém também uma lista de produtos adicionados ao pedido.
O pedido deverá permitir -adicionar um produto, -remover um produto e -calcular o valor total dos itens incluídos.

```md

+-------------------------------------+
|        Pedido                       |
+-------------------------------------+
| - codigo: int                       |
| - data: localDate                   |
| - status: Status                    |
| - itens: List<Produto>              |
+-------------------------------------+
| + Adicionar(item:Produto):void      |
| + Remover(item:produto):void        |
| + Calcular():double                 |
+-------------------------------------+

```


🟥 Nível 3 — Avançado

Classe: Usuario
Um usuário possui ID, nome, email e senha (armazenada como hash).
O usuário pode estar associado a zero ou mais pedidos.
Ele deve possuir comportamentos como: autenticar (comparando senha com hash), atualizar seus dados e listar todos os pedidos associados.
Usuários também podem estar marcados como "administrador" ou "comum".



```md

+---------------------------------------------------------+
|        Usuario                                          |
+---------------------------------------------------------+
| - id: int                                               |
| - nome: String                                          |
| - email: String                                         |
| - senha: SenhaHash                                      |
| - tipoUser:  TipoUser                                   |
| - pedidos: List<Pedidos>                                |
+---------------------------------------------------------+
| + Autenticar(Senha: SenhaHash, email: String):bool      |
| + Atualizar(senha: senhaHash, nome, email: String):void |
| + Listar():List<Pedidos>                                |    
+---------------------------------------------------------+

```



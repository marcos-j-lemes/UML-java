# UML-java
This repository provides an overview of how to use UML with Java.

## Diagram 


Aqui está **o diagrama UML completo** usando tudo:

* Retângulos (atributos e métodos)
* Associações
* Agregação
* Direcionalidade
* Multiplicidades

Usei o estilo **ASCII/Markdown**, que funciona perfeitamente em texto.

---

# **DIAGRAMA UML COMPLETO (Produto, Pedido, Usuario)**

```md
+-------------------------------------------+
|                 Produto                   |
+-------------------------------------------+
| - id: int                                  |
| - nome: string                             |
| - preco: double                            |
+-------------------------------------------+
| + atualizarPreco(valor: double): void      |
| + aplicarDesconto(percentual: double): void|
+-------------------------------------------+

                         0..* 
                     <---------- 
                    <>          
Pedido 1..* -------------------- Produto
                    agregação
```

```md
+--------------------------------------------+
|                   Pedido                   |
+--------------------------------------------+
| - codigo: int                               |
| - data: LocalDate                           |
| - status: Status                            |
| - itens: List<Produto>                      |
+--------------------------------------------+
| + adicionar(item: Produto): void            |
| + remover(item: Produto): void              |
| + calcularTotal(): double                   |
+--------------------------------------------+

```

```md
Usuario 1 -------------------- 0..* Pedido
             <>------------>
               agregação
```

```md
+--------------------------------------------------------+
|                        Usuario                         |
+--------------------------------------------------------+
| - id: int                                               |
| - nome: string                                          |
| - email: string                                         |
| - senhaHash: string                                     |
| - tipoUser: TipoUser                                    |
| - pedidos: List<Pedido>                                 |
+--------------------------------------------------------+
| + autenticar(senha: string): bool                       |
| + atualizar(nome: string, email: string, senha: string): void |
| + listarPedidos(): List<Pedido>                         |
+--------------------------------------------------------+
```

---

# **Resumo visual consolidado**

Aqui está o diagrama **todo junto**, numa forma mais compacta:

```md
                 0..*
        <>-------------------- Produto
        |                     +-------------------------------------------+
        |                     |                 Produto                   |
        | 1..*                +-------------------------------------------+
        |                     | - id: int                                  |
        |                     | - nome: string                             |
        |                     | - preco: double                            |
        |                     +-------------------------------------------+
        |                     | + atualizarPreco(valor: double): void      |
        |                     | + aplicarDesconto(percentual: double): void|
        |                     +-------------------------------------------+
+--------------------------------------------+
|                   Pedido                   |
+--------------------------------------------+
| - codigo: int                               |
| - data: LocalDate                           |
| - status: Status                            |
| - itens: List<Produto>                      |
+--------------------------------------------+
| + adicionar(item: Produto): void            |
| + remover(item: Produto): void              |
| + calcularTotal(): double                   |
+--------------------------------------------+
             ^
             |
             | 0..*
             |
             1
        <>------------>
+--------------------------------------------------------+
|                        Usuario                         |
+--------------------------------------------------------+
| - id: int                                               |
| - nome: string                                          |
| - email: string                                         |
| - senhaHash: string                                     |
| - tipoUser: TipoUser                                    |
| - pedidos: List<Pedido>                                 |
+--------------------------------------------------------+
| + autenticar(senha: string): bool                       |
| + atualizar(nome: string, email: string, senha: string): void |
| + listarPedidos(): List<Pedido>                         |
+--------------------------------------------------------+
```

---

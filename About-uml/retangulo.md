**O retângulo da UML**, também chamado de **caixa de classe** (Class Box).

# 🎯 1) O RETÂNGULO NA UML (atributos, métodos, identificação)

Na UML, uma classe é representada por **um retângulo dividido em até três partes**:

```
+------------------------+
|        Nome da Classe  |
+------------------------+
|      Atributos         |
+------------------------+
|        Métodos         |
+------------------------+
```

## ✅ (1) PRIMEIRA PARTE: Nome da classe

É sempre escrito:

* Com a **primeira letra maiúscula**
* No **singular**
* Sem detalhes de implementação

Exemplos:
`Usuario`, `Produto`, `Pedido`, `Carro`.

Se a classe for abstrata, o nome aparece em **itálico**.
Se for interface, aparece com o estereótipo `<<interface>>`.

---

## ✅ (2) SEGUNDA PARTE: Atributos

**Atributos** são as “variáveis” da classe: características, propriedades, estado.

Formato geral:

```
visibilidade nome: tipo
```

Exemplos:

```
- id: int
- nome: string
- preco: float
+ saldo: double
```

### Símbolos de visibilidade:

* `+` **public**
* `-` **private**
* `#` **protected**
* `~` **package/default**

### Como identificar um atributo?

Pergunte:

* É uma **característica fixa** da classe?
* Representa **estado guardado**?
* Vai precisar ser **armazenado** permanentemente?

Exemplo para `Usuario`:

* nome, email, senha = atributos
* login(), alterarSenha() = não são atributos → são métodos.

---

## ✅ (3) TERCEIRA PARTE: Métodos

**Métodos** são comportamentos, ações, funções da classe.

Formato:

```
visibilidade nome(parâmetros): retorno
```

Exemplos:

```
+ login(email: string, senha: string): bool
+ calcularTotal(): float
# validarToken(): void
```

### Como identificar um método?

Pergunte:

* É uma **ação** que o objeto realiza?
* Muda estado ou retorna alguma lógica?
* Representa um **comportamento** real?

---

## 🎯 Como saber o que vai em atributos e o que vai em métodos?

**Regra simples:**

* Se é **algo que o objeto TEM**, → atributo.
  Ex: usuário tem nome, tem email, tem ID.

* Se é **algo que o objeto FAZ**, → método.
  Ex: usuário faz login, altera senha, se autentica.

---

## Exemplo completo de classe UML

```
+-----------------------------+
|        Usuario              |
+-----------------------------+
| - id: int                  |
| - nome: string             |
| - email: string            |
| - senhaHash: string        |
+-----------------------------+
| + login(email, senha): bool|
| + alterarSenha(senha): void|
+-----------------------------+
```

---

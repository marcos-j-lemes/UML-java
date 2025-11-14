**segundo tópico da UML: as ligações (linhas e setas)**, e **vamos continuar usando as classes Produto, Pedido e Usuario nos exercícios**
---

# 🎯 2) LIGAÇÕES NA UML

As **ligações** entre classes representam **relacionamentos**.
Existem vários tipos, mas os 4 principais são:

1. **Associação** — (linha simples)
2. **Agregação** — (losango vazio)
3. **Composição** — (losango preenchido)
4. **Herança (generalização)** — (seta triangular vazada)

Depois também falamos sobre **direcionalidade** (setas →) e **papéis**.

Vamos por partes.

---

# 🟦 1. ASSOCIAÇÃO (Association)

É o relacionamento mais simples. Indica que **uma classe usa ou conhece a outra**.

Representado por:

```
ClasseA ---------------- ClasseB
```

Podendo ter seta:

```
ClasseA -------------> ClasseB
```

(seta significa que A conhece/usa B, mas B não necessariamente conhece A)

### Exemplos:

* Pedido usa Produto → associação.
* Usuario possui muitos Pedidos → associação.

---

# 🟪 2. AGREGAÇÃO (Aggregation)

É um tipo especial de associação que representa um **todo–parte**, mas fraco.
O todo *possui* a parte, mas **não controla sua existência**.

Representado por um **losango vazio** na classe "todo":

```
Pedido <>-------- Produto
```

Significado:

* Pedido tem produtos
* Produtos podem existir sem pedido

✔ Nosso exemplo **Pedido — Produto** pode ser representado assim.

---

# 🟥 3. COMPOSIÇÃO (Composition)

É um relacionamento **forte de todo–parte**:
Se o todo for destruído, as partes também são.

Representado por um **losango preenchido**:

```
Pedido ■-------- ItemPedido
```

Exemplo clássico:

* Um `Pedido` contém `ItemPedido`
* Um `ItemPedido` não existe sem seu pedido

Não usaremos ainda, mas posso incluir depois.

---

# 🟨 4. HERANÇA (Generalization)

Representa que uma classe **herda** outra.

Representado por uma **seta triangular aberta**:

```
    Usuario
      ▲
      |
Administrador
```

Ainda não usamos no exercício, mas você verá quando fizermos "Usuario comum" e "Admin".

---

# 🟩 DIRECIONALIDADE

As associações podem ter setas para indicar direção:

### Sem seta

Associação **bidirecional**

```
A -------- B
```

### Com seta

Associação **unidirecional**

```
A --------> B
```

Exemplo:
`Pedido → Produto` (pedido usa produto, produto não conhece pedido)

---

# 🟧 MULTIPLICIDADE (vamos falar só depois — é o terceiro tópico)

Para não misturar agora, falaremos das multiplicidades (1..*, 0..1, etc.) no **tópico 3**, como você pediu.

---
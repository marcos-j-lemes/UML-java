**TÓPICO 3: MULTIPLICIDADES (os números nas pontas das linhas)** — a última peça para dominar as relações UML.

---

# 🎯 3) MULTIPLICIDADES NA UML

As multiplicidades indicam **quantos objetos** podem participar de um relacionamento.

Elas ficam **nas extremidades das linhas**:

```
A 1 -------- 0..* B
```

Isto significa:

* Um objeto de A se relaciona com **zero ou muitos** objetos de B
* Cada objeto de B se relaciona com **exatamente um** objeto de A

---

# 🧩 PRINCIPAIS MULTIPLICIDADES

Aqui estão as mais usadas:

### ✔️ `1` — exatamente um

### ✔️ `0..1` — zero ou um

### ✔️ `*` ou `0..*` — zero ou muitos

### ✔️ `1..*` — um ou muitos

---

# 📝 Exemplos simples

## 1) Um Pedido tem vários Produtos

```
Pedido 1 ---- 0..* Produto
```

## 2) Um Usuario pode ter zero ou muitos Pedidos

```
Usuario 1 ---- 0..* Pedido
```

## 3) Um Produto pode estar em vários Pedidos

```
Produto 0..* ---- 0..* Pedido
```

---

# 🧠 COMO PENSAR

A regra é simples:

Pergunte: **“Quantos X podem existir para cada Y?”**

Exemplo:

* Quantos Pedidos um Usuario pode ter? → zero ou muitos → `0..*`
* Quantos Usuários um Pedido pode ter? → geralmente um → `1`

---
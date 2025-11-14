
# EXERCÍCIO (com as classes que você usou)

Baseando-se nas classes:

* Produto
* Pedido
* Usuario

Responda (não precisa desenhar agora, só responder):

### 📌 1) Qual é o relacionamento entre **Pedido** e **Produto**?

(Associação? Agregação? Com seta ou sem seta?)


```md

- R: Agregação

+----------+          +----------+
| Pedido   | <>------ | Produto  |
+----------+          +----------+


- Forma mais robusta:

+----------+ 1     * +------------+ 1     1 +----------+
| Pedido   | <>---- | ItemPedido | -------- | Produto  |
+----------+         +------------+          +----------+


```



### 📌 2) Qual é o relacionamento entre **Usuario** e **Pedido**?

(Associação? Agregação? Direção?)


```md

- R: Agregação

+----------+           +----------+
| Usuario  | <>------> | Pedido   | 
+----------+           +----------+

```


### 📌 3) Algum desses relacionamentos poderia ser **composição**?

```md

Pedido ■------ ItemPedido

```

---



# Estrutura de Dados - Lista de Exercícios 2 (Java)

Projeto da **Lista de Exercícios 2** da disciplina de **Estrutura de Dados** (2026/2), do curso de Tecnologia em Análise e Desenvolvimento de Sistemas (TADS) da **Fatec Carapicuíba**, ministrada pela Profa. Andreia.

O projeto implementa, em Java e do zero, duas estruturas de dados clássicas:

- **Lista Ligada Simples**: uma sequência de nós em que cada nó guarda um número inteiro e aponta para o próximo.
- **Fila (FIFO)**: uma sequência de nós em que cada nó guarda uma `Pessoa`. Quem entra primeiro é o primeiro a sair, como numa fila de atendimento.

Os exercícios pedem métodos novos dentro das classes que já existiam, além de testes, previsões de saída e justificativas. As respostas escritas (previsões, tabelas e justificativas) estão no arquivo `RespostasDaLista.docx`.

---

## Sumário

1. [Conceitos usados](#conceitos-usados)
2. [Estrutura do Projeto](#estrutura-do-projeto)
3. [Autores](#autores)

---

## Estrutura do Projeto

O projeto é dividido em duas pastas, uma para cada estrutura. Isso é necessário porque existem **duas classes chamadas `No`**, e elas não podem ficar na mesma pasta:

- o `No` da pasta `lista` guarda um `int`;
- o `No` da pasta `fila` guarda uma `Pessoa`.

```
Lista-Exercicios-2/
│
├── README.md
├── RespostasDaLista.docx          -> respostas escritas dos exercícios
│
└── fila/                          -> Seção 2: Fila
│   ├── Fila.java                  -> fila (FIFO)
│   ├── No.java                    -> nó com dado do tipo Pessoa
│   ├── Pessoa.java                -> nome e ano de nascimento
│   ├── TesteFila.java             -> Exercício 6
│
├── listas_ligadas/                         -> Seção 1: Lista Ligada Simples
│   ├── Lista.java                 -> lista ligada simples
│   ├── No.java                    -> nó com dado do tipo int
│   ├── TesteExercicio4.java       -> Exercício 4
│   ├── TesteLista.java            -> Exercício 2
│   ├── TesteLista2.java           -> Exercício 3
│   ├── TesteNo.java               -> Exercício 1
│
├── Fila.java                  -> Exercício 5d 
├── TesteExercicio5.java       -> Exercício 5
├── TesteExercicio8.java       -> Exercício 8
└── TesteAtendimento.java      -> Exercício 9
```
---

## Autores

| Nome | GitHub | Contribuição |
|---|---|---|
| **Miguel Pinto da Silva** | [github.com/Miguelpds10](https://github.com/Miguelpds10/) | Desenvolvimento do projeto e resoluções dos exercícios |
| **Isabela de Oliveira Alves** | [github.com/IsabelaCSS](https://github.com/IsabelaCSS) | Desenvolvimento do projeto e resoluções dos exercícios |

Desenvolvido como parte das atividades práticas da disciplina de Estrutura de Dados.

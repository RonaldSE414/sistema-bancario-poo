# Sistema de Conta Bancária Digital

## Autor

**Ronald Machado**  
Curso: Engenharia de Software

---

## Descrição

Sistema bancário desenvolvido em Java utilizando os principais conceitos de Programação Orientada a Objetos (POO).

O sistema possui três tipos de contas:

- Conta Corrente
- Conta Poupança
- Conta Salário

Também foram utilizados:

- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces
- Tratamento de Exceções

---

## Estrutura do Projeto

```text
src/
├── Main.java
├── ContaBancaria.java
├── ContaCorrente.java
├── ContaPoupanca.java
├── ContaSalario.java
├── Tributavel.java
├── Bloqueavel.java
├── SaldoInsuficienteException.java
└── OperacaoInvalidaException.java
```

---

## Principais Conceitos Utilizados

### Herança

As classes ContaCorrente, ContaPoupanca e ContaSalario herdam da classe abstrata ContaBancaria.

### Polimorfismo

Foi utilizada uma lista do tipo `List<ContaBancaria>` para armazenar diferentes tipos de contas e executar métodos de forma polimórfica.

### Interfaces

- `Tributavel`: define o cálculo de impostos.
- `Bloqueavel`: define operações de bloqueio e desbloqueio.

### Exceções

**SaldoInsuficienteException**

- Tipo: Unchecked Exception (`RuntimeException`)
- Utilizada quando o saldo é insuficiente para realizar uma operação.

**OperacaoInvalidaException**

- Tipo: Checked Exception (`Exception`)
- Utilizada quando uma operação é realizada em uma conta bloqueada.

---

## Regras de Negócio

### Conta Corrente

- Cheque especial de R$ 1.000,00.
- Permite saque utilizando saldo e cheque especial.
- Possui tributação.

### Conta Poupança

- Rendimento mensal de 0,5%.
- Imposto de 22,5% sobre o rendimento.

### Conta Salário

- Permite apenas um saque por mês.
- Não possui rendimento.

---

## Como Executar

1. Abrir o projeto no NetBeans.
2. Compilar o projeto.
3. Executar a classe `Main`.

---

## Conclusão

O projeto demonstra a aplicação prática dos conceitos fundamentais de Programação Orientada a Objetos através da implementação de um sistema bancário digital simples, seguindo os requisitos propostos no trabalho.
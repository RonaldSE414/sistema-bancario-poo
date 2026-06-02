# Sistema de Conta Bancária Digital

## Autor

**Ronald Machado**  
Curso: Engenharia de Software

---

## Descrição

Este projeto foi desenvolvido como atividade da disciplina de Programação Orientada a Objetos (POO) e consiste na implementação de um sistema de contas bancárias digitais em Java.

O sistema permite a criação e manipulação de diferentes tipos de contas bancárias, aplicando conceitos fundamentais da orientação a objetos como abstração, herança, polimorfismo, interfaces e tratamento de exceções.

---

## Objetivos

O sistema foi desenvolvido para:

- Simular operações bancárias básicas.
- Aplicar conceitos de Programação Orientada a Objetos.
- Implementar diferentes tipos de contas com regras específicas.
- Utilizar interfaces para representar comportamentos.
- Implementar exceções personalizadas.
- Demonstrar polimorfismo através de coleções.

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

## Classes do Sistema

### ContaBancaria

Classe abstrata responsável por reunir características comuns a todas as contas.

#### Atributos

- numero
- titular
- saldo
- ativa

#### Métodos

- depositar()
- sacar()
- bloquear()
- desbloquear()
- isAtiva()
- calcularRendimento()

---

### ContaCorrente

Representa uma conta corrente tradicional.

#### Características

- Possui cheque especial de R$ 1.000,00.
- Permite saque utilizando saldo e cheque especial.
- Implementa a interface Tributavel.

---

### ContaPoupanca

Representa uma conta poupança.

#### Características

- Possui rendimento mensal de 0,5%.
- Possui tributação sobre o rendimento.
- Implementa a interface Tributavel.

---

### ContaSalario

Representa uma conta salário.

#### Características

- Permite apenas um saque por mês.
- Não possui rendimento.
- Não possui tributação.

---

## Interfaces

### Tributavel

Responsável por definir o comportamento de cálculo de impostos.

```java
double calcularImposto();
```

Implementada por:

- ContaCorrente
- ContaPoupanca

---

### Bloqueavel

Responsável por definir o comportamento de bloqueio das contas.

```java
void bloquear();
void desbloquear();
boolean isAtiva();
```

Implementada pela classe ContaBancaria e herdada pelas demais contas.

---

## Exceções Personalizadas

### SaldoInsuficienteException

```java
extends RuntimeException
```

Utilizada quando uma operação tenta movimentar um valor superior ao saldo disponível.

---

### OperacaoInvalidaException

```java
extends Exception
```

Utilizada quando uma operação é realizada em uma conta bloqueada.

---

## Justificativas de Projeto

### Classe Abstrata ContaBancaria

A classe ContaBancaria foi definida como abstrata porque representa um modelo genérico de conta bancária. Ela reúne atributos e comportamentos comuns às demais contas, mas não deve ser instanciada diretamente.

Essa abordagem evita duplicação de código e promove reutilização através da herança.

---

### Interface Tributavel

A interface Tributavel foi utilizada para representar o comportamento de cálculo de impostos.

Nem todos os tipos de conta possuem tributação, portanto a interface permite que apenas as classes que realmente precisam desse comportamento o implementem.

---

### Interface Bloqueavel

A interface Bloqueavel foi criada para padronizar as operações de bloqueio e desbloqueio das contas.

Dessa forma, todas as contas possuem o mesmo conjunto de operações relacionadas ao estado de atividade da conta.

---

### SaldoInsuficienteException

Foi implementada como uma Unchecked Exception (RuntimeException).

A justificativa é que saldo insuficiente representa uma situação comum de negócio e não necessariamente exige tratamento obrigatório em todos os pontos do sistema.

---

### OperacaoInvalidaException

Foi implementada como uma Checked Exception (Exception).

A justificativa é que operações em contas bloqueadas devem obrigatoriamente ser tratadas pelo programador, evitando falhas de execução e comportamentos inesperados.

---

### Polimorfismo

O polimorfismo foi demonstrado através da utilização de uma lista do tipo:

```java
List<ContaBancaria>
```

Essa abordagem permite armazenar objetos de diferentes subclasses utilizando uma referência da superclasse, possibilitando o tratamento uniforme dos objetos.

---

## Regras de Negócio

### Conta Corrente

- Cheque especial de R$ 1.000,00.
- Permite saque utilizando saldo e cheque especial.
- Possui tributação de 0,38%.

### Conta Poupança

- Rendimento mensal de 0,5%.
- Imposto de 22,5% sobre o rendimento.

### Conta Salário

- Apenas um saque permitido por mês.
- Não possui rendimento.

---

## Conceitos de POO Aplicados

### Encapsulamento

Os atributos são protegidos e manipulados através dos métodos da classe.

### Herança

As classes ContaCorrente, ContaPoupanca e ContaSalario herdam da classe ContaBancaria.

### Abstração

A classe ContaBancaria representa um modelo abstrato de conta.

### Polimorfismo

Diferentes tipos de contas são tratados através da mesma referência da superclasse.

### Interfaces

Tributavel e Bloqueavel representam comportamentos compartilhados entre diferentes classes.

### Sobrescrita de Métodos

Cada tipo de conta implementa seus próprios comportamentos para cálculo de rendimento e demais operações.

---

## Como Executar

1. Abrir o projeto no NetBeans.
2. Criar os arquivos conforme a estrutura apresentada.
3. Compilar o projeto.
4. Executar a classe Main.

---

## Resultado Esperado

Ao executar o sistema será possível observar:

- Demonstração do polimorfismo.
- Cálculo de rendimentos.
- Cálculo de impostos.
- Tratamento de saldo insuficiente.
- Tratamento de operações em contas bloqueadas.

---

## Conclusão

O desenvolvimento deste projeto permitiu aplicar de forma prática os principais conceitos da Programação Orientada a Objetos utilizando Java. A solução implementa diferentes tipos de contas bancárias, interfaces, herança, polimorfismo e exceções personalizadas, atendendo aos requisitos propostos no trabalho e demonstrando uma estrutura organizada e reutilizável.
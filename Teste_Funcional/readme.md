# Teste Funcional — Programa Identifier

Atividade prática da disciplina **Teste de Software** (IFRN), aplicando o critério funcional de **Particionamento em Classes de Equivalência** e **Análise de Valor Limite** na implementação e validação do programa `Identifier`.

## Especificação

O programa determina se um identificador é válido. Um identificador válido deve:

- Começar com uma letra;
- Conter apenas letras ou dígitos;
- Ter no mínimo 1 e no máximo 6 caracteres de comprimento.

## Estrutura do projeto

```
src
├── main
│   └── java
│       └── org.alessandra
│           ├── Identifier.java  
│           └── Main.java        
└── test
    └── java
        └── org.alessandra
            └── IdentifierTest.java   # testes automatizados (JUnit 5)
```

## Como executar

**Rodar os testes automatizados:**

```bash
mvn test
```

## Casos de teste

Os casos de teste foram derivados a partir do Particionamento em Classes de Equivalência (comprimento, caractere inicial, tipos de caracteres) e complementados pela Análise de Valor Limite (t = 0, 1, 6 e 7). Detalhes completos da derivação estão no relatório técnico (`relatorio_teste_funcional_identifier.pdf`).

| # | Test Data | Classes Cobertas | Resultado Esperado |
|---|---|---|---|
| 1 | `1111` | (1)(5)(6) | Inválido |
| 2 | `maria` | (1)(4)(6) | Válido |
| 3 | `""` | (2)(5) | Inválido |
| 4 | `a` | (1)(4)(6) — limite t=1 | Válido |
| 5 | `cba456` | (1)(4)(6) — limite t=6 | Válido |
| 6 | `cba4569` | (3)(4)(6) — limite t=7 | Inválido |
| 7 | `a#1` | (1)(4)(7) | Inválido |

## Tecnologias

- Java 21
- Maven
- JUnit 5


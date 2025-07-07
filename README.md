# Projeto de Algoritmos - Dividir e Conquistar

**Número da Lista**: 4 </br>
**Conteúdo da Disciplina**: Algoritmos - Dividir e Conquistar

## Aluno

| Matrícula  | Nome                         |
| ---------- | ---------------------------- |
| 190048191| Renan Rodrigues Lacerda |

## Link vídeo: [Apresentação em Vídeo](#)

## Sobre

Este repositório contém as soluções para uma série de problemas clássicos da plataforma LeetCode, todos resolvidos utilizando a estratégia de algoritmos de **Dividir e Conquistar**. O objetivo é demonstrar a aplicação prática deste paradigma em diferentes cenários, desde problemas com arrays numéricos até estruturas de dados mais complexas como listas ligadas.

A abordagem de Dividir e Conquistar consiste em três etapas:
1.  **Dividir**: Quebrar o problema principal em subproblemas menores e independentes.
2.  **Conquistar**: Resolver os subproblemas recursivamente. Quando os subproblemas se tornam pequenos o suficiente (caso base), eles são resolvidos diretamente.
3.  **Combinar**: Unir as soluções dos subproblemas para formar a solução do problema original.

Cada solução neste projeto está contida em sua própria classe `Solution`, pronta para ser testada no ambiente do LeetCode.

## Visão Geral dos Problemas

### 1. Maximum Subarray
**Link do problema**: [leetcode.com/problems/maximum-subarray](https://leetcode.com/problems/maximum-subarray/description/)<br>
**Descrição**: Dado um array de inteiros, o desafio é encontrar o subarray contíguo com a maior soma possível. A solução de dividir e conquistar quebra o array ao meio e considera que a soma máxima pode estar inteiramente à esquerda, à direita, ou cruzando o ponto médio.
**Abordagem**: Dividir e Conquistar ($O(n \log n)$).

### 2. Sort an Array
**Link do problema**: [leetcode.com/problems/sort-an-array](https://leetcode.com/problems/sort-an-array/description/)<br>
**Descrição**: O objetivo é ordenar um array de inteiros em ordem crescente. O algoritmo **Merge Sort** é a implementação canônica de um algoritmo de ordenação por dividir e conquistar.
**Abordagem**: Merge Sort ($O(n \log n)$).

### 3. Median of Two Sorted Arrays
**Link do problema**: [leetcode.com/problems/median-of-two-sorted-arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/)<br>
**Descrição**: Encontrar a mediana de dois arrays ordenados como se fossem um único array combinado. A solução ótima é uma forma avançada de dividir e conquistar que usa busca binária para encontrar a partição correta nos arrays que define a mediana.
**Abordagem**: Busca Binária sobre Partições ($O(\log(\min(m,n)))$).

### 4. Merge k Sorted Lists
**Link do problema**: [leetcode.com/problems/merge-k-sorted-lists](https://leetcode.com/problems/merge-k-sorted-lists/description/)<br>
**Descrição**: Mesclar `k` listas ligadas, todas ordenadas, em uma única lista ligada ordenada. A estratégia é dividir o conjunto de `k` listas em dois subconjuntos, resolver recursivamente e, por fim, mesclar as duas listas resultantes.
**Abordagem**: Dividir e Conquistar com Mesclagem de Pares ($O(N \log k)$).

## Screenshots - Submissões Aceitas

### 1. Maximum Subarray
![Submissão aceita para Maximum Subarray]()

### 2. Sort an Array
![Submissão aceita para Sort an Array]()

### 3. Median of Two Sorted Arrays
![Submissão aceita para Median of Two Sorted Arrays]()

### 4. Merge k Sorted Lists
![Submissão aceita para Merge k Sorted Lists]()


## Instalação
**Linguagem**: ***Java***<br>
**Build Tool**: Nenhum (apenas JDK)<br>

**Pré-requisitos**
* Java Development Kit (JDK) versão 8 ou superior instalado e configurado no `PATH` do sistema.

## Uso

Cada solução é um arquivo `.java` autocontido e pode ser compilada e executada individualmente. A lógica principal está dentro da classe `Solution`, conforme exigido pelo LeetCode.

### Passos para testar localmente:

1.  **Navegue até a pasta do projeto**
    ```bash
    cd caminho/para/o/repositorio
    ```

2.  **Compile o arquivo Java**
    Por exemplo, para o problema "Maximum Subarray":
    ```bash
    javac MaximumSubarray.java
    ```
    *(Nota: para testar localmente, pode ser necessário adicionar um método `main` ao arquivo para instanciar a classe `Solution` e chamar o método com dados de exemplo).*

3.  **Execute o programa (se um método `main` for adicionado)**
    ```bash
    java MaximumSubarray
    ```

4.  **Uso no LeetCode**
    A forma mais simples de usar o código é copiar o conteúdo da classe `Solution` de cada arquivo e colar diretamente no editor de código da respectiva página do problema no LeetCode e submeter.

## Outros
* O código foi formatado para clareza e inclui comentários explicando os passos da abordagem de Dividir e Conquistar.
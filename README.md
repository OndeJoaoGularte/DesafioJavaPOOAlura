# 🎧 Simulador de Plataforma de Áudio (Desafio Alura)

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![Curso](https://img.shields.io/badge/Alura-Aplicando%20a%20Orientação%20a%20Objetos-blueviolet)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-success)

Este projeto foi desenvolvido como um desafio prático ao final do segundo curso de Java da **Alura**, o curso "Java: Aplicando a Orientação a Objetos". O intuito do sistema é simular o ecossistema de uma plataforma de Streaming de Áudio, aplicando conceitos de Programação Orientada a Objetos.

---

## 🎯 Objetivo do Projeto

O projeto tem como objetivo principal evoluir da programação estruturada para a orientação a objetos. Modelando corretamente o domínio da aplicação, abstraindo características e comportamentos comuns entre diferentes tipos de áudios e implementando regras de negócio específicas para classificá-los.

---

## 🚀 Funcionalidades

O sistema simula o back-end de um reprodutor de áudio com as seguintes capacidades:

1. **Catálogo de Áudios:** Criação e gerenciamento de diferentes tipos de mídia, especificamente Músicas (`Track`) e Podcasts (`Podcast`).
2. **Interação de Usuários:** Simulação de ações como "reproduzir" e "curtir", que incrementam as estatísticas de cada áudio.
3. **Classificação Dinâmica:** Sistema de notas baseado em métricas diferentes para cada tipo de mídia (músicas são avaliadas pelo número de reproduções, enquanto podcasts são avaliados pelo número de curtidas).
4. **Filtro de Favoritos:** Um sistema que analisa a classificação de qualquer áudio e exibe um feedback textual informando se ele é um "sucesso absoluto" ou apenas "legal".

---

## 🛠️ Tecnologias Utilizadas

* **Java (JDK 25):** Linguagem de programação utilizada para a construção de toda a lógica e modelagem das classes.
* **IntelliJ IDEA:** Ambiente de Desenvolvimento Integrado (IDE) utilizado para a escrita, compilação e execução do código.

---

## 🧠 Conceitos Aplicados

* **Abstração e Classes:** Criação de classes para representar entidades do mundo real (`Audio`, `Track`, `Podcast`, `MyFavorites`), separando o código em pacotes (`br.com.onde.ondemusica.models`).
* **Encapsulamento:** Proteção dos atributos das classes utilizando o modificador `private` e controle de acesso e modificação através de métodos `getters` e `setters`.
* **Herança:** Utilização da palavra-chave `extends` para criar uma hierarquia onde `Track` e `Podcast` herdam as características e métodos comuns da superclasse `Audio`, evitando repetição de código.
* **Sobrescrita de Métodos (`@Override`):** Customização do comportamento herdado. O método `getClassification()` foi reescrito nas subclasses para aplicar regras de negócio distintas para músicas e podcasts.
* **Polimorfismo:** Capacidade de tratar diferentes objetos de forma genérica. O método `include` na classe `MyFavorites` aceita qualquer objeto do tipo `Audio` (seja música ou podcast), garantindo que o sistema seja facilmente expansível no futuro.

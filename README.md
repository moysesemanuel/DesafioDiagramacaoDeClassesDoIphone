# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Este projeto simula a implementação de interfaces para um dispositivo móvel, representado pela classe `IPhone`, que implementa três interfaces: `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.

## Funcionalidades

A classe `IPhone` implementa as seguintes funcionalidades:
1. **Reprodutor Musical**: Permite selecionar, tocar e pausar músicas.
2. **Aparelho Telefônico**: Permite ligar, atender chamadas e iniciar o correio de voz.
3. **Navegador de Internet**: Permite exibir páginas, adicionar abas e atualizar páginas.

## Estrutura do Projeto

O projeto consiste nas seguintes interfaces e classe:

### Interfaces

1. **ReprodutorMusical**:
    - `tocar()`: Inicia a reprodução de uma música.
    - `pausar()`: Pausa a reprodução da música.
    - `selecionarMusica()`: Seleciona a música automaticamente.

2. **AparelhoTelefonico**:
    - `ligar()`: Realiza uma ligação.
    - `atender()`: Atende uma chamada.
    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. **NavegadorInternet**:
    - `exibirPagina()`: Exibe uma página da internet.
    - `adicionarAba()`: Adiciona uma nova aba.
    - `atualizarPagina()`: Atualiza a página exibida.

### Classe `IPhone`

A classe `IPhone` implementa todas as interfaces acima e seus respectivos métodos, simulando um dispositivo móvel com funcionalidades de reprodutor musical, aparelho telefônico e navegador de internet.

### Diagrama de Classes

O diagrama de classes deste projeto é ilustrado a seguir:

```plantuml
@startuml

interface ReprodutorMusical {
    +tocar()
    +pausar()
    +selecionarMusica()
}

interface AparelhoTelefonico {
    +ligar()
    +atender()
    +iniciarCorreioVoz()
}

interface NavegadorInternet {
    +exibirPagina()
    +adicionarAba()
    +atualizarPagina()
}

class IPhone {
    +tocar()
    +pausar()
    +selecionarMusica()
    +ligar()
    +atender()
    +iniciarCorreioVoz()
    +exibirPagina()
    +adicionarAba()
    +atualizarPagina()
}

IPhone ..|> ReprodutorMusical
IPhone ..|> AparelhoTelefonico
IPhone ..|> NavegadorInternet

@enduml

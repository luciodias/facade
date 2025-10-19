# Perguntas para Reflexão
Após completar a implementação, responda:

Qual é o papel do ComboFacade neste sistema?
- Fornecer uma interface simplificada e unificada para criação dos combos.

Como ele simplifica a vida do cliente (Main)?
- Simplificado a interação com a classe Combo e a instânciamento dos itens.

Por que usamos a interface ItemCombo?
- Para ter um 'contrato' unificado para qualquer tipo de item a ser incluido e uma padronização dos métodos.

Que benefícios isso traz para o design?
- Podemos esconder a complexidade, desacoplar o código e facilitar a manutenção e edição de nosvos combos.

Compare com o padrão Singleton:
- O Facade é um padrão estrutural focado na simplificação de interfaces e desacoplamento, já o Singleton é um padrão Criaconal focado na garantia de instância única de objetos.

Poderia o ComboFacade também ser um Singleton? Por quê?
Em que situação isso seria útil?
- Sim, a calsse podria ser implementada desta forma. Isso garantiria a centralizaçâo da crição dos combos e que não haveria divergência de preços e nomes por exemplo.


Identifique os subsistemas:

Quais são as classes que representam a "complexidade" escondida?
- As classes do model, Combo e Itens

O que aconteceria se o cliente (Main) tivesse que criar cada item individualmente?
- O codigo seria mais extendo, complexo, acoplado e difícil de manter.

Extensibilidade:

Como você adicionaria um novo combo (Combo 4) ao sistema?
- Alterando o ComboFacade

Que classes precisariam ser modificadas?
- ComboFacade e Main

Validação e Tratamento de Erros:

Como o sistema trata um código de combo inválido?
- Verificando o range com um if e escolhendo com um switch.

Que melhorias você sugere?
- Um metodo que retorne os Combos disponiveis e uma estrutura de array ao invés de um CASE para cada Combo.
# Projeto-Poo
Projeto de Programação Orientada a Objetos — RPG 2D de batalha desenvolvido para fins acadêmicos. Inclui sistema de personagens, combate
BadQuest

O sistema de combate do projeto foi desenvolvido utilizando Programação Orientada a Objetos (POO) e o padrão de projeto Strategy.

A classe abstrata Entity representa qualquer personagem do jogo (jogador ou inimigo) e contém os atributos básicos como vida, ataque, defesa e magia. As classes Player e Enemy herdam de Entity, reutilizando esses atributos e comportamentos comuns.

Os ataques não são implementados diretamente nas classes Player ou Enemy. Em vez disso, foi criada a interface AttackStrategy, que define o comportamento de um ataque. Cada tipo de ataque (como ataque físico com espada ou ataque mágico) é implementado em uma classe separada (SwordAttack, MagicAttack).

Dessa forma, o personagem apenas executa o ataque atual, sem conhecer os detalhes do cálculo de dano. Isso permite que o tipo de ataque seja alterado dinamicamente durante o jogo, facilitando a expansão do sistema e evitando estruturas complexas de decisão (if/else).
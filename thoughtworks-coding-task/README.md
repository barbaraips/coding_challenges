# Exercício: Reserva de Hotel

## Instruções

Uma rede de hotéis em Miami gostaria de criar uma plataforma digital de reservas. A rede é composta por três hotéis: Lakewood, Bridgewood e Ridgewood. Cada hotel tem taxas diferenciadas para dia de semana ou final de semana, incluindo taxas específicas para participantes do programa de fidelidade. Adicionalmente, cada hotel tem uma classificação, indicando a excelência do serviço.


|    Hotel   | Classificação | Dia de semana | Dia de semana reward | Fim de semana | Fim de semana reward |
|:----------:|:-------------:|:-------------:|:--------------------:|:-------------:|:--------------------:|
|  Lakewood  |       3       |   R$ 110,00   |       R$ 80,00       |    R$ 90,00   |       R$ 80,00       |
| Bridgewood |       4       |   R$ 160,00   |       R$ 110,00      |    R$ 60,00   |       R$ 50,00       |
|  Ridgewood |       5       |   R$ 220,00   |       R$ 100,00      |   R$ 150,00   |       R$ 40,00       |


Escreva um programa para encontrar o hotel mais barato. A entrada do programa será uma sequência de datas para um cliente participante ou não do programa de fidelidade. Utilize "Regular" para denominar um cliente normal e "Reward" para um cliente participante do programa de fidelidade. A saída deverá ser o hotel disponível mais barato e em caso de empate, o hotel com a maior classificação deverá ser retornado.

Formato da entrada:
```
<tipo_do_cliente>: <data1>, <data2>, <data3>, …
```
Formato da saída:
```
<nome_do_hotel_mais_barato>
```

### Exemplos:

Entrada 1: `Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)`

Saída 1: `Lakewood`

Entrada 2: `Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)`

Saída 2: `Bridgewood`

Entrada 3: `Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)`

Saída 3: `Ridgewood`

## Como executar:

This has been created using gradle; to run the tests, just execute:

```
/bin/bash  ./gradlew 
```


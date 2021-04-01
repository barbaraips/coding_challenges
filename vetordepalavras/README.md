# Vetor de Palavras

Várias aplicações de processamento de linguagem natural necessitam que o texto seja formatado de forma estruturada, diferente da linguagem natural. Uma solução para isso é organizar as palavras do texto em um vetor que represente o documento em termos das palavras que ocorrem no mesmo.

Como exemplo, suponha dois documentos distintos contendo os textos abaixo:

    texto1.txt: “Falar é fácil. Mostre-me o código.”
    texto2.txt: “É fácil escrever código. Difícil é escrever código que funcione.”

Esses dois textos possuem a seguinte lista de palavras únicas (ignorando case e pontuação):
    
    1. falar
    2. é
    3. fácil
    4. mostre
    5. me
    6. o
    7. código
    8. escrever
    9. difícil
    10. que
    11. funcione

Ou seja, são 11 palavras distintas no vocabulário de dois textos com 17 palavras no total.

O vetor de palavras então calcula, para cada documento, a quantidade de vezes que cada palavra do vocabulário aparece. Para isso, podemos representar o vocabulário como um vetor de tamanho N (onde N é o tamanho do vocabulário), e cada texto terá o seu vetor com a quantidade de vezes que a palavra k do vocabulário aparece inserida na posição k do vetor. Como resultado, teremos:

    texto1: [1,1,1,1,1,1,1,0,0,0,0]
    texto2: [0,2,1,0,0,0,2,2,1,1,1]

Uma alternativa mais elaborada é fazer um vocabulário com 2 palavras (2-gram) na sequência:

    1. falar é
    2. é fácil
    3. fácil mostre
    4. mostre me
    5. me o
    6. o código
    7. fácil escrever
    8. escrever código
    9. código difícil
    10. difícil é
    11. é escrever
    12. código que
    13. que funcione

Nesse caso, os vetores de palavras de cada documento do exemplo seriam de tamanho 13 e conteriam os seguintes valores:

    texto1: [1,1,1,1,1,1,0,0,0,0,0,0,0]
    texto2: [0,1,0,0,0,0,1,2,1,1,1,1,1]


## Problema

Desenvolva uma API REST que permita a um usuário enviar textos de entrada, e que gere como resultado o vocabulário formado pelas palavras dos textos e o vetor de palavras para cada arquivo considerando dois cenários:

1. o vocabulário é composto de palavras isoladas.
2. o vocabulário é composto de grupos de duas palavras em sequência (2-gram).

Cabe ressaltar que uma palavra é considerada como uma sequência de letras e dígitos, começando com uma letra. Remova palavras que não agregam muito valor do vocabulário, chamadas stop-words, como “o”, “a”, “que”, “me”, etc.

O vocabulário deve ser criado a partir das palavras de todos os N textos.

## Entrada

O usuário poderá enviar textos via api REST 

## Retorno

Após o envio dos textos, o usuário poderá solicitar os seguintes resultados:

1. O vocabulário completo formado pelas palavras isoladas;
2. O vocabulário completo formado por grupos de 2 palavras em sequência (2-gram);
3. Os N vetores de palavras de todos os documentos, considerando o vocabulário formado pelas palavras isoladas;
4. Os N vetores de palavras de todos os documentos, considerando o vocabulário formado por grupos de 2 palavras em sequência (2-gram);

# Entregas:

1. Entregar uma documentação técnica sobre as estruturas de dados escolhidas para resolver o problema e as ferramentas/tecnologias utilizadas para o desenvolvimento da API

2. O código fonte deve ser disponibilizado em um repositório público do GitHub (http://github.com ). Será levado em consideração a frequência dos commits e a separação temática entre eles. 


--------

One Paragraph of project description goes here


These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


What things you need to install the software and how to install them

```
Give examples
```


A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo


Explain how to run the automated tests for this system


Explain what these tests test and why

```
Give an example
```


Explain what these tests test and why

```
Give an example
```


Add additional notes about how to deploy this on a live system


* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds


Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.


We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 


* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.


This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


* Hat tip to anyone whose code was used
* Inspiration
* etc

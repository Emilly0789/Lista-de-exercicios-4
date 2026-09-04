#Questão 1

A) "Os construtores de superclasse não são herdados por subclasses.": Verdadeira.

B) "Um relacionamento tem-um é implementado via herança.": Falsa. O relacionamento "tem-um" (has-a) é implementado por composição (também chamada de agregação), não por herança. Nesse tipo de relacionamento, uma classe contém uma referência a um objeto de outra classe como atributo (por exemplo, um Carro tem um Motor). Já a herança implementa o relacionamento "é-um" (is-a) — por exemplo, um Cachorro é um Animal. A herança estabelece uma relação de especialização/generalização entre classes, enquanto a composição estabelece uma relação de posse/contenção entre objetos.

C) "Quando uma subclasse redefine um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método.": Falsa. Quando uma subclasse redefine um método da superclasse usando exatamente a mesma assinatura (mesmo nome, mesmo número e tipo de parâmetros), isso é chamado de sobrescrita (overriding), não sobrecarga. A sobrecarga (overloading) ocorre quando múltiplos métodos têm o mesmo nome, mas assinaturas diferentes (parâmetros diferentes em número, tipo ou ordem), podendo até estar na mesma classe — não é necessariamente relacionada à herança.

#Questão 2

Os críticos de protected têm razão em que ele de fato enfraquece o encapsulamento em relação a private, porque amplia o conjunto de código que pode depender dos detalhes internos da classe. A questão não é se isso é verdade — é se esse trade-off vale a pena no contexto específico, dado o ganho em reutilização e extensibilidade de código pela herança.

#Questão 3

Quando você cria um objeto de uma subclasse, o processo de construção não começa pela subclasse — ele começa pela raiz da hierarquia (a superclasse mais alta) e vai descendo até a classe do objeto que está sendo instanciado.

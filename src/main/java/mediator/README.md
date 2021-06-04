# Patrón De Diseño Mediator

## Ejercicios
-  [Ejercicio 16: Canal de Comunicación SKYPE](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/mediator/e16_canal_de_comunicacion_2P)

## Introducción
El *patrón de diseño* **Mediador** o **Mediator**  define un objeto que encapsula cómo un conjunto de objetos interactúan. Este *patrón de diseño* está considerado como un *patró*n de **comportamiento** debido al hecho de que puede alterar el comportamiento del programa en ejecución.

Habitualmente un programa está compuesto de un número de clases (muchas veces elevado). La lógica y computación es distribuida entre esas clases. Sin embargo, cuantas más clases son desarrolladas en un programa, especialmente durante mantenimiento y/o refactorización, el problema de comunicación entre estas clases quizás llegue a ser más complejo. Esto hace que el programa sea más difícil de leer y mantener. Además, puede llegar a ser difícil cambiar el programa, ya que cualquier cambio podría afectar código en muchas otras clases.

Con el patrón mediador, la comunicación entre objetos es encapsulada con un objeto mediador. Los objetos no se comunican de forma directa entre ellos, en lugar de ello se comunican mediante el mediador. Esto reduce las dependencias entre los objetos en comunicación, reduciendo entonces la Dependencia de código.

## Definición
 La esencia de este **patrón de diseño** es: *"Definir un objeto que encapsula cómo un conjunto de objetos interactúan. El mediador busca reducir la dependencia evitando que los objetos se relacionen entre ellos de forma explícita, y permitiendo variar cualquier interacción independientemente."*
</br>
</br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/mediator.png" />
 </p>
 

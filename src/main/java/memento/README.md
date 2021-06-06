# Patrón De Diseño Memento

## Ejercicios
-  [Ejercicio 17: Back Up Base de Datos](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/memento/e17_back_up_base_de_datos_2P)

## Introducción
**Memento**, es un *patrón de diseño* cuya finalidad es almacenar el estado de un objeto (o del sistema completo) en un momento dado 
de manera que se pueda restaurar en ese punto de manera sencilla. Para ello se mantiene almacenado el estado del objeto para un instante
de tiempo en una clase independiente de aquella a la que pertenece el objeto (pero sin romper la encapsulación), de forma que ese 
recuerdo permita que el objeto sea modificado y pueda volver a su estado anterior.

## Motivación
Se usa este *patrón de diseño* cuando se quiere poder restaurar el sistema desde estados pasados y por otra parte, es usado cuando se desea 
facilitar el hacer y deshacer de determinadas operaciones, para lo que habrá que guardar los estados anteriores de los objetos sobre los 
que se opere (o bien recordar los cambios de forma incremental).</br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/memento-es.png" />
 </p>
 

# Patrón De Diseño Iterator

## Ejercicios
- [Ejercicio 8: Empleados Empresa de Software](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/iterator/e8_empresa_de_software)

## Introducción
El *patrón de diseño* **Iterator** o **Iterador**, define una interfaz que declara los métodos necesarios para acceder secuencialmente a un grupo de objetos de una colección. Algunos de los métodos que podemos definir en la interfaz Iterador son:
```
Primero(), Siguiente(), HayMas() y ElementoActual().
```
Este patrón de diseño permite recorrer una estructura de datos sin que sea necesario conocer la estructura interna de la misma.
## Motivación
El patrón surge del deseo de acceder a los elementos de un contenedor de objetos (por ejemplo, una lista) sin exponer su representación interna. Además, es posible que se necesite más de una forma de recorrer la estructura siendo para ello necesario crear modificaciones en la clase.

La solución que propone el patrón es añadir métodos que permitan recorrer la estructura sin referenciar explícitamente su representación. La responsabilidad del recorrido se traslada a un objeto iterador.

El problema de introducir este objeto iterador reside en que los clientes necesitan conocer la estructura para crear el iterador apropiado.

Esto se soluciona generalizando los distintos iteradores en una abstracción y dotando a las estructuras de datos de un método de fabricación que cree un iterador concreto.
</br>
</br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/iterator-es.png" />
 </p>
 

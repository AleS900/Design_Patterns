# Patrón De Diseño Builder

## Ejercicios
-  [Ejercicio 5: Restaurante de Pizzas ](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/prototype/e2_celulares)

## Introducción
El *patrón de diseño* **Builder** o **Constructor** se usa para permitir la creación de una variedad de objetos complejos desde un objeto fuente (Producto), el objeto fuente se compone de una variedad de partes que contribuyen individualmente a la creación de cada objeto complejo a través de un conjunto de llamadas secuenciales a una implementación específica que extienda la clase Abstract Builder. Así, cada implementación existente de Abstract Builder construirá un objeto complejo Producto de una forma diferente deseada.

El patrón builder es creacional.

**Intención:** Abstrae el proceso de creación de un objeto complejo, centralizando dicho proceso en un único punto, de tal forma que el mismo proceso de construcción pueda crear representaciones diferentes.
</br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/problem1.png" />
 </p>
 

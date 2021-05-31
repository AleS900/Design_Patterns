# Patrón De Diseño Prototype

## Ejercicios
-  [Ejercicio 2: Registro Dispositivos Móviles ](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/prototype/e2_celulares)
-  [Ejercicio 12: Contrato de Docentes](https://github.com/AleS900/Design_Patterns/tree/main/src/main/java/prototype/e12_contrato_de_docentes)

## Introducción
El *patrón de diseño* **prototipo** o **prototype** tiene como finalidad crear nuevos objetos clonando una instancia creada previamente. Este *patrón* especifica la clase de objetos a crear mediante la clonación de un prototipo que es una instancia ya creada. La clase de los objetos que servirán de prototipo deberá incluir en su interfaz la manera de solicitar una copia, que será desarrollada luego por las clases concretas de prototipos.<br/>

 </br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/prototype.png" />
 </p>
<br/>

## Clonación Profunda Frente A Clonación Superficial

Entre las diferentes modalidades entre las que puede optar a la hora de implementar la clonación de un objeto prototipo, cabe destacar dos maneras de realizar la clonación: superficial y profunda.<br/>

En la primera de ellas un cambio sobre el objeto asociado con un clon afecta al objeto original, porque los objetos relacionados son los mismos (es decir, la clonación replica sólo el propio objeto y su estado, no sus asociaciones con terceros objetos), mientras que en la clonación profunda se clonan los objetos y también sus objetos relacionados.<br/>

 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/deepxsuper.png" />
 </p>
 

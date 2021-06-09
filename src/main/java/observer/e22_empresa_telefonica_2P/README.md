## Ejercicio 21 - Notificaciones Empresa Telefónica

Se tiene una *compañía telefónica* que tiene varios
*clientes*, a estos clientes les llegan notificaciones
de la empresa (**precios, promociones, premios, noticias**),
pero cada uno de los cliente puede elegir filtrar
algunos tipos de notificaciones o no recibir ninguna.
```
 - IObserver        ----  Cliente
```
```
- ISubject         ----  Empresa telefónica
```
```
- SubjectConcrete  ----  Empresa telefónica (Notificaciones)
```
```
- ObserverConcrete ----  Usuario Registrado
                         [Persona, categoría, Notificaciones Activas(Precios, Promociones, Premios, Noticias, Todos)]
```
### Realizar un ejemplo del funcionamiento de un programa con estas características
 </br>
 <p align="center">
    <img src="https://github.com/AleS900/prueba/blob/master/assets/observernoti.jpg" />
 </p>

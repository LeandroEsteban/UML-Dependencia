# UML-Dependencia
# Nombre: Leandro Matamoros

Diagrama de clases

![Capture](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/e36a6514-310b-49c8-b923-3fd6d30291f2)

Analisis del diagrama:
- Para crear el diagrama de clases primero parti por lo fundamental, la clase persona (que solo esta para ingresar el nombre de la persona) y las clases de los vehiculos (en este caso yo decidi que cada vehiculo fuera una clase distinta), cada clase de los vehiculos tienen su metodo para calcular el tiempo que se tarda en llegar a destino (con la velocidad correspondiente a cada medio). Adicional a esas clases tenemos la clase Viaje que se encargar de obtener el destino, la distancia y ejecutar todo lo necesario. La clase validar se encargar de validar que el nombre de la persona solo contenga letras y ningun numero o simbolo, como tambien verificiar que la distancia sea solamente positiva. Y la clase Main que solo se encargar de llamar el metodo inicarViaje de la clase Viaje para comenzar el programa.

- Al comenzar con el problema tenia pensado en usar solamente 4 clases, la clase persona y las otras 3 clases correspondientes a los vehiculos, pero me di cuenta que era mucho mas limpio si la clase persona solo hiciera lo que le correspondiera y por ese motivo decidi agregar la clase viaje que se encargue de todo, ademas luego tambien pense en la clase validar. Y por ultimo la clase main, que solo se encargue de dar inicio al programa.

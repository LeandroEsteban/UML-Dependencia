# UML-Dependencia
# Nombre: Leandro Matamoros

Diagrama de clases

![Capture](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/e36a6514-310b-49c8-b923-3fd6d30291f2)

Analisis del diagrama:
- Para crear el diagrama de clases primero parti por lo fundamental, la clase persona (que solo esta para ingresar el nombre de la persona) y las clases de los vehiculos (en este caso yo decidi que cada vehiculo fuera una clase distinta), cada clase de los vehiculos tienen su metodo para calcular el tiempo que se tarda en llegar a destino (con la velocidad correspondiente a cada medio). Adicional a esas clases tenemos la clase Viaje que se encargar de obtener el destino, la distancia y ejecutar todo lo necesario. La clase validar se encargar de validar que el nombre de la persona solo contenga letras y ningun numero o simbolo, como tambien verificiar que la distancia sea solamente positiva. Y la clase Main que solo se encargar de llamar el metodo inicarViaje de la clase Viaje para comenzar el programa.

Codigo generado por el diagrama de clases:

![Capture2](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/1e6e47e5-c090-4630-8338-a17f2bf68a80)
![Capture3](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/38ab3bb2-731f-4ab4-8dc8-ea3920d23e90)
![Capture4](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/9bd124d5-4b8c-4c60-9ce8-06a06007ff9a)
![Capture5](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/58808422-4574-4e4a-b30b-4653b3300947)
![Capture6](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/24e377f3-e898-46ca-8346-3b5568f74aec)
![Capture7](https://github.com/LeandroEsteban/UML-Dependencia/assets/127903058/bfa4e17a-687f-49ca-adc3-dd0e1e95a39a)



Cambios observados:
- Al comenzar con el problema tenia pensado en usar solamente 4 clases, la clase persona y las otras 3 clases correspondientes a los vehiculos, pero me di cuenta que era mucho mas limpio si la clase persona solo hiciera lo que le correspondiera y por ese motivo decidi agregar la clase viaje que se encargue de todo, ademas luego tambien pense en la clase validar. Y por ultimo la clase main, que solo se encargue de dar inicio al programa.

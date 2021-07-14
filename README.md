# Taller4


Antecedentes:

Los desastres naturales se clasifican en subgrupos como: geofísicos, meteorológicos, hidrológicos, climatológicos, biológicos y extraterrestres(impactos de meteoritos, etc.). Los tres gráficos obtenidos de la base de datos pública representan la evolución temporal por desastres totales y por subgrupo: de su número (fig.1), del número de personas afectadas (fig.2) y de los impactos económicos (fig.3).

![image](https://user-images.githubusercontent.com/51929766/125623909-55ae8707-1413-4202-819b-306bf7cc2c32.png)


Fig 1. Evolución del número de desastres naturales.

![image](https://user-images.githubusercontent.com/51929766/125623949-38ca8cdd-30c8-4b93-9a44-3472033a0c83.png)


Fig 2. Evolución del número de personas afectadas.

 
![image](https://user-images.githubusercontent.com/51929766/125623966-6bdc4f44-2032-4749-8956-33a2c2a1d866.png)



 Fig 3. Evolución de los impactos económicos.

 

En estos gráficos podemos observar que el número de desastres naturales y su impacto, tanto a nivel de personas afectadas como económico, crecieron significativamente a partir de los años 70 del siglo pasado. 

En los desastres del subgrupo de geofísica los daños alcanzaron su valor máximo en 2011 debido al terremoto de Japón. Hay otros años con un número de personas afectadas significativo en este subgrupo, pero con un impacto menor en los daños. Estos pics son resultado de los sísmos en regiones menos desarrolladas. Destacan los vividos en 1960 en Chile, 1972 en Nicaragua, 1987 en Ecuador, 2003 en Irán, 2010 en Chile y 2015 en Nepal, India, Pakistán y Chile, de nuevo. 

Sin embargo, hay que señalar que los desastres naturales más frecuentes son los incluidos en los subgrupos de desastres hidrológicos y meteorológicos. Estos se equiparan al subgrupo de los climatológicos, que también son normalmente responsables de los mayores daños y el mayor número de personas afectadas. 

Los desastres incluidos en estos tres subgrupos de la base de datos del CRED son provocados por fenómenos meteorológicos y climatológicos extremos: tormentas con alta precipitación y viento que provocan inundaciones, caída de infraestructuras y fuertes marejadas en las zonas costeras. También por temperaturas extremas, debido a olas de calor o frío, y grandes períodos sin precipitación que originan sequías. 

Los países afectados por los desastres naturales requieren realizar análisis dinámico de los datos, esto quiere decir, que pueden aparecer nuevos atributos o datos que no habían sido considerados anteriormente. Ejemplo de ello, es el uso de datos del clima, de las personas afectadas, y de los indicadores económicos del mundo. 

=========================

Actividades a desarrollar

1. Seleccione un subconjunto del dominio problema descrito y detalle con sus propias palabras los elementos que lo conforman y las relaciones que se dan entre estos. (4 ptos)

2. A partir de lo anterior, se pide  diseñar un modelo de clases UML para algún aspecto de los antecedentes presentados, considerando lo siguiente: (8 ptos)

- El modelo debe ser creado con una herramienta especializada de modelado UML, p. ej. Visual Paradigm online.

- El modelo debe incluir al menos el uso de una relación de herencia, una dependencia, asociación, agregación, composición y uso de interfaces.

- Una relación se considera completa y correcta, si se incluyen el sentido/dirección de la relación, los roles y multiplicidades que correspondan.

- Se debe almacenar información de él o los desastres.

- Considerar un mínimo de 5 atributos para cada tipo de desastre.

- Considere que independiente del tipo de desastre, estos ocurren en algún lugar (país, ciudad, latitud, longitud, etc.) y en alguna fecha (año, mes, día, hora, etc.)

- Uno de los datos debe ser una lista dinámica (Ej. arraylist de afectados, arraylist de personas desaparecidas, etc.)

3. Considere que para su modelo de clases de la pregunta 2. se requiere ahora una solución para ambiente web y móvil y que los datos serán gestionados por 2 BBDD distintas, una de Oracle y otra postgreSQL. Modele un diagrama packages que muestre las relaciones entre estos, considerando además que se debe agregar una capa extra de seguridad a la capa de datos implementada a través de un package que se llama utiles.seguridad.datos (5 ptos).

4. Cree un método en código Java llamado detalleDesastre(xxxx) {....} (en la clase que corresponda), que muestre la información de los desastres naturales (de algún tipo) ocurridos en un determinado lugar y en una determinada fecha. (3 ptos)

Cree un método en código Java llamado listaDesaparecidos(xxxx) {...} (en la clase que corresponda), que muestre una lista de personas desaparecidas debido a un desastre natural.  (3 ptos)

5. Cree un método en código Java llamado actualizarListaDesaparecidos(xxxx) {...} (en la clase que corresponda), que permita agregar a la lista anterior un nuevo dato. (2 puntos)

6. Cree una ventana tipo JFrame que muestre los datos del método listaDesaparecidos(...) o del método detalleDesastre(...)

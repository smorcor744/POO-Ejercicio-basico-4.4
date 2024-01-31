import java.util.*

/**Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como el método toString().

Marca y modelo no podrán ser blancos ni nulos y no podrán modificarse.
Número de caballos, número de puertas y matrícula no podrán modificarse, ni podrán ser nulos.
Color podrá modificarse, pero no podrá ser nulo.
Recuerda que Kotlin añade los getters y setters con el comportamiento por defecto, por lo que no es necesario que los implementes, a no ser que tengas que añadir alguna funcionalidad extra.

Modifica el atributo matricula para que no permita actualizar la matrícula con un valor que no tenga 7 caracteres.
Los atributos de modelo la marca siempre se devolverán con la primera letra en mayúscula.
Realiza también una modificación del atributo número de caballos, para que no permita actualizar el atributo numCaballos con un valor interior a 70, ni superior a 700.
Realiza una modificación del atributo número de puertas, para que no permita actualizar el atributo numPuertas con un valor inferior a 3, ni superior a 5.
Ten en cuenta todas estas condiciones a la hora de crear el constructor de la clase.
En el programa principal, instancia varios coches y muéstralos por pantalla. Probar las modificaciones anteriores, modifica el número de caballos para un coche y haz lo mismo para el número de puertas, el color, la marca y modelo. Vuelve a mostrarlos por pantalla.

Intenta instanciar y modificar con la marca y modelo con valores nulos o blancos y comprueba que no es posible.
Intenta instanciar y modificar con el número de caballos con un valor inferior a 70 o superior a 700 y comprueba que no es posible.
Intenta instanciar y modificar con el número de puertas con un valor inferior a 3 o superior a 5 y comprueba que no es posible.
Intenta instanciar y modificar con la matrícula con un valor que no tenga 7 caracteres y comprueba que no es posible.
Intenta instanciar y modificar con el color, el número de caballos, el número de puertas y la matrícula con valores nulos/blancos y comprueba que no es posible.*/
class Coche(color: String, marca: String, modelo: String, numCaballos: Int, numPuertas: Int, matricula: String) {
    var color: String = color
        set(value) {
            require(value.isNotBlank()) {"El color no puede ser nulo o blanco"}
            field = value
        }

    val marca: String = marca.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        .also {
            require(it.isNotBlank()) {"La marca no puede ser nula o blanca"}
        }

    val modelo: String = modelo.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        .also {
            require(it.isNotBlank()) {"El modelo no puede ser nulo o blanco"}
        }

    var numCaballos: Int = numCaballos
        set(value) {
            require(value in 70..700){"El número de caballos debe estar entre 70 y 700"}
            field = value
        }

    var numPuertas: Int = numPuertas
        set(value) {
            require(value in 3..5){"El número de puertas debe estar entre 3 y 5"}
            field = value
        }

    var matricula: String = matricula
        set(value) {
            require(value.length == 7) {"La matrícula tiene que ser de 7 caracteres"}
            field = value
        }

    override fun toString() = "Coche(color=$color, marca=$marca, modelo=$modelo, numCaballos=$numCaballos, numPuertas=$numPuertas, matricula=$matricula)"

}



package me.nicolas.testapp
import kotlin.random.Random
import org.junit.Test

class MainTest {
    @Test
    fun runMain(){
        println("********* VARIABLES *********")
        val name = "Nicolas"
        val height = 1.70
        val age = 17
        val islogin = Random.nextBoolean()
        println(name)

        //Interpolacion de cadenas
        var message = "Soy $name, tengo $age años, mido $height cm ${validaEdad(age)}"
        //if (age <18) message += ", soy adulto" else if(age < 50) message += ", soy adulto" else message += ", soy adulto mayor"

        println(message)

        //Estructura de datos
        val productName = listOf("Teclado", "Monitor", "Mouse") //Solo lectura
        val productPrice = mutableListOf(3000, 5200, 5000)
        println(productName)
        println(productPrice)
        productPrice.add(4000)
        println(productPrice)

        val teclado = mapOf(
            "name" to "Teclado",
            "price" to 3000,
            "categoria" to "electrodomestico"
        )
        println(teclado)

        for (producto in productPrice)
            println(producto)

        val nameNull = null
        val segundoNull : String? = null
        println(nameNull)
        println(segundoNull)

        val myLambda: (String, String)-> String = { name, apellido ->
            "Hola $name $apellido!!!! MGADS"
        }

        println(myLambda("Nicolas", "Gamboa"))
    }

    fun validaEdad(age: Int): String{
        return if (age < 18) {", soy menor de edad"} else if (age < 50) { ", soy adulto"} else { "soy adulto mayor"}
    }

    fun Button(onClick: ()->Unit, content: ()->Unit){
        println("Inicio el boton")
        content()
        println("OnClick")
        onClick()
        println("Termina Boton")
    }
}

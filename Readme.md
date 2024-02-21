# PRACTICANDO CONEXIÓN CON FIREBASE Y CON ROOM

## Conexión con ROOM

para poder usar Room como es evidente tendremso qeu implementar correctaemnte el patrón de diseño **MVVM**

Pero antes debemos implementarlo correctamente.


### GRADLE.KTS

Bien, en los archivos de configuración debemos añadir los iguiente solo en el archivo Gradle del **Module:app**

    id("kotlin-kapt")

Esto se añade en pluguines

```kotlin
plugins {

    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    
    // Necesario para que Funcione ROOM
    id("kotlin-kapt")

    //Necesario para que funcione FIREBASE
    // Add the Google services Gradle plugin
    id("com.google.gms.google-services")
}
```

TAMBIÉN DEBEMOS IMPLEMENTAR LO SIGUIENTE:
```Kotlin

 // DEPENDENCIAS NECESARIAS PARA QUE FUNCIONE ROOM

    //Conexion to ROOM databse
    val room_version = "2.5.1"
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    
    
    //Despues del corchete de cierre }  se creará la siguiente función
    
    /**
    * SE CREA ESTA FUNCIÓN SIN PARÁMETROS PARA QUE FUNCIONA KAPT
    */
fun kapt(options: String) {

}


```

## SUPER IMPORTANTE

Para que esto funcione debemos aumentar la versión de Java a la 17, si n nos romperá la aplicación

```kotlin

compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

```

# Firebase

No me voy a parar a explicar esto, ya que hay un Readme muy detallado a continuación:

[Firebase Readme](https://github.com/marcosfa00/FIREBASE)


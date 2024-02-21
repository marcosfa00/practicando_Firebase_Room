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

## Firebase

No me voy a parar a explicar esto, ya que hay un Readme muy detallado a continuación:

[Firebase Readme](https://github.com/marcosfa00/FIREBASE)


# MVVM 

```text
marcosfa@MacBook-Pro-de-Marcos firebaseyroom % tree
.
├── Firebase
│   └── model
│       ├── Repository.kt     // Repositorio que maneja la lógica de acceso a datos relacionada con Firebase.
│       └── User.kt           // Clase que representa un modelo de usuario específico para Firebase.
├── MainActivity.kt            // Actividad principal de la aplicación Android.
├── Room
│   ├── AppDatabase.kt        // Configuración de la base de datos Room, que podría incluir la creación de la base de datos.
│   ├── Houses.kt             // Clase que representa un modelo de casa específico para Room.
│   └── HousesDAO.kt          // Interfaz o clase de acceso a datos que define operaciones para acceder a las casas en la base de datos Room.
├── View
│   └── UI_START.kt           // Archivo relacionado con la interfaz de usuario, posiblemente el punto de inicio de la interfaz de usuario.
├── ViewModel
│   └── MyViewModel.kt        // Clase ViewModel que contiene la lógica de presentación y gestiona el estado relacionado con la interfaz de usuario.
├── data
│   ├── DataHouse.kt          // Clase de datos que representa un modelo de casa genérico.
│   └── DataUser.kt           // Clase de datos que representa un modelo de usuario genérico.
└── ui
    └── theme
        ├── Color.kt          // Definiciones de colores utilizados en la interfaz de usuario.
        ├── Theme.kt          // Configuraciones de temas de la aplicación.
        └── Type.kt           // Definiciones de tipos o estilos utilizados en la interfaz de usuario.

```


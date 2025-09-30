Guía de Viaje Kotlin
====================

Descripción
-----------
Guía de Viaje Kotlin es una aplicación móvil desarrollada en Kotlin para Android, que permite a los usuarios explorar lugares turísticos, itinerarios, recomendaciones, reservas y perfil personalizado. La app utiliza Fragments, Navigation Drawer y View Binding para una navegación fluida y modular.

Características
---------------
- Pantalla de inicio: Perfil del usuario.
- Fragments:
  - Perfil
  - Recomendaciones
  - Reservas
  - Itinerario
  - Lugares
- Navigation Drawer: Acceso rápido a todas las secciones.
- Pantalla de presentación (Splash Screen).
- Compatibilidad con Android 11+ (API 28+).
- Uso de Material Design con Toolbar, DrawerLayout y NavigationView.

Estructura del Proyecto
----------------------
app/
├─ src/main/java/com/example/guiadeviajekotlin/
│  ├─ MainActivity.kt
│  ├─ SplashActivity.kt
│  └─ fragments/
│     ├─ PerfilFragment.kt
│     ├─ RecomendacionesFragment.kt
│     ├─ ReservasFragment.kt
│     ├─ ItinerarioFragment.kt
│     └─ LugaresFragment.kt
├─ res/
│  ├─ layout/
│  │  ├─ activity_main.xml
│  │  ├─ activity_splash.xml
│  │  ├─ fragment_perfil.xml
│  │  ├─ fragment_recomendaciones.xml
│  │  ├─ fragment_reservas.xml
│  │  ├─ fragment_itinerario.xml
│  │  └─ fragment_lugares.xml
│  ├─ drawable/
│  │  └─ logo.png
│  ├─ values/
│     ├─ colors.xml
│     └─ themes.xml

Instalación
-----------
1. Clonar el repositorio:
   git clone https://github.com/tu_usuario/guiadeviajekotlin.git
2. Abrir en Android Studio.
3. Sincronizar Gradle.
4. Ejecutar en un emulador o dispositivo físico Android.

Dependencias principales
------------------------
- androidx.core:core-ktx
- androidx.appcompat:appcompat
- com.google.android.material:material
- androidx.drawerlayout:drawerlayout
- androidx.constraintlayout:constraintlayout
- androidx.fragment:fragment-ktx
- androidx.lifecycle:lifecycle-runtime-ktx
- androidx.navigation:navigation-fragment-ktx
- androidx.navigation:navigation-ui-ktx

Uso
---
- Abrir la aplicación: aparece la pantalla de presentación (Splash Screen).
- Navegar entre Fragments usando el Navigation Drawer.
- Cada fragment contiene su contenido específico:
  - Perfil: Información del usuario.
  - Recomendaciones: Sugerencias de lugares.
  - Reservas: Información de reservas.
  - Itinerario: Planificación de viaje.
  - Lugares: Lista de sitios turísticos.

Contribuciones
--------------
- Clonar el proyecto y crear un branch para tus cambios.
- Hacer pull request con descripción clara de tus mejoras o correcciones.

Licencia
--------
Este proyecto está bajo la licencia MIT.

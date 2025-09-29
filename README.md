# ⚽ Ligas Fútbol - Android App

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat)
![License](https://img.shields.io/badge/License-MIT-blue.svg)

Una aplicación Android desarrollada en **Kotlin** que permite navegar a través de las ligas de fútbol más importantes del mundo, sus equipos y jugadores mediante múltiples Activities.

## 📱 Características

- ✅ **Navegación por Activities**: Estructura modular con navegación intuitiva
- 🏆 **5 Ligas Principales**: Premier League, La Liga, Bundesliga, Serie A, Ligue 1
- ⚽ **Equipos de la Premier League**: Lista completa de los 20 equipos
- 👥 **Plantilla del Manchester City**: Jugadores actuales con sus posiciones
- 🎨 **Interfaz limpia**: Diseño Material Design con tema personalizado
- 📱 **Fácil navegación**: Navegación hacia atrás configurada automáticamente


## 📋 Requisitos del Sistema

- **Android Studio**: Arctic Fox o superior
- **SDK mínimo**: API 24 (Android 7.0)
- **SDK objetivo**: API 34
- **Lenguaje**: Kotlin
- **Gradle**: 8.0+

## 🛠️ Instalación

### 1️⃣ Clonar el Repositorio
```bash
git clone https://github.com/gael-marquez/Ligas_Futbol.git
cd Ligas_Futbol
```

### 2️⃣ Abrir en Android Studio
1. Abre **Android Studio**
2. Selecciona **"Open an Existing Project"**
3. Navega a la carpeta `Ligas_Futbol` y ábrela
4. Espera a que Gradle sincronice el proyecto

### 3️⃣ Configurar las Dependencias
El proyecto ya incluye todas las dependencias necesarias:
```kotlin
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // ... otras dependencias
}
```

### 4️⃣ Ejecutar la App
1. Conecta un dispositivo Android o inicia un emulador
2. Presiona el botón **"Run"** (▶️) en Android Studio
3. Selecciona tu dispositivo/emulador
4. ¡La app se instalará y ejecutará automáticamente!

## 📁 Estructura del Proyecto

```
app/
├── 📂 manifests/
│   └── AndroidManifest.xml          # Configuración de Activities
├── 📂 kotlin+java/
│   └── com.example.ligas_futbol/
│       ├── MainActivity.kt          # 🏠 Pantalla principal
│       ├── LeaguesActivity.kt       # 🏆 Selección de ligas
│       ├── TeamsActivity.kt         # ⚽ Lista de equipos
│       └── PlayersActivity.kt       # 👥 Lista de jugadores
└── 📂 res/
    ├── 📂 layout/                   # 🎨 Layouts XML
    │   ├── activity_main.xml
    │   ├── activity_leagues.xml
    │   ├── activity_teams.xml
    │   └── activity_players.xml
    ├── 📂 values/
    │   ├── strings.xml              # 📝 Textos de la app
    │   └── themes.xml               # 🎨 Temas y colores
    └── 📂 mipmap/                   # 📱 Iconos de la app
```

## 🎮 Cómo Usar la App

### 🚀 Flujo de Navegación
1. **Pantalla Principal** → Presiona "Ver Ligas de Fútbol"
2. **Seleccionar Liga** → Toca "Premier League (Inglaterra)"
3. **Elegir Equipo** → Selecciona "Manchester City"
4. **Ver Jugadores** → Explora la plantilla completa

### 📱 Capturas de Pantalla
```
[Pantalla Principal] → [Ligas] → [Equipos] → [Jugadores]
     🏠                🏆        ⚽           👥
```

## 🛠️ Tecnologías Utilizadas

| Tecnología | Versión | Propósito |
|------------|---------|-----------|
| ![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white) | 1.9+ | Lenguaje principal |
| ![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white) | API 24+ | Plataforma |
| **AppCompat** | 1.6.1 | Activities tradicionales |
| **Material Design** | - | Componentes UI |

## 🔧 Desarrollo

### 📦 Agregar Nueva Liga
Para agregar una nueva liga, modifica `LeaguesActivity.kt`:

```kotlin
when (position) {
    0 -> { /* Premier League - ya implementada */ }
    1 -> { 
        // Agregar La Liga aquí
        val intent = Intent(this, TeamsActivity::class.java)
        intent.putExtra("league", "La Liga")
        startActivity(intent)
    }
}
```

### ⚽ Agregar Nuevo Equipo
En `TeamsActivity.kt`, agrega la lista de equipos y la lógica de navegación:

```kotlin
when (position) {
    0 -> { /* Manchester City - ya implementado */ }
    1 -> { 
        // Agregar Arsenal aquí
        val intent = Intent(this, PlayersActivity::class.java)
        intent.putExtra("team", "Arsenal")
        startActivity(intent)
    }
}
```

## 🤝 Contribuir

¡Las contribuciones son bienvenidas! 🎉

1. 🍴 **Fork** el proyecto
2. 🌿 Crea una **rama** para tu feature (`git checkout -b feature/nueva-liga`)
3. 💾 **Commit** tus cambios (`git commit -m 'Agregar La Liga'`)
4. 📤 **Push** a la rama (`git push origin feature/nueva-liga`)
5. 🔃 Abre un **Pull Request**

## 📝 Roadmap

### v1.0 (Actual)
- [x] Estructura básica de Activities
- [x] Premier League completa
- [x] Manchester City como ejemplo

### v1.1 (Próximo)
- [ ] Implementar La Liga Española
- [ ] Agregar Real Madrid y Barcelona
- [ ] Mejorar el diseño visual

### v2.0 (Futuro)
- [ ] Base de datos local (Room)
- [ ] Imágenes de jugadores y equipos
- [ ] Estadísticas detalladas
- [ ] Modo favoritos

## 🐛 Problemas Conocidos

- ⚠️ Solo la Premier League está completamente implementada
- ⚠️ Las otras ligas mostrarán una pantalla vacía temporalmente
- ⚠️ Solo Manchester City tiene jugadores implementados

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

## 👨‍💻 Autor

**Gael Márquez** - [@gael-marquez](https://github.com/gael-marquez)

---

⭐ **¡Dale una estrella a este repo si te gustó!** ⭐

📱 **¿Encontraste un bug? ¡Abre un issue!**

🚀 **¿Tienes ideas? ¡Contribuye al proyecto!**

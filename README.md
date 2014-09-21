conversor-android-xtend
=======================

### Prerrequisitos
- [Entorno de desarrollo Android](http://uqbar-wiki.org/index.php?title=Preparacion_de_un_entorno_de_desarrollo_Android)
- [Gradle](http://www.gradle.org/)

### En qué consiste el ejemplo
No es más que el viejo y querido conversor de kilómetros a millas en su versión para Android. Lo interesante es ver la progresión entre las 3 versiones y cómo va bajando el [código boilerplate](http://www.wikiwand.com/en/Boilerplate_code) en la `MainActivity`. Dichas versiones son:

1. [Java puro](https://github.com/dds-utn/conversor-android-xtend/blob/a6855b5b667100dd46757b4f1251f9d0045857be/app/src/main/java/org/unq/conversor/app/ui/MainActivity.java)
2. [Xtend](https://github.com/dds-utn/conversor-android-xtend/blob/6480f41a507ca8500895c3ddc1ec252b5b292514/app/src/main/java/org/unq/conversor/app/ui/MainActivity.xtend)
3. [Xtend + Xtendroid](https://github.com/dds-utn/conversor-android-xtend/blob/0b4f18cecbc93acea4b07e1eaefe620e81eca266/app/src/main/java/org/unq/conversor/app/ui/MainActivity.xtend)
4. (Próximamente) Bindings

### Cómo correr el ejemplo

#### Desde la terminal 

- con un telefono Android conectado, en modo debug:

```
gradle installDebug
adb shell am start -n org.unq.conversor.app/.ui.MainActivity
```

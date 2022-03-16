# ClimaChallenge
Se desea crear una app donde sea posible consultar el clima y guardar algunas notas/memos.
Para comenzar con los requerimientos, vamos a precisar un Login de usuarios con nombre de usuario y password.
La validación de credenciales debe ser simulada, pero debe realizarse de tal manera de poder sustituir fácilmente (ó de forma relativamente
fácil) el dummy service (ó llamado a una API simulada), por la llamada a una API o algún tipo de servicio real en el futuro.
Los usuarios que utilizarían esta app prefieren que el idioma de la misma se corresponda con el idioma que tienen configurado en sus
dispositivos (inglés/español), sino por default en castellano/español.
Por decisiones que escapan a nuestro alcance, se precisa que lo correspondiente/relacionado al Login sea programado en Java.
Y el resto en Kotlin.
Luego de loguearse, la app tendrá una home page y algunas secciones:
1. Clima.
2. Mis Notas.

Detalle de especificaciones
Nombraremos algunos requerimientos.
Quedaría a libre elección lo que no se encuentre especificado anteriormente en la introducción o a continuación.

Login:
Botón de Login
Validar usuario y password, "admin", "12345".
Mostrar un AlertDialog para cuando no se loguea correctamente.
Si se loguea, ir a un Activity (la home page)
Crear un mecanismo de autologin.
Una vez logueado, cada vez que abra la app se hace un auto login, a menos que el usuario elija salir de la sesión, la
opción de salir debe estar en la home page.
Clima:
Crear un servicio que consulte el clima utilizando alguna API libre y/o gratuita.
(tipo OpenWeatherMap por ejemplo)
Para la vista del clima (que depende del servicio creado), deberá mostrarse al menos la temperatura.
Mis notas
Manejar cómo mínimo tres fragmentos (Listado de notas, detalle y agregar nota).
El fragmento de listado será la vista principal, se podrá elegir alguna nota y entrar al detalle.
En el fragmento de listado, habrá un botón para poder agregar una nota, y se deberá navegar hacia el fragmento
correspondiente para agregar la nota.
En el fragmento donde se agrega la nota, alcanzará con poder agregar algún texto como nota y un título el cual se
usará para mostrar en la vista de listado.
El fragmento de detalles, mostrará el contenido total de la nota y se podrá editar o eliminar la misma.
La información debe ser persistente.

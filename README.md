# Pruebas Automáticas taller 7
## Integrantes

 - Juan Sebastián Méndez
 - Juan José Villegas
 - Tatiana Cardenas
 - Dayana Romero

## Desarrollo del taller

Para este taller se solicitaba crear las siguientes pruebas usando Podam.

 - Cree varios test aplicando una estrategia global.
 - Cree varios test aplicando una estrategia nivel de atributo.
 - Cree varios test aplicando una estrategia de excluir atributos.


# Estrategia global

Para esta estrategia se utilizó el mismo **DataProviderStrategy** utilizado durante el desarrollo del taller. En esta se modificó la función *getStringValue* de tal forma que retornara una cadena de caracteres particular.

Luego se creó una clase en el paquete de pruebas en donde se utilizó el repositorio de profesor, creando un profresor usando la función *manufacturePojo* de Podam. Luego se verificó, con asserts, que tanto el nombre de la especialidad como el nombre del profesor fueran exactamente la cadena de caracteres devuelta por nuestro **DataProviderStrategy**.

## Estrategia a nivel de atributo

Para este caso se creó una nueva clase en el paquete de estrategias llamada **EdadEstrategia**. En este se pretende devolver una edad (entero) que esté entre los 10 y los 100 años. Luego se modificó la clase *Estudiante* para que usara esta estrategia de *Podam* en el atributo de edad.

Con esto desarrollado, se creó una clase de pruebas llamada **CursoNegocioTest** con una prueba llamada *agregarEStudianteEdadValida* en donde se crear un curso y un estudiante, y luego se inscribe a ese estudiante en el curso.  Luego se valida que el usuario inscrito tenga una edad entre los 10 y los 100 años.

## Estrategia de excluir atributos

En este caso se reutilizó la clase **CursoNegocioTest** en donde se crearon dos funciones de pruebas *agregarEstudianteCursoExistente* y *agregarEstudianteCursoNoExistente*. El primero crea un curso y un estudiante, al que es inscrito al curso. Luego se valida que efectivamente el curso no está vacío y que el estudiante se encuentra escrito. Por otro lado, la segunda función de prueba repite la operación, pero esta vez el curso no existe, por lo que la función devuelve un mensaje de error *ErrorCursoNoExiste*.
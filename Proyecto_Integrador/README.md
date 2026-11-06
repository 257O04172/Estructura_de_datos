PROYECTO INTEGRADOR: “Sistema de Control de Inventario con Árbol Binario de Búsqueda (ABB)”
🏫 DATOS INSTITUCIONALES
Institución: Instituto Tecnológico Superior de Xalapa (ITSX)
Docente: Víctor Hugo Vásquez Herrera
Asignatura: Estructura de Datos
Grupo: 3° "B" Sabatino
Alumnos / Integrantes:
Lozada Vargas Óscar
Rocha Botello María de los Ángeles
Sánchez Landa María Fátima
Este proyecto consiste en una aplicación de Consola Robusta desarrollada en Java enfocada en Simular el Control Dinámico de Mercancías en un Almacén en Tiempo Real.

Utiliza la estructura de un Árbol Binario de Búsqueda (ABB) No Lineal para Almacenar, Organizar, Buscar y dar de Baja Productos, tomando el nombre de cada artículo como Criterio Principal de Ordenación Alfabética.

📋 Características Principales
Alta Eficiente de Productos: Inserción ordenada dinámicamente resguardando las propiedades del ABB.
Búsqueda Logarítmica: Localización instantánea de registros mediante la técnica de Divide y Vencerás con una complejidad temporal de (\mathcal{O}(\log n)).
Baja de Existencias Completa: Gestión correcta de la estructura ante eliminaciones en sus tres escenarios posibles (nodo hoja, nodo con un hijo y nodo con dos hijos utilizando el sucesor inorden).
Listado Alfabético Automático: Recorrido en orden (InOrder) para desplegar el catálogo completo ordenado alfabéticamente.
Validación de Datos Integrada: Protección activa contra duplicidad de nombres, unidades negativas e importes infinitos.
Opciones de la aplicación
Letra	Operación
A	Alta de un Producto
B	Consulta por Nombre
C	Baja de un Producto
D	Listado InOrder
E	Cerrar Sesión
Se aceptan letras mayúsculas o minúsculas. El stock debe ser un entero no negativo y el precio un número finito no negativo. Se admite punto o coma decimal sin separadores de miles. Un nombre repetido deja intacto el registro anterior. Los datos permanecen en memoria hasta cerrar la sesión.

🛠️ Especificaciones Técnicas y Adaptación de Cadenas
Para lograr que el Árbol Binario de Búsqueda ordene los datos mediante el nombre (String) del producto en lugar de números enteros convencionales, se sustituyeron los operadores de relación (<, >) por el método nativo compareTo() de Java.

nuevoNombre.compareTo(actual.nombre) < 0: El artículo se sitúa en la rama izquierda por ser alfabéticamente menor.
nuevoNombre.compareTo(actual.nombre) > 0: El artículo se sitúa en la rama derecha por ser alfabéticamente mayor.
== 0: Denota una coincidencia exacta, bloqueando la inserción de claves duplicadas para mantener la unicidad.
Algoritmo de Eliminación (3 Casos Clave)
Caso 1 (Nodo Hoja): Si el nodo no tiene ramas dependientes, se desconecta de su padre retornando null.
Caso 2 (Un Hijo): Si el nodo posee un único subárbol activo, se realiza un bypass enlazando directamente al hijo con el padre del nodo removido.
Caso 3 (Dos Hijos): Se localiza el sucesor inorden (el menor absoluto de la rama derecha) mediante un desplazamiento iterativo a la izquierda, se intercambian los atributos del producto y se elimina de forma recursiva el remanente en el subárbol derecho.
Diagrama del Árbol de Almacenamiento
                     [ Lámpara ]  <--- Raíz (Criterio inicial)
                      /       \
                     /         \  (Posterior en alfabeto)
       (Antes en    /           \
        alfabeto)  /             \
         [ Escritorio ]       [ Silla ]
                \
                 \ (Posterior a Escritorio)
              [ Monitor ]
Las altas se hicieron en este orden:

ARTÍCULO | UNIDADES | PRECIO -------------------------+----------+----------- Escritorio | 5 | 1500.00 Lámpara | 10 | 250.00 Monitor | 20 | 500.00 Silla | 12 | 150.00

🚀 Instrucciones de Ejecución
Prerrequisitos
Contar con el Java Development Kit (JDK) versión 11 o superior instalado.
Una terminal o consola de comandos del sistema operativo.
Pasos para Ejecutar
Clona el repositorio en tu máquina local:
Navega hasta el directorio que contiene los archivos fuentes (.java) carpeta src:
Compila todos los módulos del software:
Main.java	
ArbolBinarioBusqueda.java	
Nodo.java	
Producto.java	
Ejecuta el sistema:
java Main
Orden y eliminación
La comparación compareTo() determina la rama: resultado menor que cero, izquierda; mayor que cero, derecha; cero, mismo nombre. Se recortan los espacios externos. Las mayúsculas, minúsculas y los acentos intervienen en la comparación.

Una hoja se desconecta; un nodo con un hijo se sustituye por ese hijo. Para dos hijos se obtiene el mínimo de la rama derecha, se traslada el producto completo y se retira la aparición anterior del sucesor. Nombre, stock y precio permanecen unidos.

La búsqueda, el alta y la baja requieren O(h), donde h es la altura del árbol. Con altura equilibrada se obtiene O(log n), pero las inserciones ordenadas pueden llevar a O(n). El árbol no se balancea automáticamente. InOrder visita todos los nodos.

RESULTADOS DE LA PRÁCTICA
ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > A Nombre del Producto: Lámpara Unidades Disponibles: 10 Precio Unitario: 250.00 Alta Guardada.

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > A Nombre del Producto: Escritorio Unidades Disponibles: 5 Precio Unitario: 1500.00 Alta Guardada.

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > A Nombre del Producto: Silla Unidades Disponibles: 12 Precio Unitario: 150.00 Alta Guardada.

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > A Nombre del Producto: Monitor Unidades Disponibles: 20 Precio Unitario: 500.00 Alta Guardada.

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > B Producto a Consultar: Lámpara

ARTÍCULO | UNIDADES | PRECIO -------------------------+----------+----------- Lámpara | 10 | 250.00

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > D

ARTÍCULO | UNIDADES | PRECIO -------------------------+----------+----------- Escritorio | 5 | 1500.00 Lámpara | 10 | 250.00 Monitor | 20 | 500.00 Silla | 12 | 150.00

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > C Producto que se Retira: Silla Baja Realizada: Silla.

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > D

ARTÍCULO | UNIDADES | PRECIO -------------------------+----------+----------- Escritorio | 5 | 1500.00 Lámpara | 10 | 250.00 Monitor | 20 | 500.00

ALMACÉN | CONTROL DE EXISTENCIAS Organización por Árbol Binario de Búsqueda ABB
A Alta de Producto B Consulta por Nombre C Baja de Producto D Listado Ordenado E Cerrar Sesión Seleccionar > E Sesión Finalizada.

Process finished with exit code 0

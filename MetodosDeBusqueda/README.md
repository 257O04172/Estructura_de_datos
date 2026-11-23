# 🔍 Unidad 6: Métodos de Búsqueda en Java (Búsqueda Secuencial y Binaria)


Repositorio oficial de las prácticas correspondientes a la **Unidad 6: Métodos de Búsqueda** de la asignatura **Estructura de Datos (AED-1026)**, desarrolladas e implementadas en lenguaje **Java**.

---

## 👨‍🏫 Datos Institucionales y de Cátedra

* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
* **Carrera:** Ingeniería en Sistemas Computacionales (ISC) — 3° Semestre, Grupo "B"
* **Asignatura:** AED-1026 Estructura de Datos
* **Catedrático / Docente:** **Ing. Víctor Hugo Vásquez Herrera** (`victor.vasquez@itsx.edu.mx`)
* **Ubicación:** Xalapa-Enríquez, Veracruz, México.

---

## 👥 Auditoría y Equipo de Desarrollo (Alumnos)

Prácticas desarrolladas, documentadas y auditadas bajo la cátedra del **Ing. Víctor Hugo Vásquez Herrera** por el equipo de trabajo:

| Nombre Completo del Alumno | Rol / Auditoría en el Proyecto |
| :--- | :--- |
| **Óscar Lozada Vargas** | Implementación de algoritmos, pruebas de escritorio y validación de casos límite. |
| **María de los Angeles Rocha Botello** | Documentación técnica, análisis de complejidad Big-O y gestión del repositorio GitHub. |
| **María Fátima Sánchez Landa** | Revisión de código (Code Review), control de calidad y cuadro comparativo. |

---

## 📂 Estructura del Proyecto

Dentro de esta carpeta (`MÉTODOS DE BÚSQUEDA`) se incluyen los siguientes archivos fuente:

1. **`PracticaBusquedaSecuencial.java`**: Implementación del algoritmo de búsqueda lineal sobre un arreglo desordenado de calificaciones (`{78, 92, 65, 88, 95, 70}`).
2. **`PracticaBusquedaBinaria.java`**: Implementación del algoritmo de búsqueda binaria iterativa sobre un arreglo ordenado de folios (`{102, 115, 128, 140, 156, 173, 190, 205}`).
3. **`README.md`**: Documentación del proyecto e instrucciones de compilación y ejecución.

---

## ⚙️ Requisitos del Entorno

* **Java Development Kit (JDK):** Versión 8 o superior (JDK 17 recomendado).
* **IDE sugerido (opcional):** IntelliJ IDEA, Apache NetBeans, Eclipse o Visual Studio Code.
* **Terminal / Consola:** Git Bash, CMD, PowerShell o Terminal de Linux/macOS.

---

## 🚀 Instrucciones Paso a Paso para Compilar y Ejecutar

### 1. Clonar el repositorio
Abre tu terminal y ejecuta el siguiente comando para descargar el proyecto:
```bash
git clone https://github.com
cd "ESTRUCTURA-DE-DATOS/MÉTODOS DE BÚSQUEDA"
```

### 2. Compilar y ejecutar la Práctica 1 (Búsqueda Secuencial)
```bash
javac PracticaBusquedaSecuencial.java
java PracticaBusquedaSecuencial
```
**Salida esperada en consola:**
```text
Posicion de 88: 3
Posicion de 100: -1
```

### 3. Compilar y ejecutar la Práctica 2 (Búsqueda Binaria)
```bash
javac PracticaBusquedaBinaria.java
java PracticaBusquedaBinaria
```
**Salida esperada en consola:**
```text
Indice de 173: 5
Indice de 130: -1
```

---

## 📊 Resumen de Complejidad Algorítmica

| Algoritmo | Requiere Ordenamiento | Mejor Caso | Caso Promedio | Peor Caso | Retorno si no existe |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **Búsqueda Secuencial** | ❌ No | $O(1)$ | $O(n)$ | $O(n)$ | `-1` |
| **Búsqueda Binaria** | ✅ Sí | $O(1)$ | $O(\log_2 n)$ | $O(\log_2 n)$ | `-1` |

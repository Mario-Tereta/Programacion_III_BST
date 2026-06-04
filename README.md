# Árbol Binario de Búsqueda (BST)

## Información del estudiante

**Nombre:** Mario David Tereta Sapalun
**Carné:** 0905-15-14297
**Curso:** Programación III
**Tema:** Estructuras de Datos No Lineales – Árbol Binario de Búsqueda (BST)

---

# Descripción

Este proyecto consiste en la implementación manual de un Árbol Binario de Búsqueda (BST) en Java, sin utilizar librerías de `java.util` ni estructuras de datos externas.

Se implementaron las operaciones básicas del BST y los ejercicios solicitados en la tarea, utilizando recursividad y respetando las propiedades de un árbol binario de búsqueda.

---

# Cómo compilar y ejecutar

## Compilar el proyecto

```bash
mvn compile
```

## Ejecutar el programa principal

```bash
java -cp target/classes umg.edu.progra.arboles.Principal
```

## Ejecutar el Extra E4 utilizando argumentos desde consola

Ejemplo:

```bash
java -cp target/classes umg.edu.progra.arboles.Principal 50 30 70 20 40
```

---

# Problemas Obligatorios

## Problema 1 - contarNodos()

### Descripción

Cuenta la cantidad total de nodos del árbol utilizando recursividad sin utilizar el atributo `tamanio`.

### Ejemplo

Salida:

```text
Tamanio: 8
Contar nodos recursivo: 8
```

Después de eliminar nodos:

```text
Contar nodos despues de eliminar: 5
Tamanio despues de eliminar: 5
```

---

## Problema 2 - esBalanceado()

### Descripción

Determina si un árbol está balanceado verificando que la diferencia de alturas entre los subárboles izquierdo y derecho de cada nodo sea menor o igual a 1.

### Ejemplo

Árbol balanceado:

```text
Balanceado: true
```

Árbol desbalanceado:

```text
Arbol desbalanceado: false
```

---

## Problema 3 - esBSTValido()

### Descripción

Verifica que el árbol cumpla correctamente la propiedad de BST:

* Todos los nodos del subárbol izquierdo son menores que la raíz.
* Todos los nodos del subárbol derecho son mayores que la raíz.

### Ejemplo

BST válido:

```text
BST valido: true
```

BST modificado incorrectamente:

```text
BST roto valido: false
```

---

## Problema 4 - ancestroComunMasBajo()

### Descripción

Encuentra el Ancestro Común Más Bajo (Lowest Common Ancestor - LCA) entre dos nodos existentes del árbol.

### Ejemplos

```text
LCA(10,40): 30
LCA(10,80): 50
LCA(60,80): 70
```

---

## Problema 5 - invertir()

### Descripción

Invierte el árbol intercambiando todos los hijos izquierdos y derechos, generando una versión espejo del árbol.

### Ejemplo

Antes:

```text
InOrden: 10 20 30 40 50 60 70 80
```

Después:

```text
InOrden: 80 70 60 50 40 30 20 10
```

---

# Ejercicios Extra

## E1 - kEsimoMenor(int k)

### Descripción

Obtiene el k-ésimo valor más pequeño del árbol utilizando un recorrido InOrden.

### Ejemplo

```text
1er menor: 10
3er menor: 30
5to menor: 50
8vo menor: 80
```

---

## E2 - imprimirRangoOrdenado(int min, int max)

### Descripción

Imprime en orden todos los valores que se encuentran dentro de un rango determinado.

### Ejemplo

```text
Rango [25,65]: 30 40 50 60
Rango [10,40]: 10 20 30 40
Rango [70,100]: 70 80
```

---

## E3 - diametro()

### Descripción

Calcula el diámetro del árbol, definido como el camino más largo entre dos nodos cualesquiera.

### Ejemplo

```text
Diametro: 5
```

---

## E4 - Construcción del BST desde args[]

### Descripción

Permite construir dinámicamente un árbol BST utilizando los valores enviados como argumentos desde la consola.

### Ejemplo

Comando:

```bash
java -cp target/classes umg.edu.progra.arboles.Principal 50 30 70 20 40
```

Salida:

```text
Arbol construido desde args:

     -> 70
-> 50
          -> 40
     -> 30
          -> 20

InOrden: 20 30 40 50 70
```

---

# Commits realizados

Ejemplos de commits descriptivos utilizados:

```text
feat: problema 1 contarNodos recursivo
feat: problema 2 esBalanceado
feat: problema 3 esBSTValido
feat: problema 4 ancestroComunMasBajo
feat: problema 5 invertir arbol
feat: extra e1 kEsimoMenor
feat: extra e2 imprimirRangoOrdenado
feat: extra e3 diametro
feat: extra e4 construir bst desde args
```

---

# Conclusiones

Mediante esta práctica se reforzaron los conceptos de árboles binarios de búsqueda, recursividad, recorridos de árboles y algoritmos clásicos sobre estructuras de datos no lineales. Además, se implementaron operaciones avanzadas como validación de BST, cálculo de diámetro, búsqueda del ancestro común más bajo e inversión del árbol.

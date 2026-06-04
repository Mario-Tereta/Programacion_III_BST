package umg.edu.progra.arboles;

/**
 * Clase principal que demuestra el uso del Arbol Binario de Busqueda (BST)
 * implementado manualmente, sin usar librerias como java.util.
 *
 * Ejecucion sugerida:
 *   1. mvn compile
 *   2. mvn exec:java -Dexec.mainClass="umg.edu.progra.arboles.Principal"
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {
    	
    	//Extra E4: Construir un BST a partir de un arreglo int[] recibido por la consola (args).
    	
    	if (args.length > 0) {
    	   
    	    ArbolBinarioBusqueda arbolArgs =
    	            new ArbolBinarioBusqueda();

    	    for (String arg : args) {

    	        int valor = Integer.parseInt(arg);

    	        arbolArgs.insertar(valor);
    	    }

    	    System.out.println("Arbol construido desde args:");

    	    arbolArgs.imprimirArbol();

    	    System.out.print("InOrden: ");
    	    arbolArgs.inOrden();

    	    return;
    	}

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        /*
         * Insertamos estos valores para formar el siguiente BST:
         *
         *               50
         *              /  \
         *            30    70
         *           /  \   / \
         *          20  40 60  80
         *         /
         *        10
         */
        int[] valores = { 50, 30, 70, 20, 40, 60, 80, 10 };
        for (int v : valores) {
            arbol.insertar(v);
        }

        System.out.println("===== Arbol Binario de Busqueda =====");
        System.out.println("Tamanio: " + arbol.tamanio());
        System.out.println("Altura:  " + arbol.altura());
        System.out.println("Minimo:  " + arbol.minimo());
        System.out.println("Maximo:  " + arbol.maximo());
        System.out.println("Hojas:   " + arbol.contarHojas());
        System.out.println("Contar nodos recursivo: " + arbol.contarNodos()); // Ejercicio 1
        System.out.println("Balanceado: " + arbol.esBalanceado()); // Ejercicio 2
        System.out.println("BST valido: " + arbol.esBSTValido()); // Ejercicio 3

        System.out.println("\n--- Representacion visual (rotada 90 grados) ---");
        arbol.imprimirArbol();

        System.out.println("\n--- Recorridos ---");
        System.out.print("InOrden    (ascendente): ");
        arbol.inOrden();

        System.out.print("PreOrden   (raiz primero): ");
        arbol.preOrden();

        System.out.print("PostOrden  (raiz al final): ");
        arbol.postOrden();

        System.out.print("Por niveles (BFS):         ");
        arbol.recorridoPorNiveles();

        System.out.println("\n--- Busquedas ---");
        System.out.println("Contiene 40? " + arbol.contiene(40));
        System.out.println("Contiene 99? " + arbol.contiene(99));

        System.out.println("\n--- Eliminacion ---");
        System.out.println("Eliminando 20 (nodo con 1 hijo)...");
        arbol.eliminar(20);
        System.out.print("InOrden tras eliminar 20: ");
        arbol.inOrden();

        System.out.println("Eliminando 30 (nodo con 2 hijos)...");
        arbol.eliminar(30);
        System.out.print("InOrden tras eliminar 30: ");
        arbol.inOrden();

        System.out.println("Eliminando 50 (raiz)...");
        arbol.eliminar(50);
        System.out.print("InOrden tras eliminar la raiz: ");
        arbol.inOrden();
        
        System.out.println("Contar nodos despues de eliminar: " + arbol.contarNodos());
        System.out.println("Tamanio despues de eliminar: " + arbol.tamanio());

        System.out.println("\n--- Estado final ---");
        arbol.imprimirArbol();
        System.out.println("Tamanio final: " + arbol.tamanio());
        System.out.println("Altura final:  " + arbol.altura());
        
        //ejercicio 2: arbol desbalanceado
        ArbolBinarioBusqueda desbalanceado = new ArbolBinarioBusqueda();

        desbalanceado.insertar(1);
        desbalanceado.insertar(2);
        desbalanceado.insertar(3);
        desbalanceado.insertar(4);
        desbalanceado.insertar(5);

        System.out.println("Arbol desbalanceado: " + desbalanceado.esBalanceado());

        desbalanceado.imprimirArbol();
        
        //ejercicio 3: arbol no es BST
        ArbolBinarioBusqueda roto =
                new ArbolBinarioBusqueda();

        roto.insertar(50);
        roto.insertar(30);
        roto.insertar(70);

        /*
         * Rompemos la propiedad BST:
         *
         *      50
         *     /
         *   30
         *     \
         *     100
         *
         * 100 está en el subárbol izquierdo de 50,
         * lo cual es incorrecto.
         */
        roto.getRaiz().izquierdo.derecho =
                new Nodo(100);

        System.out.println(
                "BST roto valido: "
                + roto.esBSTValido());

        roto.imprimirArbol();

        //ejercicio 4: LCA
        
        ArbolBinarioBusqueda arbolLCA = new ArbolBinarioBusqueda();

        int[] datosLCA = { 50, 30, 70, 20, 40, 60, 80, 10};

        for (int valor : datosLCA) {
            arbolLCA.insertar(valor);
        }

        System.out.println( "LCA(10,40): " + arbolLCA.ancestroComunMasBajo(10, 40));

        System.out.println( "LCA(10,80): " + arbolLCA.ancestroComunMasBajo(10, 80));

        System.out.println( "LCA(60,80): " + arbolLCA.ancestroComunMasBajo(60, 80));
        
        
        ArbolBinarioBusqueda espejo =                new ArbolBinarioBusqueda();

        int[] datosEspejo = {50, 30, 70, 20, 40, 60, 80, 10};

        for (int valor : datosEspejo) {
            espejo.insertar(valor);
        }

        System.out.println("ANTES DE INVERTIR");
        espejo.imprimirArbol();

        System.out.print("InOrden: ");
        espejo.inOrden();

        espejo.invertir();

        System.out.println("\nDESPUES DE INVERTIR");
        espejo.imprimirArbol();

        System.out.print("InOrden: ");
        espejo.inOrden();
        
        //Extra E1: Encontrar el k-esimo elemento mas pequeño (k-th smallest)
        
        ArbolBinarioBusqueda extra =
                new ArbolBinarioBusqueda();

        int[] datosExtra = {
                50, 30, 70,
                20, 40, 60, 80,
                10
        };

        for (int valor : datosExtra) {
            extra.insertar(valor);
        }

        System.out.println(
                "1er menor: " +
                extra.kEsimoMenor(1));

        System.out.println(
                "3er menor: " +
                extra.kEsimoMenor(3));

        System.out.println(
                "5to menor: " +
                extra.kEsimoMenor(5));

        System.out.println(
                "8vo menor: " +
                extra.kEsimoMenor(8));
        
        // Extra E2: Encontrar el k-esimo elemento mas grande (k-th largest)
        
        ArbolBinarioBusqueda rango =
                new ArbolBinarioBusqueda();

        int[] datosRango = {
                50, 30, 70,
                20, 40, 60, 80,
                10
        };

        for (int valor : datosRango) {
            rango.insertar(valor);
        }

        System.out.print("Rango [25,65]: ");
        rango.imprimirRangoOrdenado(25, 65);

        System.out.print("Rango [10,40]: ");
        rango.imprimirRangoOrdenado(10, 40);

        System.out.print("Rango [70,100]: ");
        rango.imprimirRangoOrdenado(70, 100);
        
       //Extra E3: Verificar si dos arboles son iguales (misma estructura y mismos valores)
        
        ArbolBinarioBusqueda diametro =
                new ArbolBinarioBusqueda();

        int[] datosDiametro = {
                50, 30, 70,
                20, 40, 60, 80,
                10
        };

        for (int valor : datosDiametro) {
            diametro.insertar(valor);
        }

        diametro.imprimirArbol();

        System.out.println(
                "Diametro: "
                + diametro.diametro());
        
        /*
         * Ejercicios
         *
         *  1. Implementar un metodo que devuelva la cantidad TOTAL de nodos
         *     usando recursividad (sin usar el campo 'tamanio').
         *  2. Implementar un metodo 'esBalanceado()' que indique si el arbol
         *     esta balanceado (diferencia de alturas <= 1 en cada nodo).
         *  3. Implementar 'esBSTValido()' que verifique que el arbol cumple
         *     la propiedad de BST recorriendo los nodos.
         *  4. Implementar un metodo para encontrar el ancestro comun mas
         *     bajo (LCA) entre dos valores.
         *  5. Implementar la inversion del arbol (espejo).
         */
    }
}

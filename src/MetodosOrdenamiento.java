import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: el return devuelve un arreglo vacio
    //Solución: modificar el return para devolver la vriable
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: en la condicion "if" estaba el signo alreves
    // Solucion es poner el signo al sentido contrario a este en la condicion

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: error en el primer "for"  se puede encontar que "n" estaba -1; y se pudo observar que el segundo "for" que contiene entero igual a j estaba en cero; y en la condicion de if  arrejlo en j estaba mayor que j+1 y en el intercambio de elementos se pudo observar que solo estaban jotas
    //Solucion eliminar en el primer for eliminar el -1 y en el segundo for igualarle a i+1 y en la condicion el el intercambio igualarle el auxiliar a al arreglo i , y el arreglo i igualarle al arreglo j
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j ] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: es que  el return no esta y no llama nada, y ademas falta la condicion if si i es diferrente de indiceMinimo.
    //Solucion es que agreguemos el return arreglo y agregar la condicion if si i es diferente de indiceMinimo.
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if ( i!= indiceMinimo){
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: que el primer "for" arreglo.legth esta +1 , y j esta -- en el segundo "for"y ademas falta la condicion if si i es diferrente de indiceMinimo
    //Solucion es agrrgara en el primer for arreglo .legth el menos 1 y en j del segundo for agregar enves de j-- agregar j++; tambien agregar la condicion if si i es diferente de indiceMinimo.
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length-1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if ( i!= indiceMinimo){
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:falta la condicion if si i es diferrente de indiceMinimo y en el intercambio esta indiceminimo repetido vaerias veces esto produce un error ya que el en el intercambio no eta funcionando.
    //Solucion agregar la condicion if si i es diferente de indiceMinimo y arreglar el intercambio y eliminar el indice minimo donde va 
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if ( i!= indiceMinimo){
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: en el while i esta mayor a cero y el arreglo i es< que key por lo qu eordeanaba descendentemente. 
    //Solucion es agregar el mayorigual a cero y poner el signo contrario en key.
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: el segundo for estaba en orden de arreglo en j 
    //Solucion es cambiar y ponerle en modo de i al segundo de foro por que estaba en base a j y por eso dabe el error
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: en el int i = j esta el error ya que falta el -1 y en el while tambien esta el error estaba mayor a cero y en el key estaba el signo contrario y no esta return arreglo 
    //Solucion agregar el int i = j-1, y en el while poner mayorigual a cero y mayor a key y en el retunr agregar el arreglo 
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}

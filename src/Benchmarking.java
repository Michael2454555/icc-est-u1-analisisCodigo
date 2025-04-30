import java.util.Random;


public class Benchmarking {
    private MetodosOrdenamiento mOrdenamiento;
    public Benchmarking(){
        long currentMillis=System.currentTimeMillis();
        long currentNano = System.nanoTime();

        // System.out.println(currentMillis);
        // System.out.println(currentNano);

        // mOrdenamiento = new MetodosOrdenamiento();
        // int [] arreglo =generarArregloAleatorio(1000000);

        // Runnable tarea = () -> mOrdenamiento.burbujaTradicional(arreglo);

        // double tiempoDuracionMillis = medirConCurrentTimeMiles(tarea);
        // double tiempoDuracionNano = medirConNanoTime(tarea);

        // System.out.println( "tiempo en milisegundos: "+tiempoDuracionMillis);
        // System.out.println( "tiempo en nanosegundis: "+tiempoDuracionNano);
    }
    
    


    private int[] generarArregloAleatorio(int tamano){
        int [] array = new int[tamano];
        Random random = new Random();
        for(int i = 0; i <tamano; i++){

            array [i] = random.nextInt(100000);
            

        }
        return array;
    }
    public double medirConCurrentTimeMiles(Runnable tarea){
       long inicio = System.currentTimeMillis();
       tarea.run();
       long end = System.currentTimeMillis();
       double tiempoSegundos=(end -inicio)/1000.0;
       
        return tiempoSegundos;
    }
    public double medirConNanoTime(Runnable tarea){
        long inicio = System.nanoTime();
       tarea.run();
       long end = System.nanoTime();
       double tiempoSegundos1=(end -inicio)/1000000000.0;
       
        return tiempoSegundos1;
    }
    
}

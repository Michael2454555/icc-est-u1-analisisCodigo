from metodos_ordenamiento import MetodosOrdenamiento
import random
import time
class Benchmarking:

    def __init__(self):
        print("Bemchmarkin instanciado")
    def medir_tiempo(self, funcion, arreglo):
             inicio = time.perf_counter()
             funcion(arreglo)
             fin = time.perf_counter()
             return fin - inicio
        
        
        
            
        # def benchmarkin_2(self, array):
            
        
        #     self.mO=MetodosOrdenamiento()

        #     arreglo = self.build_arreglo(10000)
        #     tarea = lambda: self.mO.sort_Bubble(arreglo)
        #     tiempo_milisegundos= self.contar_con_current_time_milles(tarea)
        #     tiempo_nanosegundos=self.contar_con_nano_time(tarea)


        #     print(f"Tiempo con tiempo milisegundos : {tiempo_milisegundos}")
        #     print(f"Tiempo con tiempo nanossegundos : {tiempo_nanosegundos}")



        #     tarea = lambda: self.mO.sort_burbuja_mejorado_optimizado(arreglo)
        #     tiempo_nanosegundos=self.contar_con_nano_time(tarea)
        #     print(f"Tiempo con BB mejorado en nanossegundos : {tiempo_nanosegundos}")


        #     tarea = lambda: self.mO.sort_seleccion(arreglo)
        #     tiempo_nanosegundos=self.contar_con_nano_time(tarea)
        #     print(f"Tiempo con Seleccion  en nanossegundos : {tiempo_nanosegundos}")


        #     tarea = lambda: self.mO.sort_shell(arreglo)
        #     tiempo_nanosegundos=self.contar_con_nano_time(tarea)
        #     print(f"Tiempo con shell en nanossegundos : {tiempo_nanosegundos}")



    
    def build_arreglo(self, tamano):
        arreglo=[]
        for i  in range(tamano):
            numero = random.randint(0,99999)
            arreglo.append(numero)
        return arreglo

    def contar_con_current_time_milles(self, tarea):
        inicio = time.time()
        tarea()
        end = time.time()
        tiempo_segundos= end - inicio
        return tiempo_segundos
    
    def contar_con_nano_time(self, tarea):
        inicio = time.time_ns()
        tarea()
        end = time.time_ns()
        tiempo_segundos= (end - inicio) / 1_000_000_000.0
        return tiempo_segundos
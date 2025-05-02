#Archivo principal o main
import benchmarking as bm
from metodos_ordenamiento import MetodosOrdenamiento

#import metodosordenamiento as mo
if __name__=="__main__":
    print("Funciona")
    bench = bm.Benchmarking()
    metodosO = MetodosOrdenamiento()
    
    
    # tam = 10000
    tamanios = [5000, 10000, 20000]
    
    resultados =[]
    
    for tam in tamanios:
        arreglo_base = bench.build_arreglo(tam)
        metodos_dic = {
            "burbuja" : metodosO.sort_Bubble,
            "burbuja_mejorado" : metodosO.sort_burbuja_mejorado_optimizado,
            "seleccion" : metodosO.sort_seleccion,
            "shell" : metodosO.sort_shell,
            
        }
        
        
        
        
        for nombre, fun_metodo in metodos_dic.items():
            tiempo_resultado = bench.medir_tiempo(fun_metodo,arreglo_base)
            tupla_resultado=(tam, nombre,tiempo_resultado)
            
            resultados.append(tupla_resultado)
            
        for tam, nombre, tiempo in resultados:
            print(f"\n tamaño: {tam}, nombre {nombre}, tiempo {tiempo:.6f} segundos ")
            
        
        
    
        
        
       
        
    
    # bm.Benchmarking()
    
    # mo.MetodosOrdenamiento() kjjjhh
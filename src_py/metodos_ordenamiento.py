class Metodos_Ordenamiento:
    def sort_Bubble(self, array):
        arreglo = array.copy()
        n=len(arreglo)
        for i in range(n):
           for j in range(i+1,n):
               if arreglo[i] > arreglo[j]:
                    aux = arreglo[i]  
                    arreglo[i] = arreglo[j]
                    arreglo[j] = aux
        return arreglo
    def sort_burbuja_mejorado_optimizado(self, array):
        arreglo= array.copy()
        n = len(arreglo)
        for i in range(n):
           for j in range(i+1,n-1-i):
               if arreglo[i] > arreglo[j+1]:
                    aux = arreglo[i]  
                    arreglo[i] = arreglo[j+1]
                    arreglo[j+1] = aux
        return arreglo


    def sort_seleccion(self, array):
        arreglo=array.copy()
        n = len(arreglo)
        for i in range (n):
           iM=i
           for j in range (i+1,n):
               if arreglo [j] < arreglo [iM] :
                   iM = j
        return arreglo

    def sort_shell(self, array):
        arreglo = array.copy()
        n = len(arreglo)
        gap = n // 2

        while gap > 0:
            for i in range(gap, n):
                temp = arreglo[i]
                j = i
                while j >= gap and arreglo[j - gap] > temp:
                    arreglo[j] = arreglo[j - gap]
                    j -= gap
                arreglo[j] = temp
            gap //= 2

        return arreglo



        
           

        
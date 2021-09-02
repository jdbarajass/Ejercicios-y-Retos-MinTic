#NO ELIMINAR LA SIGUIENTE IMPORTACIÓN, sirve para probar tu código en consola
from pruebas import pruebas_codigo_estudiante

#NOTA: PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
#LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO

#En este espacio podrás programar las funciones que deseas usar en la función solución (NO ES OBLIGATORIO CREAR OTRAS FUNCIONES)
"""Inicio espacio para programar funciones propias"""



#PUEDES PROGRAMAR CUANTAS FUNCIONES DESEES 

def AND(b1, b2):
    if b1 == '1' and b2 == '1':
        return '1'
    return '0'

def OR(b1, b2):
    if b1 == '0' and b2 == '0':
        return '0'
    return '1'
    
def XOR(b1,b2):
    if (b1 == "0" and b2 == "1") or (b1 == "1" and b2 == "0"):
        return '1'
    return '0'


"""Fin espacio para programar funciones propias"""

def calculadora(bits1, bits2, OP):
    resultado = ''
    for b1,b2 in zip (bits1, bits2):
        if OP == "AND":
            resultado += AND(b1, b2)
        elif OP == 'OR':
            resultado += OR(b1,b2)
            
        else:
            resultado += XOR(b1,b2)
    
    #PROGRAMA ACÁ LA SOLUCIÓN
    
    return resultado

"""
Esta línea de código que sigue, permite probar si su ejercicio es correcto
"""
#NO ELIMINAR LA SIGUIENTE LÍNEA DE CÓDIGO
pruebas_codigo_estudiante(calculadora)
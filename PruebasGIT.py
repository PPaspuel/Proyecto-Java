
# Este archivo es para hacer pruebas de comandos en la consola de GIT

def suma (a,b):
    if(a > 0 and b > 0):
        t = a + b
        return t
    else:
        print("Los numeros ingresados son menores que 0")
def multi (e,c):
    if(e>0 and c>0):
        w= e*c
        return w
    else:
        print("Uno de los dos numeros es cero")

prueba1 = suma(25,12)
prueba2 = multi(10,12)
print("Los resultados son:")
print("El resultado es :"+ str(prueba1))
print("El resultado es :"+ str(prueba2))

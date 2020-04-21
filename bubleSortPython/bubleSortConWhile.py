#con while 
def bubleSortMejorado(lista):
	#variables
	aux=0
	cambio=True
	i=len(lista)-1
	
	while i > 0:
		cambio=False
		for j in range(i):
			if lista[j+1] < lista[j]:
				aux=lista[j]
				lista[j]=lista[j+1]
				lista[j+1]=aux
				cambio=True
		i-=1#para que llegue a 0 y "cambio" ya no sea True sino False

lista=[9,2,3,1,5,4,6,8,7]
buble=bubleSortMejorado(lista)
print(lista)	
	



		



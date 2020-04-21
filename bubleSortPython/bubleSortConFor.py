#con dos for
#Fernan2_BC
def bubleSort(lista):
	aux=0
	for i in range(len(lista)):
		for j in range(i):
			if lista[j] >lista[j+1]:
				aux=lista[j]
				lista[j]=lista[j+1]
				lista[j+1]=aux

#=============================================
lista=[9,2,3,1,5,4,6,8,7]
buble=bubleSort(lista)


print(lista)	


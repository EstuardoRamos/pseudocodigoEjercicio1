Algoritmo  pseudocodigoEjercicio1
	Definir n, num, pares, impa Como Real
	Escribir "Ingrese un numero N";
	Leer n;
	Para i=1 hasta n Con Paso  1 Hacer
		num= aleatorio(0,1000);
		Escribir num;
		si num mod 2=0 Entonces
			pares=pares+1;
		FinSi
		
	FinPara
	impa=n-pares;
	Escribir "Hay ",pares " numeros pares y ",impa, " numeros impares";
FinAlgoritmo

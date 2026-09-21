Algoritmo Alg04_CalculadoraSalario
	Definir horasTrabajadas, horasNormales, horasExtras Como Entero
	Definir pagoPorHora, salarioBase, pagoExtras, salarioBruto, impuesto, salarioNeto Como Real
	Definir nombreEmpleado Como Caracter
	
	Escribir "=== CALCULO DE SALARIO SEMANAL ==="
	Escribir "Ingrese nombre del empleado:"
	Leer nombreEmpleado
	Escribir "Ingrese las horas trabajadas en la semana:"
	Leer horasTrabajadas
	Escribir "Ingrese la tarifa de pago por hora normal:"
	Leer pagoPorHora
	
	Si horasTrabajadas > 40 Entonces
		horasNormales <- 40
		horasExtras <- horasTrabajadas - 40
	Sino
		horasNormales <- horasTrabajadas
		horasExtras <- 0
	FinSi
	
	salarioBase <- horasNormales * pagoPorHora
	pagoExtras <- horasExtras * (pagoPorHora * 1.5)
	salarioBruto <- salarioBase + pagoExtras
	impuesto <- salarioBruto * 0.10
	salarioNeto <- salarioBruto - impuesto
	
	Escribir "----------------------------------------"
	Escribir "Empleado: ", nombreEmpleado
	Escribir "Horas normales: ", horasNormales
	Escribir "Horas extras (150%): ", horasExtras
	Escribir "Salario bruto: $", salarioBruto
	Escribir "Retencion de impuesto (10%): $", impuesto
	Escribir "Salario neto a recibir: $", salarioNeto
	Escribir "----------------------------------------"
FinAlgoritmo

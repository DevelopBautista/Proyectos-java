function sumar() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=parseFloat(num1)+parseFloat(num2);
	document.getElementById("resultados").value=resultados;


	
	document.getElementById("num1").value="";
	document.getElementById("num2").value="";
	
	
}


function restar() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=parseFloat(num1)-parseFloat(num2);
	document.getElementById("resultados").value=resultados;

	document.getElementById("num1").value="";
	document.getElementById("num2").value="";
	
	
	
}

function multiplicar() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=parseFloat(num1)*parseFloat(num2);
	document.getElementById("resultados").value=resultados;

	document.getElementById("num1").value="";
	document.getElementById("num2").value="";
}


function dividir() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=parseFloat(num1)/parseFloat(num2);
	document.getElementById("resultados").value=resultados;

	document.getElementById("num1").value="";
	document.getElementById("num2").value="";
}


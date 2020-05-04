function sumar() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=0;

	if (num1=="" || num2=="") {
		document.getElementById("resultados").value="Campos vacios";
	}else{
		resultados=parseFloat(num1)+parseFloat(num2);
		document.getElementById("resultados").value=resultados;

		document.getElementById("num1").value="";
		document.getElementById("num2").value="";
	}
}


function restar() {document.getElementById("resultados").value="Campos vacios";
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=0;

	if (num1=="" || num2=="") {
		document.getElementById("resultados").value="Campos vacios";
	}else{
		resultados=parseFloat(num1)-parseFloat(num2);
		document.getElementById("resultados").value=resultados;

		document.getElementById("num1").value="";
		document.getElementById("num2").value="";
	}
	
	
	
}

function multiplicar() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=0;

	if (num1=="" || num2=="") {
		document.getElementById("resultados").value="Campos vacios";
	}else{
		resultados=parseFloat(num1)*parseFloat(num2);
		document.getElementById("resultados").value=resultados;

		document.getElementById("num1").value="";
		document.getElementById("num2").value="";
	}
	
}


function dividir() {
	var num1=document.getElementById("num1").value;
	var num2=document.getElementById("num2").value;
	
	var resultados=0;

	if (num1=="" || num2=="") {
		document.getElementById("resultados").value="Campos vacios";
	}else{
		resultados=parseFloat(num1)/parseFloat(num2);
		document.getElementById("resultados").value=resultados;

		document.getElementById("num1").value="";
		document.getElementById("num2").value="";
	}
	
}


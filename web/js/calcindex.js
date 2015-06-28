function validateForm(){
	var number1 = document.calForm.number_one.value;
	var number2 = document.calForm.number_two.value;
	var numbers = /^[0-9]+$/;
	if(number1.match(numbers) && number2.match(numbers))
	{
		return true;
	}
	else{
		document.getElementById('Error').innerHTML = "Numbers must be filled out";
		return false;
	}
}
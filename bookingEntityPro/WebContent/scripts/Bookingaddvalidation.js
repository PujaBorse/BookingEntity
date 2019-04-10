function validatebookingForm(){


    var location =document.getElementById("lon").value;
	var firstname =document.getElementById("fn").value;
	var lastname =document.getElementById("ln").value;
	var mobileno = document.getElementById("mobn").value;
	var emailid = document.getElementById("eid").value;


if(location == null || location == "")
	{
		window.alert("Location Name cannot be empty")
		return false;
	}
	
	
	if(firstname == null || firstname == "")
	{
		window.alert("firstname  cannot be empty")
		return false;
	}
	
	if(lastname == null || lastname == "")
	{
		window.alert("lastname Name cannot be empty")
		return false;
	}
	
	if(mobileno == null || mobileno == "")
	{
		window.alert("mobileno cannot be empty")
		return false;
	}

	if(emailid == null || emailid == "")
	{
		window.alert("emailid cannot be empty")
		return false;
	}


}
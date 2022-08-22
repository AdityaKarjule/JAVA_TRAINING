

function validateUser(){
	var username=document.getElementById("uname").value
	if (username=="")
	{
		document.getElementById("userErr").innerHTML='Username cannot be blank ';
return false;

	}
	var password=document.getElementById("upass").value
	if (password=="")
	{
		document.getElementById("passErr").innerHTML='Password cannot be blank ';
return false;
		}
	
	
return true;
}
function clearUserErr(){document.getElementById("userErr").innerHTML="";}
function clearpassErr1(){document.getElementById("passErr1").innerHTML="";}

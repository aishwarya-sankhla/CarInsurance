/**
 * 
 */
function login(){
	var eid = document.getElementById("eid").value;
	var password = document.getElementById("password").value;
	var sbmt=document.getElementById("sbmt");
	
	var name_reg = new RegExp ('^/d{1}[a-zA-Z]{3}$');
	if(!name_reg.test(eid) || eid==""){
		console.log("error");
		sbmt.disabled=true;
		
	}
	if(password==""){
		 console.log("error");
		sbmt.disabled=true;
		 
	 }
	else{
		sbmt.disabled=false;
	}

}

function validateReg(){
	var name = document.getElementById("name").value;
	var eid = document.getElementById("eid").value;
	var password = document.getElementById("password").value;
	var sbmt=document.getElementById("sbmt");
	
	var name_reg = new RegExp ('^[a-zA-Z]{2,}');
	var eid_reg= new RegExp ('^/d{1}[a-zA-Z]{3}$');
	
	
	if(!name_reg.test(name) || name==""){
		console.log("error");
		sbmt.disabled=true;
		
	}
	if(!eid_reg.test(eid)  || eid==""){
		console.log("error");
		sbmt.disabled=true;
	}
	if(password==""){
		 console.log("error");
		sbmt.disabled=true;
		 
	 }
	else{
		sbmt.disabled=false;
	}

}




function init(){
	var sbmt=document.getElementById("sbmt");
	sbmt.disabled=true;
}
function addDiv( text = "hello") {
	try{
	  if( document.getElementById("tfm").value =="What's your name?" ){
		  throw new Error("DEFAULT.VALUE");
	  } else if (document.getElementById("tfm").value == false){
		  throw new Error("NO.VALUE");
	  } else {
	      text = document.getElementById("tfm").value;	  
		  iDiv = document.createElement('div');
	      iDiv.className = " news";
	      document.getElementById("field").appendChild(iDiv);
	      iDiv.innerHTML = text;
	  }
	}
	catch(error){
		console.log(error);
	}
}


function clearContent () {
	let content = document.getElementById("field").getElementsByClassName('news');
	for(let i = content.length - 1; i > -1 ; i-- ){
		content[i].remove();
	}
}
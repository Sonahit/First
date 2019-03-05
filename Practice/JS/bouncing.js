function bounce (){
	const vector = [0 , 0];
	let elem = document.getElementsByClassName("animate")[0];
	let square = document.getElementsByClassName("bounce")[0];
	let pos = 0;
	let id = setInterval(frame , 5);
	function frame () {
	  if ( pos == 450 ){
		clearInterval(id);
	  } else {
	  	pos++;
		  elem.style.top = pos + "px";
		  elem.style.left = pos + "px";
	  }
	}
}
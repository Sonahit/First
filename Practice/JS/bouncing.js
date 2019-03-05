
let canvas = {
	element: document.getElementById('canvas'),
	width: 500,
	height: 500,
	visibility: "hidden",
	initialize: function () {
			this.element.style.width = this.width + 'px';
			this.element.style.height = this.height + 'px';
			document.getElementById('field').appendChild(this.element);
	}
};

const Square = {
	create: function (color, dx, dy) {
			var newSquare = Object.create(this);
			newSquare.dx = dx;
			newSquare.dy = dy;
			newSquare.width = 40;
			newSquare.height = 40;
			newSquare.element = document.createElement('div');
			newSquare.element.style.backgroundColor = color;
			newSquare.element.style.width = newSquare.width + 'px';
			newSquare.element.style.height = newSquare.height + 'px';
			newSquare.element.className += ' animate';
			newSquare.width = parseInt(newSquare.element.style.width);
			newSquare.height = parseInt(newSquare.element.style.height);
			canvas.element.appendChild(newSquare.element);
			return newSquare;
	},
	moveTo: function (x, y) {
			this.element.style.left = x + 'px';
			this.element.style.top = y + 'px';
	},
	changeDirectionIfNecessary: function (x, y) {
			if (x < 0 || x > canvas.width - this.width) {
					this.dx = -this.dx;
			}
			if (y < 0 || y > canvas.height - this.height) {
					this.dy = -this.dy;
			}
	},
	draw: function (x, y) {
			this.moveTo(x, y);
			var Square = this;
			setTimeout(function () {
				Square.changeDirectionIfNecessary(x, y);
				Square.draw(x + Square.dx, y + Square.dy);
			}, 1000 / 60);
	}
};

function getColor(){
	var letters = '0123456789ABCDEF';
  var color = '#';
  for (var i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
}

function createSquare( color = getColor(),
											 dx = Math.ceil(Math.random() * 6) - 4 ,
											 dy = Math.ceil(Math.random() * 6) - 4 ,
											 x = Math.floor(Math.random() * 400) , 
											 y = Math.floor(Math.random() * 400))
											 {
	var Square1 = Square.create(color, dx, dy);
	Square1.draw(x , y);
}

function initField (){
	canvas.initialize();
	document.getElementById("canvas").style.display = "block";
	canvas.visibility = "visible";
}

function checkField(){
	setInterval(v, 5);
	function v (){
	if (canvas.visibility === "visible"){
		document.getElementById("crt").style.visibility = "visible";
	}
}
}


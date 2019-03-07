function setRandomColour() {
    document.getElementById('first').style.backgroundColor = getRandomColour();
    document.getElementById('second').style.backgroundColor = getRandomColour();
    document.getElementById('third').style.backgroundColor = getRandomColour();
};

function getRandomColour() {
  var letters = '0123456789ABCDEF';
  var color = '#';
  for (var i = 0; i < 6; i++) {
    color += letters[Math.floor(Math.random() * 16)];
  }
  return color;
};

function setRandomColourMP() {
    let colour = getRandomColour();
    document.getElementById('main').style.backgroundColor = colour;
    document.body.style.backgroundColor = colour;
};

function setDefault() {
    document.getElementById('first').style.backgroundColor = 'black';
    document.getElementById('second').style.backgroundColor = 'orange';
    document.getElementById('third').style.backgroundColor = 'black';
    document.getElementById('main').style.backgroundColor = 'white';
    document.getElementById('first').style.paddingLeft = "0%";
    document.getElementById('second').style.paddingLeft = "25%";
    document.getElementById('third').style.paddingLeft = "50%";
    document.body.style.backgroundColor = "white";
};

function setRandomPadding() {
  document.getElementById('first').style.paddingLeft = getRandomPadding();
  document.getElementById('second').style.paddingLeft = getRandomPadding();
  document.getElementById('third').style.paddingLeft = getRandomPadding();
};

function getRandomPadding() {
   let x = Math.floor(Math.random() * 10);
   let y = Math.floor(Math.random() * 10);
   let padding ="";
   padding = padding.concat(x, y , "%");
   return padding;
};
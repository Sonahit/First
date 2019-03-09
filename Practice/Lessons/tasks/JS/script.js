

function viewList(arr = []){
  for(let s = 0; s < arr.length; s ++){
    let tasks = document.getElementsByClassName(arr[s]);
    for(let i = tasks.length - 1; i > -1 ; i-- ){
      if(tasks[i].style.visibility === "visible"){
        tasks[i].style.visibility = "hidden";
        tasks[i].style.height = "0";  
        tasks[i].style.width = "0";
        for( let j = document.getElementsByTagName('ul').length - 1; j > -1; j--){
          document.getElementsByTagName('ul')[j].style.listStyleType="none";
          document.getElementsByTagName('ul')[j].style.height="10px";
        }
      } else {
        tasks[i].style.visibility = "visible";
        tasks[i].style.height = "100%";
        tasks[i].style.width = "100%";
        for( let j = document.getElementsByTagName('ul').length - 1; j > -1; j--){
          document.getElementsByTagName('ul')[j].style.listStyleType="circle";
          document.getElementsByTagName('ul')[j].style.height="100%";
        }
      }
    }
  }
  }


function getTask(li = 0, mode = 0){
  let mainpage = document.getElementsByClassName('middle')[0];
    fetch('http://localhost:8080/Practice/Lessons/tasks/task1/task.text')
    .then( function(response) {
      response.text().then(function(text) {
        document.getElementsByClassName('task')[li].setAttribute("onClick","getTask("+li+", 1)"); 
        mainpage.innerHTML = "<pre>"+text+"</pre>";
      });
    })
}

function shWork(li = 0, mode) {
  let mainpage = document.getElementsByClassName('middle')[0];
  if(mode === 's'){
    if( li === 0){
    fetch('http://localhost:8080/Practice/Lessons/tasks/task1/workSpace.html')
    .then( function(response) {
      response.text().then(function(text) { 
        mainpage.innerHTML = text;
      });
    })
    } else if (li === 1){
    }
  } else if (mode === 'h'){
    mainpage.innerHTML = "";
  }
}
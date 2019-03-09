let fs = require("fs");
let rs = require("readline-sync");
let port = 8080;
//port = parseInt(rs.question('Give my Port: '));

const express = require("express");
const app = express();
const path = require("path");
const router = express.Router();
var favicon = require("serve-favicon");
const bodyParser = require("body-parser");


app.use(express.static(path.join(__dirname, "public")));

app.use(favicon(path.join(__dirname, "public", "favicon.png")));

app.use("/Practice", express.static(path.join(__dirname, "Practice")));

app.use("/Vacation", express.static(path.join(__dirname, "Vacation")));

app.use("/Lessons", express.static(path.join(__dirname,'Lessons')));

app.use(bodyParser.urlencoded({
  extended: true
}));

app.use(bodyParser.json());

app.get("/", function(req, res) {
  res.sendFile(path.join(__dirname, "public", "/HTML/index.html"));
});

app.get("/Practice/Lessons/users?", function(req, res, next) {
  let response = JSON.parse(fs.readFileSync('Practice/Lessons/JSON/users.json', function (err, data){
    return data;
  }))
  res.send(response);
});

app.post("/Practice/Lessons/users", function(req, res) {
  let firstName = req.body.users.firstName;  
  let lastName = req.body.users.lastName; 
  let age = req.body.users.age; 
  let id = newId();
  let json = JSON.parse(fs.readFileSync('Practice/Lessons/JSON/users.json'));
  json.splice(id - 1, 0, {"id":id, "firstName":firstName, "lastName":lastName, "age":age});
  let jsonToStr = JSON.stringify(json, 2);
  fs.writeFileSync('Practice/Lessons/JSON/users.json',jsonToStr);
});

router.use("/Practice/Lessons/users/:id", (req, res, next) =>{
  next();
});

router.route("/Practice/Lessons/users/:id")

.put(function(req, res, next) {
  console.log('GET2',req.method);
  res.statusCode = 200;
  let id = req.params.id;
  let firstName = req.body.users.firstName;  
  let lastName = req.body.users.lastName; 
  let age = req.body.users.age; 
  let json = JSON.parse(fs.readFileSync('Practice/Lessons/JSON/users.json'));
  for(let i = 0; i < json.length; i++){
    if(id === json[i].id ){
      if(validate(firstName)){
        json[i].firstName = firstName;
      } else if (validate(lastName)){
        json[i].lastName = lastName;
      } else if (validate(age)){
        json[i].age = age;
      }
    }
  }
  let jsonToStr = JSON.stringify(json, 2);
  fs.writeFileSync('Practice/Lessons/JSON/users.json',jsonToStr);
})

.delete(function(req, res, next) {
  console.log('GET3',req.method);
  res.statusCode = 200;
  let id = req.params.id;
  let firstName = req.body.users.firstName;  
  let lastName = req.body.users.lastName; 
  let age = req.body.users.age; 
  let json = JSON.parse(fs.readFileSync('Practice/Lessons/JSON/users.json'), function(key, value){
    if(id === value && key === 'id' ){
      json.splice(value, 1);
    }
  });
  let jsonToStr = JSON.stringify(json, 2);
  fs.writeFileSync('Practice/Lessons/JSON/users.json',jsonToStr);
  next();
})

.get(function(req, res, next) {
  console.log('GET1', req.method);
  let response = path.join(__dirname, "/Practice/Lessons", "/response/users.html");
  res.status(200).sendFile(response);
});

 

app.get("/Practice/Lessons/users/:id", router);

function validate (value){
  return value != null || value == true;
}

var test = function(req, res, next) {
  res.end("Displaying information for uid " + req.params.uid);
};

function newId () {
  let check = 0;
  JSON.parse(fs.readFileSync('Practice/Lessons/JSON/users.json'), function (key, value){   
    if(key === 'id'){
      if(check <= value - 2 ){
        return check + 1;
      }
      check = value;
    }
  });
  return check + 1;  
};

app.get("/test/:uid", test);


app.use(function(req, res) {
  console.log('404:', req.originalUrl);
  res.status(404).sendFile(path.join(__dirname, "public", "error/index.html"));
});

app.listen(process.env.port || port);

console.log("Running at Port", port);

let http = require('http');
let fs = require('fs');
let url = require("url");
let rs = require('readline-sync');
let port = 8080;
//port = parseInt(rs.question('Give my Port: '));

const express = require('express');
const app = express();
const path = require('path');
const router = express.Router();
var favicon = require('serve-favicon');

app.use(express.static(path.join(__dirname, 'public')));

router.use(favicon(path.join(__dirname,'public', 'favicon.png')));

app.use('/Practice', express.static(path.join(__dirname, 'Practice')));

app.use('/Vacation', express.static(path.join(__dirname, 'Vacation')));

app.get('/', function(req,res){
    res.sendFile(path.join(__dirname, 'public' ,'/HTML/index.html'), function (err){
        if (err){
            res.status(404).send("Sorry can't find that!")
        } else {
            console.log("Sent:", path.join(__dirname, 'public' ,'/HTML/index.html') )
        }
    });
  });

  app.get('*', function(req,res){
    res.sendFile(path.join(__dirname,'public', "error/index.html"), function (err){
        if (err){
            res.status(404).send("Sorry can't find that!")
        } else {
            console.log("Sent:", path.join(__dirname,'public', "/error/index.html") )
        }
    });
  });

  app.get('Practice', function(req,res){
    res.sendFile(path.join(__dirname, '/Practice','index.html'), function (err){
        if (err){
            res.status(404).send("Sorry can't find that!")
        } else {
            console.log("Sent:", path.join(__dirname, '/Practice','/index.html') )
        }
    });
  });
 
  app.get('Vacation',function(req,res){
  res.sendFile(path.join(__dirname, '/Vacation' ,'/index.html'), function (err){
    if (err){
        res.status(404).send("Sorry can't find that!")
    } else {
        console.log("Sent:", path.join(__dirname, '/Vacation' ,'/index.html') )
    }
    }) ;
  });

  app.listen(process.env.port || 8080);
  
  console.log('Running at Port 8080');
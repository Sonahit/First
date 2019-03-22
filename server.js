let fs = require("fs");
let rs = require("readline-sync");
let port = 8080;
//port = parseInt(rs.question('Give my Port: '));
// <--------------------------TEST------------------------------------>
const log = require("./Practice/BackEnd/Login/login.js");
// <--------------------------TEST------------------------------------>
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

app.use(
  bodyParser.urlencoded({
    extended: true
  })
);

app.use(bodyParser.json());

app.listen(process.env.port || port);

console.log("Running at Port", port);

app.get("/", function(req, res) {
  res.sendFile(path.join(__dirname, "public", "/HTML/index.html"));
});


app.use(function(req, res) {
  console.log("404:", req.originalUrl);
  res.status(404).sendFile(path.join(__dirname, "public", "error/index.html"));
});





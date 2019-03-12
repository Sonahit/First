'use strict';

function newLogin (login="", pswd=""){
    login = "123";
    pswd = "123";
    console.log("Login =",login,"\t Password=", pswd);
}

const { PI } = Math;

exports.area = (r) => PI * r ** 2;

exports.circumference = (r) => 2 * PI * r;
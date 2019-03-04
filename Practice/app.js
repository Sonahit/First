const http = require('http');
let port = "8080";

let url = require('url');
const server = new http.Server();

server.on('request', function (request, response) {
    response.writeHead(200);
    console.log('Server:', url.parse(request.headers.host).protocol.slice(0,url.parse(request.headers.host).protocol.length - 1) ,'is running on port:', port);
    response.end('Hello world!');
}).listen(port);
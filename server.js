let http = require('http');
let fs = require('fs');
let url = require("url");

http.createServer( function (request, response){
    let pathname = url.parse(request.url).pathname;
    console.log("Request for " + pathname + " received.");
    
    response.writeHead(200);

    if(pathname == "/") {
        html = fs.readFileSync("HTML/index.html", "utf8");
        response.write(html);
    } else if (pathname == "/JS/script.js") {
        script = fs.readFileSync("JS/script.js", "utf8");
        response.write(script);
    }
    else if (pathname == "/CSS/style.css") {
        script = fs.readFileSync("CSS/style.css", "utf8");
        response.write(script);
    }
    else if (pathname == "/Image/title.ico" | pathname == "/favicon.ico") {
        response.write(fs.readFileSync("Image/title.ico"));
    }
    else if (pathname == "/Vacation/") {
        response.write(fs.readFileSync("Vacation/index.html"));
    }
    else if (pathname == "/Vacation/vacation.mp3") {
        response.write(fs.readFileSync("Vacation/vacation.mp3"));
    }
    else if (pathname == "/Vacation/style.css") {
        response.write(fs.readFileSync("Vacation/style.css"));
    }
    else if (pathname == "/Vacation/images/tree.gif") {
        response.write(fs.readFileSync("Vacation/images/tree.gif"));
    }
    else if (pathname == "/Vacation/images/dance.gif") {
        response.write(fs.readFileSync("Vacation/images/dance.gif"));
    }
    else if (pathname == "/Practice/") {
        response.write(fs.readFileSync("Practice/index.html"));
    }
    else if (pathname == "/Practice/CSS/style.css") {
        response.write(fs.readFileSync("Practice/CSS/style.css"));
    }


    response.end();
}).listen(8080);
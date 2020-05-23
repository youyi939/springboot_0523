var http=require('http')
var child_process=require('child_process')

var server=http.createServer()

server.on('request',function (req,resp) {
    console.log("接到一次推送")
    child_process.exec('./ci.sh',function (error,stdout,stderr) {
        console.log(stdout)
    })
    resp.end("receive one push")
})
server.listen(3003,function () {
    console.log("持续集成服务已在5000端口启动")
})


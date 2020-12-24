$(function(){
    $("#form-login").on("submit", function (ev) {
        ev.preventDefault();
        return myAjax("/api/login/login", "POST", $('#form-login').serialize(), function (e) {
            if (e.success) {
                console.log(e)
            } else {
                alert(e.msg)
            }
        })
    })
})
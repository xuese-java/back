//    全局设置
$.ajaxSetup({
    timeout: 2000,
    dataType: "json",
    beforeSend: function (request) {
        request.setRequestHeader("xueSeToken", sessionStorage.getItem("xueSeToken"));
    },
    success: function (response, status, xhr) {
    },
    error: function (err) {
        console.log(err)
    },
    complete: function () {
    }
});

function myAjax(url, type, data, callback) {
    return new Promise(function (resolve, reject) {
        $.ajax(url, {
            type: type,
            dataType: 'json',
            data: data
        }).done(function (e) {
            callback(e)
            resolve();
        }).fail(function () {
            reject();
        })
    })
}
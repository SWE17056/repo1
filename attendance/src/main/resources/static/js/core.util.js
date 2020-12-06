/*CoreUtil*/
/*�����࣬����java��̬������*/
var CoreUtil = (function () {
    var coreUtil = {};
    /*ajax����*/
    coreUtil.sendAjax = function (url, params, ft, method,async,contentType) {
        var roleSaveLoading = top.layer.msg('�����ύ�У����Ժ�',{icon: 16,time:false,shade:0.8});
        $.ajax({
            url: url,
            cache: false,
            async: async == undefined ? true : async,
            data: params,
            type: method == undefined ? "POST" : method,
            contentType: contentType == undefined ? 'application/json; charset=UTF-8': contentType
            ,
            dataType: "json",
            success: function (res) {
                top.layer.close(roleSaveLoading);
                if (typeof ft == "function") {
                    if(res.code==0) {
                        if(ft!=null&&ft!=undefined){
                            ft(res);
                        }
                    } else {
                        layer.msg(res.msg)
                    }
                }
            },error:function (XMLHttpRequest, textStatus, errorThrown) {
                top.layer.close(roleSaveLoading);
                if(XMLHttpRequest.status==404){
                    top.window.location.href="/index/404";
                }else{
                    layer.msg("������������˵����⣡���Ժ�����");
                }
            }
        });
    };
    return coreUtil;
})(CoreUtil, window);
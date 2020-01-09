
Page({
    data: {
        array: [
            { id: "1001", name: "v中国", value: "中国", checked: true, color: "red", disabled: false },
            { id: "1002", name: "v美国", value: "美国", checked: false, color: "blue", disabled: false },
            { id: "1003", name: "v俄国", value: "俄国", checked: true, color: "pink", disabled: false }
        ],
        myvalue: "请选择一个radio"
    },

    changeme:function(e) {
        var value = e.detail.value;
        this.setData({
            myvalue: value
        });
    }
})

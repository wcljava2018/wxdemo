
Page({
    data: {
        skills: [
            { id: "1001", name: "Java", value: "Java"},
            { id: "1002", name: "HTML", value: "HTML"},
            { id: "1003", name: "SQL", value: "SQL"},
            { id: "1004", name: "大数据", value: "大数据" },
            { id: "1005", name: "ios", value: "ios" },
            { id: "1006", name: "android", value: "android" }
        ],
        dateLable: "请选择你的生日",
        cityLable: "请选择你的所在地"
    },

    // 提交form事件
    submitme: function(e) {
        var value = e.detail.value;
        console.log(value);
    },

    changeDate: function (e) {
        this.setData({
            dateLable: e.detail.value
        });
    },

    changeCity: function (e) {
        this.setData({
            cityLable: e.detail.value
        });
    }
})

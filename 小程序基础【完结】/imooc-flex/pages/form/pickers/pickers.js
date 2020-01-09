
Page({
    data:{
        array:[1,2,3,4,5,6,7,8,9,0],
        arrayObj:[
            { id: 1001, name: "jack" },
            { id: 1002, name: "lilei" },
            { id: 1003, name: "hanmeimei" },
            { id: 1004, name: "lucy" },
            { id: 1005, name: "poly" }
        ],
        showme: "请选择一个人名",
        arrayMulti: [
            [1, 2, 3, 4, 5, 6, 7, 8, 9, 0],
            [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
        ],
        arrayObjMulti:[
            [
                { id: 1001, name: "jack" },
                { id: 1002, name: "lilei" },
                { id: 1003, name: "hanmeimei" },
                { id: 1004, name: "lucy" },
                { id: 1005, name: "poly" }
            ],
            [
                { id: 1001, name: "jack" },
                { id: 1002, name: "lilei" },
                { id: 1003, name: "hanmeimei" },
                { id: 1004, name: "lucy" },
                { id: 1005, name: "poly" }
            ]
        ],

        timeLable: "请选择时间",
        dateLable: "请选择日期",
        cityLable: "请选择城市"
    },

    changeme: function(e) {
        var index = e.detail.value;
        console.log("index下标值为: " + index);
        var id = this.data.arrayObj[index].id;
        var name = this.data.arrayObj[index].name;
        this.setData({
            showme: id + name
        });

    },

    cancelme: function (e) {
        console.log("触发取消事件...");
    },

    columnchange:function(e) {
        console.log(e.detail);
    },

    changemeMulti: function(e) {
        var indexs = e.detail.value;
        var arrayObjMulti = this.data.arrayObjMulti;

        for (var i = 0; i < indexs.length ; i ++) {
            var indexTmp = indexs[i];
            var id = arrayObjMulti[i][indexTmp].id;
            var name = arrayObjMulti[i][indexTmp].name;
            console.log(id + " " + name);
        }

    },

    changeTime: function(e) {
        this.setData({
            timeLable: e.detail.value
        });
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



Page({
    data: {
        color: "white"
    },

    changeme: function(e) {
        var flag = e.detail.value;
        if (flag) {
            // 开灯
            this.setData({
                color: "white"
            });
        } else {
            // 关灯
            this.setData({
                color: "black"
            });
        }
    }
})

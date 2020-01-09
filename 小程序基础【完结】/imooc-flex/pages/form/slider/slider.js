
Page({
    data: {
        myheight: "500rpx",
        staticHeight: 500
    },

    iamchanging:function(e) {
        var val = e.detail.value;
        var newHeight = this.data.staticHeight * (val/100);
        this.setData({
            myheight: newHeight + "rpx"
        });
    },

    changeme: function (e) {
        var val = e.detail.value;
        var newHeight = this.data.staticHeight * (val / 100);
        this.setData({
            myheight: newHeight + "rpx"
        });
    }
})

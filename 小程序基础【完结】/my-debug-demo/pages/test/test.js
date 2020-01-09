//index.js
Page({
  data: {
    mytxt: '这是一个test页面',
    color: "green"
  },
  onLoad: function () {
    console.log("onLoad");
    var appInstance = getApp()
    console.log(appInstance.courseName);
    this.setData({
      mytxt: appInstance.courseName
    });
  },
  onReady: function () {
    console.log("触发onReady")
  },
  onShow: function () {
    console.log("触发onShow")
  },
  onHide: function () {
    console.log("触发onHide")
  },
  onUnload: function () {
    console.log("触发onUnload")
  },

  clickMe:function() {
    wx.redirectTo({
      url: "../imooc/imooctest"
    })
    // wx.navigateTo({
    //   url: "../imooc/imooctest"
    // })
  }
})

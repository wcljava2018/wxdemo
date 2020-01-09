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
    console.log("onReady");
  },
  onShow: function () {
    console.log("onShow");
    this.setData({
      mytxt: this.myPageData
    });
  },
  onHide: function () {
    console.log("onHide");
  },
  onUnload: function () {
    console.log("onUnload");
  },
  myPageData: "这是一个私有的page字符串",

  clickMe: function(){
    // wx.redirectTo({
    //   url: '../index/index',
    // })

    wx.navigateTo({
      url: '../index/index',
    })
  }
})

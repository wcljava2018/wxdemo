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
  }
})

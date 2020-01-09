//index.js
Page({
  data: {
    mytxt: '大家好~这是我们第一个demo~！',
    color: "red"
  },
  onLoad: function () {
  },
  onUnload: function () {
    console.log("index触发onUnload");
  }
})

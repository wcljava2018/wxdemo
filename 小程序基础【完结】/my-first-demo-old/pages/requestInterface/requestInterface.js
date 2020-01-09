
Page({
  data: {

  },
  clickme:function() {
      wx.request({
          url: 'https://eca31ee0.ngrok.io/info',
          data: {
              id:1001,
              name:"慕课网"
          },
          header: {
              'content-type': 'application/json' 
          },
          success: function (res) {
              console.log(res.data)
          }
      })
  }
})

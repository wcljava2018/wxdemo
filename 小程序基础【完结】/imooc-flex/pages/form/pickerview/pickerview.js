Page({

  data: {
    year:[1990,1995,2000,2005,2010,2015,2020],
    month:[1,2,3,4,5,6,7,8,9,10,11,12],
    day:[1,5,10,15,20,25,30],
    myvalue:"请选择日期"
  },

  changeme: function(e) {
    var indexs = e.detail.value;

    var year = this.data.year[indexs[0]];
    var month = this.data.month[indexs[1]];
    var day = this.data.day[indexs[2]];

    this.setData({
        myvalue: year + "年" + month + "月" + day + "日"
    });
  }
})
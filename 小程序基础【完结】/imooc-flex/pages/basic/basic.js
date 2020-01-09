
Page({
    data:{
        mycontent: '<img class="course-banner" src="//img2.mukewang.com/5a9f83e90001f06306000338-240-135.jpg">',

        mycontent2:[
            {
                name: "img",
                attrs: {
                    class: "course-banner",
                    src: "//img2.mukewang.com/5a9f83e90001f06306000338-240-135.jpg"
                }
            }
        ],
        mypercent: 15 
    },

    addPercent:function() {
        var newPercent = this.data.mypercent + 20;
        this.setData({
            mypercent: newPercent
        })
    }
})

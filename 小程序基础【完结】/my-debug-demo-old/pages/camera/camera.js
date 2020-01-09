
Page({
    data:{
        
    },
    takePhoto() {
        const ctx = wx.createCameraContext()
        ctx.takePhoto({
            quality: 'high',
            success: (res) => {
                this.setData({
                    src: res.tempImagePath
                });
                wx.saveImageToPhotosAlbum({
                    filePath: res.tempImagePath
                })
            }
        })
    },
    error(e) {
        console.log(e.detail)
    },

    startVideo() {
        const ctx = wx.createCameraContext()
        ctx.startRecord({
            success: (res) => {
                
            }
        })
    },

    endVideo() {
        const ctx = wx.createCameraContext()
        ctx.stopRecord({
            success: (res) => {
                                wx.saveVideoToPhotosAlbum({
                    filePath: res.tempVideoPath
                })
            }
        })
    }
})

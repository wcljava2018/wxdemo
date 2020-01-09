
Page({
  data: {
    mylist:[
      { id: 1, name: 'lily' },
      { id: 2, name: 'lucy' },
      { id: 3, name: 'lilei' }
    ]
  },

  addItem:function(){
      var newList = this.data.mylist;
      var index = newList.length + 1;
      var newObjHead = { id: index, name: 'newName' + index };
      var newObjFoot = { id: index+1, name: 'newName' + index+1 };
      newList.push(newObjFoot);
      newList.unshift(newObjHead);
      this.setData({
          mylist: newList
      })
  }
})

package com.example.unifyassignment

import com.example.unifyassignment.data.ImageClass

object ImageLoading {
    var isEmpty=true;
    var list=ArrayList<ImageClass>()
    fun getList(){
      list.add(ImageClass("https://apptestsoko.s3.ap-south-1.amazonaws.com/assets/fp.png"))
      list.add(ImageClass("https://apptestsoko.s3.ap-south-1.amazonaws.com/assets/m.png"))

      list.add(ImageClass("https://apptestsoko.s3.ap-south-1.amazonaws.com/assets/a.png"))
        isEmpty=true;
    }

}
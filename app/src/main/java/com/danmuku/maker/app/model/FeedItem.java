package com.danmuku.maker.app.model;

import java.io.Serializable;
import java.util.List;


public class FeedItem implements Serializable {

    private String imgPath;
    private List<TagItem> tagList;

    public FeedItem() {

    }

    public FeedItem(List<TagItem> tagList, String imgPath) {
        this.imgPath = imgPath;
        this.tagList = tagList;
    }


    public List<TagItem> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagItem> tagList) {
        this.tagList = tagList;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


}

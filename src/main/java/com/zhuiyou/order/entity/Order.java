package com.zhuiyou.order.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_order")
public class Order {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 32)
    private String id;
    @Column(length = 32)
    private String itemId;//宝贝id
    private String keyWord;    //宝贝关键词
    private String searchStyle;        //搜索类型，0-淘宝搜索 1-天猫搜索 2-淘宝分类搜索 3-天猫分类搜索 10-京东搜索
    private String sortStyle;          //排序方式，0-综合排序 1- 销售 2-价格低到高 3-价格高到低 4-信用
    private String shopAround;         //货比三家, 0-无 1-货比1家进店 2-货比2家进店 3-货比3家进店 4-货比4家进店 5-货比5家进店
    private String stay;               //浏览停留时间，0-20到30秒 1-30到60秒 2-60到90秒 3-90到120秒
    private String pvuv;               //PV/UV比，0-1 1-1.2 2-1.5 3-1.8 4-2
    private String browseDiscuss;       //是否浏览评论成交记录，0-否 1-是
    private String browseHomePage;      //是否访问店铺首页，0-否 1-是
    private String browseInItem;        //是否进店铺浏览商品，0-否 1-是
    private String addFavorite;        //是否收藏，0-否 1-是
    private String addCart;            //是否加车，0-否 1-是
    private String taskStyle;          //订单类型，0-当天平均  1-当天集中 2-自定义时间段：当值为0或1时，dailycount的值必须填写；当值为2时，startdate，enddate，taskscatter的值必须填写
    private String startDate; //自定义时间段开始日期，格式为YYYY-MM-DD
    private String endDate;   //自定义时间段结束日期，格式为YYYY-MM-DD
    private int dailyCount;        //每天任务数
    private String tasScatter; //自定义流量分布，字符串格式 0,0,0,0,0,2,3,2,2,2,2,2,3,2,2,2,2,2,3,2,1
    private String insertTime;
    private String updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getSearchStyle() {
        return searchStyle;
    }

    public void setSearchStyle(String searchStyle) {
        this.searchStyle = searchStyle;
    }

    public String getSortStyle() {
        return sortStyle;
    }

    public void setSortStyle(String sortStyle) {
        this.sortStyle = sortStyle;
    }

    public String getShopAround() {
        return shopAround;
    }

    public void setShopAround(String shopAround) {
        this.shopAround = shopAround;
    }

    public String getStay() {
        return stay;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }

    public String getPvuv() {
        return pvuv;
    }

    public void setPvuv(String pvuv) {
        this.pvuv = pvuv;
    }

    public String getBrowseDiscuss() {
        return browseDiscuss;
    }

    public void setBrowseDiscuss(String browseDiscuss) {
        this.browseDiscuss = browseDiscuss;
    }

    public String getBrowseHomePage() {
        return browseHomePage;
    }

    public void setBrowseHomePage(String browseHomePage) {
        this.browseHomePage = browseHomePage;
    }

    public String getBrowseInItem() {
        return browseInItem;
    }

    public void setBrowseInItem(String browseInItem) {
        this.browseInItem = browseInItem;
    }

    public String getAddFavorite() {
        return addFavorite;
    }

    public void setAddFavorite(String addFavorite) {
        this.addFavorite = addFavorite;
    }

    public String getAddCart() {
        return addCart;
    }

    public void setAddCart(String addCart) {
        this.addCart = addCart;
    }

    public String getTaskStyle() {
        return taskStyle;
    }

    public void setTaskStyle(String taskStyle) {
        this.taskStyle = taskStyle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getDailyCount() {
        return dailyCount;
    }

    public void setDailyCount(int dailyCount) {
        this.dailyCount = dailyCount;
    }

    public String getTasScatter() {
        return tasScatter;
    }

    public void setTasScatter(String tasScatter) {
        this.tasScatter = tasScatter;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}

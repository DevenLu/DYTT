package com.bzh.data.film;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * ==========================================================<br>
 * <b>版权</b>：　　　别志华 版权所有(c)2016<br>
 * <b>作者</b>：　　  biezhihua@163.com<br>
 * <b>创建日期</b>：　16-3-14<br>
 * <b>描述</b>：　　　<br>
 * <b>版本</b>：　    V1.0<br>
 * <b>修订历史</b>：　<br>
 * ==========================================================<br>
 */
public class FilmDetailEntity {

    private String translationName;    // 译名
    private String name;                 // 电影名
    private String title;                // 标题

    private String publishTime;         // 发布时间
    private String coverUrl;            // 封面
    private String years;               // 年代
    private String country;             // 国家
    private String category;            // 类别
    private String language;            // 语言
    private String subtitle;            // 字幕
    private String playtime;            // 上映时间
    private String fileFormat;          // 文件格式
    private String videoSize;           // 视频尺寸
    private String fileSize;            // 文件大小
    private String showTime;            // 片长
    private String director;            // 导演
    private ArrayList<String> leadingPlayers;// 主演
    private String description;         // 简介
    private String previewImage;     // 预览图
    private ArrayList<String> downloadUrls; // 下载地址
    private String imdb;         // 评分

    // 华语电视剧
    private String episodeNumber;       // 集数

    // 日韩电视剧
    private String playName;            // 剧名
    private String source;              // 来源
    private String type;                // 类型
    private String premiere;            // 首播
    private String time;                // 时间
    private String jieDang;             // 接档
    private String screenWriter;       // 编辑

    // 欧美电视剧
    private String tvStation;             // 电视台
    private ArrayList<String> performers;       // 演员

    public String getTvStation() {
        return tvStation;
    }

    public void setTvStation(String tvStation) {
        this.tvStation = tvStation;
    }

    public ArrayList<String> getPerformers() {
        return performers;
    }

    public void setPerformers(ArrayList<String> performers) {
        this.performers = performers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslationName() {
        return translationName;
    }

    public void setTranslationName(String translationName) {
        this.translationName = translationName;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getLeadingPlayers() {
        return leadingPlayers;
    }

    public void setLeadingPlayers(ArrayList<String> leadingPlayers) {
        this.leadingPlayers = leadingPlayers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public ArrayList<String> getDownloadUrls() {
        return downloadUrls;
    }

    public void setDownloadUrls(ArrayList<String> downloadUrls) {
        this.downloadUrls = downloadUrls;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getJieDang() {
        return jieDang;
    }

    public void setJieDang(String jieDang) {
        this.jieDang = jieDang;
    }

    public String getScreenWriter() {
        return screenWriter;
    }

    public void setScreenWriter(String screenWriter) {
        this.screenWriter = screenWriter;
    }
}

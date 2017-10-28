package com.anhtd1387.manga.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Anhtd on 13/10/2017.
 */

public class Book implements Serializable{
    private String id;
    private String title;
    private String author;
    private String publisher;
    private String description;
    private String type;
    private String attachment;
    private String categoryId;
    private String status;
    private List<Chapter> listChapterBooks;
    private String image;
    private String dateHistory;
    @SerializedName("last chapter")
    private LastChapter lastChapter;

    public Book() {
    }

    public Book(String id, String title, String author, String publisher, String description, String type, String attachment, String categoryId, String status, List<Chapter> listChapterBooks, String image, String dateHistory, LastChapter lastChapter) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.description = description;
        this.type = type;
        this.attachment = attachment;
        this.categoryId = categoryId;
        this.status = status;
        this.listChapterBooks = listChapterBooks;
        this.image = image;
        this.dateHistory = dateHistory;
        this.lastChapter = lastChapter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Chapter> getListChapterBooks() {
        return listChapterBooks;
    }

    public void setListChapterBooks(List<Chapter> listChapterBooks) {
        this.listChapterBooks = listChapterBooks;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateHistory() {
        return dateHistory;
    }

    public void setDateHistory(String dateHistory) {
        this.dateHistory = dateHistory;
    }

    public LastChapter getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(LastChapter lastChapter) {
        this.lastChapter = lastChapter;
    }
}

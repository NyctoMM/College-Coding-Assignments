package com.example.top10downloaderwithlistview;

public class FeedEntry {

    private String name; //
    private String artist; //This is the publisher
    private String releaseDate;
    private String summary;
    private String imageURL;
    private String price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FeedEntry{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", price='" + price + '\'' +
                ", summary='" + summary + '\'' +
                //", imageURL='" + imageURL + '\'' +
                '}';
    }

}

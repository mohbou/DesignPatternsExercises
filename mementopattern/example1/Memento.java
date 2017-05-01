package main.mementopattern.example1;

public class Memento {

    private String article;

    public Memento(String article) {
        this.article = article;
    }

    public String getSavedArticle() {
        return article;
    }
}

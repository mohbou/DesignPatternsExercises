package main.mementopattern.example1;

public class Originator {

    private String article;

    public String getArticle() {
        return article;
    }

    public void set(String article) {
        System.out.println("From originator current version of Article "+article);
        this.article =  article;

    }

    public  Memento storeInMemento() {
        System.out.println("From originator Stored in Memento");
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento) {
        System.out.println("From originator restored from Memento");
        this.article = memento.getSavedArticle();
        return  article;
    }
}

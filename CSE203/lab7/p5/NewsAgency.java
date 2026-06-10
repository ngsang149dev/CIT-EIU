package lab7.p5;

public class NewsAgency extends Subject {
    private String name;

    public NewsAgency(String name) {
        this.name = name;
    }

    public void publishNews(String news) {
        System.out.println("\n[%s] Publishing: %s".formatted(name, news));
        notifyObservers(news);
    }
    
}

package labmanual11;

public class ContentWriter extends Employee{
    private int articlesCount;

    ContentWriter(String name, double salary, int articlesCount){
        super(name, salary);
        this.articlesCount = articlesCount;
    }

    public void setArticlesCount(int articlesCount) {
        this.articlesCount = articlesCount;
    }

    public int getArticlesCount() {
        return articlesCount;
    }

    @Override
    double calculateBonus(double bonus) {
        return super.calculateBonus(bonus) + (100 * articlesCount);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Articles Count: "+articlesCount);
    }
}

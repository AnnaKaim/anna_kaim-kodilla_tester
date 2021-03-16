public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
           if (this.price < 600) {
               System.out.println("This notebook is very cheap.");
           } else if (1000 < this.price) {
               System.out.println("This notebook is expensive.");
           } else {
               System.out.println("The price is good.");
           }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This device is light.");
        } else if (this.weight > 1600) {
            System.out.println("This device is very heavy.");
        } else {
            System.out.println("This device is not so heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year<2012 && this.price<600) {
            System.out.println("Notebooks produced before 2012 cost up to 800.");
        } else if (this.year>2018 && this.price>=1500) {
            System.out.println("Notebooks produced after 2018 cost at least 1000.");
        } else {
            System.out.println("Notebooks produced between 2012 and 2018 cost 900 to 1200.");
        }
    }
}


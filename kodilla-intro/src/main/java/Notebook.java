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
                        System.out.println("This notebook is cheap.");
                }
                else if (this.price >=600 && this.price <= 1000) {
                        System.out.println("This price is good.");
                }

                else {
                        System.out.println("This notebook is expensive.");
                }
        }
        public void checkWeigth() {
                if (this.weight > 1600) {
                        System.out.println("This notebook is very heavy.");
                }
                        else if (this.weight <= 1600 && this.weight > 600) {
                        System.out.println("This weight is good.");
                }
                        else  {
                        System.out.println("This notebook is light.");
                }
        }
        public void checkYear() {
                if (this.year >= 2018) {
                        System.out.println("Almost New.");
                }
                else if (this.year < 2018 && this.year >= 2012) {
                        System.out.println("Not so old.");
                }
                else  {
                        System.out.println("This is old notebook.");
                }
        }
}
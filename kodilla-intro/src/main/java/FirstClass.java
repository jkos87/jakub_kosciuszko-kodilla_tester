public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "zł " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeigth();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2000);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + "zł " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeigth();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2012);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "zł " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeigth();
        oldNotebook.checkYear();


    }
}
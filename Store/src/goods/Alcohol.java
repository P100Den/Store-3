package goods;

public class Alcohol {
   private String name;
   private int prise;
   private String item;
   private String size;
   private String volume;
   private String manufacturer;

    public Alcohol(String name, int prise, String item, String size, String volume, String manufacturer) {
        this.name = name;
        this.prise = prise;
        this.item = item;
        this.size = size;
        this.volume = volume;
        this.manufacturer = manufacturer;
    }
    public  void putOnTheShelf(){
        System.out.println("Продукт был положен на полку");
    }
    public void takeFromTheShelf(){
        System.out.println("Продукт был взят с полки");
    }

    public void choiceProduct(){
        System.out.println("Выбор продукта");
    }

    public void visualInspection(){
        System.out.println("Продукт был осмотрен");
    }
    public void putOnBasket(){
        System.out.println("Продукт был положен в корзину");
    }

    public void buy(){
        System.out.println("Продукт куплен");
    }
}

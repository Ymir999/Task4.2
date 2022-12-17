package Task42;

import java.util.ArrayList;


public class Shop {

    Product p1 = new Product("Milk", 75);
    Product p2 = new Product("Tea", 129);
    Product p3 = new Product("Water", 89);
    Product p4 = new Product("Crisps", 129);
    Product p5 = new Product("Ice cream", 239);
    Product p6 = new Product("Chocolate", 72);
    Product p7 = new Product("Bread", 62);



    int []arrPrice = {p1.price,p2.price,p3.price,
            p4.price,p5.price,p6.price,p7.price};
    String []arrName = {p1.name, p2.name, p3.name,
            p4.name,p5.name,p6.name,p7.name};

    ArrayList<String> getProducts(int cost)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arrName.length; i++)
        {
            if (arrPrice[i] < cost )
            {
                arrayList.add(arrName[i]);
            }
        }
        return arrayList;
    }
    boolean containsProduct(String name)
    {
        for (int i = 0; i < arrName.length;i++)
        {
            if (name.toLowerCase().contains(arrName[i].toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

    int findTheCheapest()
    {
        int min = arrPrice[0];
        for(int i = 0; i != arrPrice.length;i++)
        {
            if(min > arrPrice[i])
            {
                min = arrPrice[i];
            }
        }
        return min;
    }


}

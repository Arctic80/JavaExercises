import Model.FlowerShop;
import Model.MaterialType;


public class Main
{
    public static void main(String[] args)
    {
        FlowerShop flowerShop = new FlowerShop();

        try
        {
            flowerShop.addTree(66,3);
            flowerShop.addTree(45.67, 1);
            flowerShop.addTree(43.66, 1);

            flowerShop.addFlower(11.00, "White");
            flowerShop.addFlower(17.00, "Red");

            flowerShop.addDecoration(34.99, MaterialType.WOOD);
            flowerShop.addDecoration(19.99, MaterialType.PLASTIC);

            System.out.println(flowerShop.printStock());
        }
        catch (Exception e)
        {
            System.out.println("Error: Some price is either negative or zero");
        }
    }
}
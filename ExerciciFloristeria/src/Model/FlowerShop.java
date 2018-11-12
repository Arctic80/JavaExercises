package Model;

import java.util.ArrayList;
import java.util.List;


public class FlowerShop
{
    private List<Item> itemList = new ArrayList<>();

    public FlowerShop() {}

    public void addTree(double price, int altura) throws Exception
    {
        itemList.add(new Tree(price, altura));
    }

    public void addFlower(double price, String color) throws Exception
    {
        itemList.add(new Flower(price, color));
    }

    public void addDecoration(double price, MaterialType materialType) throws Exception
    {
        itemList.add(new Decoration(price, materialType));
    }

    public String printStock()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("STOCK: \n\n");

        sb.append(printTrees());
        sb.append(printFlowers());
        sb.append(printDecorations());

        return sb.toString();
    }

    private String printTrees()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("TREES: \n");

        for (Item item : itemList)
        {
            if (item instanceof Tree)
            {
                Tree tree = (Tree) item;
                sb.append(tree.toString());
            }
        }
        sb.append("\n");

        return sb.toString();
    }

    private String printFlowers()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("FLOWERS: \n");

        for (Item item : itemList)
        {
            if (item instanceof Flower)
            {
                Flower flower = (Flower) item;
                sb.append(flower.toString());
            }
        }
        sb.append("\n");

        return  sb.toString();
    }

    private String printDecorations()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("DECORATIONS: \n");

        for (Item item : itemList)
        {
            if (item instanceof Decoration)
            {
                Decoration decoration = (Decoration) item;
                sb.append(decoration.toString());
            }
        }
        sb.append("\n");

        return sb.toString();
    }
}
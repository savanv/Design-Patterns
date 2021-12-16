////////////////////////////////////////
//
//  Author: Savan Vyas
//
//  File name : OCP.java
//
//  Date: 8-12-2021
////////////////////////////////////////



public class OCP {
    enum Color {
        RED, GREEN, BLUE
    }

    enum Size {
        SMALL, LARGE, MEDIUM, YUGE
    }

    class Product {
        public String name;
        public Color color;
        public Size size;

        public Product(String name, Color color, Size size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }
    }

   /* class ProductFilter
    {
        public Stream<Product> fil
    }*/
}

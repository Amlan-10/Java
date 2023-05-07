import java.util.*;
public class exprac {
        private String name;
        public exprac(String n) {
            System.out.println("Parameterized Constructor");
            this.name = n;
        }
        public String getName() {
            return name;
        }
        public static void main(String[] args) {
            exprac d = new exprac("Java");
            System.out.println(d.getName());
        }

    }

package aula270820;

public class TesteCasa2 {
    
    public static void main(String[] args) {
        
        Casa c1, c2, c3,c4;

        c1 = new Casa();
        c4 = c1;
        c2 = new Casa();
        c3 = new Casa();
        
        c4.valor = 1000;
        c1.valor = 2000;

        System.out.println(c1.valor);
        System.out.println(c2.valor);
        System.out.println(c3.valor);
        System.out.println(c4.valor);




    }
}
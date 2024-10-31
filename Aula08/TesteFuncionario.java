public class TesteFuncionario {
    public static void main(String[] args) {
        Chefe c = new Chefe("joao", "silva", 3000);
        System.out.println(c);
        
        System.out.println(" ");
        
        Comissionado cm = new Comissionado("Arthur", "Sampaio", 2000, 500, 10);
        System.out.println(cm);

        System.out.println(" ");

        TrabalhadorProducao tp = new TrabalhadorProducao("Ricardo", "Amaral", 500, 10);
        System.out.println(tp);




    }
}

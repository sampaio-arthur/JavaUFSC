public class TesteEstudante {
    public static void main(String[] args) {
        Endereco e = new Endereco("Amaro José Pereira", 1);
        Estudante estudante = new Estudante("João", 123456, e);

        System.out.println(estudante);
    }
}

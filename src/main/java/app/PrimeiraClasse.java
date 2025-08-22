package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        al.setNome("Kazu");
        al.setIdade(19);

        System.out.println(al.getNome());
        System.out.println(al.getIdade());

        System.out.println("Olá Gradle!!!");
    }
}
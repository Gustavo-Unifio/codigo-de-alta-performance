package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        al.setNome("Kazu");
        al.setIdade(19);

        System.out.println(al.getNome());
        System.out.println(al.getIdade());

        System.out.println("Olá Gradle!!!");

        Tarefa t1 = new Tarefa();
        t1.setDescricao("Estudar Estruturas de Dados");
        t1.setConcluido(true);

        Tarefa t2 = t1;
        t2.setConcluido(false);
        
        System.out.println(t1.getDescricao());
        System.out.println(t1.isConcluido());

        Atividade[] objetos = new Atividade[3];

        objetos[0] = new Compromisso();
        objetos[1] = new Tarefa(); 
    }
}
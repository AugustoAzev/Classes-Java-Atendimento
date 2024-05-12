import java.util.Scanner;

public class Secretaria {
     String nome;
     int RG;

    public Paciente cadastrarPaciente(){
        System.out.println("[CADASTRO DE PACIENTE]");
        Scanner teclado = new Scanner(System.in);
        Paciente novoPaciente = new Paciente();
        System.out.println("Nome do paciente: ");
        novoPaciente.nomePaciente = teclado.nextLine();
        System.out.println("Crie a senha do paciente: ");
        novoPaciente.senha = teclado.nextInt();

        System.out.println("Cadastrado com sucesso!");
        return novoPaciente;
    }
    public Agenda agendarConsulta(Paciente paciente){
        System.out.println("[AGENDAMENTO DE CONSULTA]");
        Agenda agendamento = new Agenda();
        agendamento.nomePaciente = paciente.nomePaciente;
        agendamento.dia = "Segunda Feira"; //Faltando mÉtodo que automatiza

        System.out.println("Consulta agendada com sucesso!");
        return agendamento;
    }
    public Agenda alterarAgenda(Agenda agendamento){
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("[ALTERAR AGENDAMENTO] ");
        System.out.printf("Segunda - 1\nTerça - 2\nQuarta - 3\nQuinta - 4\nSexta - 5\nSábado - 6\n");
        opcao = teclado.nextInt();
        if (opcao == 1){
            agendamento.dia = "Segunda-Feira";
        }else if(opcao == 2){
            agendamento.dia = "Terça-Feira";
        }else if(opcao == 3){
            agendamento.dia = "Quarta-Feira";
        }else if(opcao == 4){
            agendamento.dia = "Quinta-Feira";
        }else if(opcao == 5){
            agendamento.dia = "Sexta-Feira";
        }else if(opcao == 6){
            agendamento.dia = "Sábado";
        }

        System.out.println("Agendamento realizado com sucesso... ");
        return agendamento;
    }
    /*
    public String gerarNome(){

    }
    public int gerarSenha(){

    }
    public void emiteRelatorio(){

    }
    public void confereAgenda(){

    }
    */
}

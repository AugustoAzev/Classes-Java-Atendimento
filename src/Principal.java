        /*
            Crie uma secretaria e cadastre um paciente e depois
            fazer uma consulta, depois fazer o mesmo com mais pacientes,
            Depois fazer agendamento, alterar e conferir o agendamento.
        */

        import java.util.Scanner;

        public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        //Criando uma secretaria
        Secretaria secretaria1 = new Secretaria();
        secretaria1.nome = "Maria";
        secretaria1.RG = 123456789;
        //Cadastrando um paciente
        System.out.println("Atendente ["+secretaria1.nome.toUpperCase()+"]");
        Paciente paciente1;
        paciente1 = secretaria1.cadastrarPaciente();
        //Consultado od dados do cliente cadastrado
        System.out.println(paciente1.nomePaciente);
        System.out.println(paciente1.senha);
        //Criando um agendamento
        Agenda agendamento1 = new Agenda();
        agendamento1 = secretaria1.agendarConsulta(paciente1);
        //Consultando agendamento
        System.out.println("Nome do paciente: "+agendamento1.nomePaciente);
        System.out.println("Dia do agendamento: "+agendamento1.dia);
        //Alterando um agendamento
        agendamento1 = secretaria1.alterarAgenda(agendamento1);
        //Consultando agendamento alterado
        System.out.println("Nome do paciente: "+agendamento1.nomePaciente);
        System.out.println("Dia do agendamento: "+agendamento1.dia);
    }
}
public class ProjectTicket {
    public static void main(String[] args) {
        //esta faltando o total e o balance
        TicketMachine tm01 = new TicketMachine(20);
        TicketMachine tm02 = new TicketMachine(30);

        tm01.getPrice();
        tm01.insertMoney(30);
        tm01.getBalance(); //o dinheiro que deve devolver

        tm02.getPrice();
        tm02.insertMoney(30);
        tm02.getBalance();

        tm01.printTicket();
        tm02.printTicket();

    }
}

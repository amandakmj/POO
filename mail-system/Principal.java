public class Principal {
    public static void main(String[] args) {
        // Criar um servidor de e-mails
        MailServer server = new MailServer();

        MailClient usuario1 = new MailClient(server, "usuario1");
        MailClient usuario2 = new MailClient(server, "usuario2");
        MailClient usuario3 = new MailClient(server, "usuario3");
        MailClient usuario4 = new MailClient(server, "usuario4");
        MailClient usuario5 = new MailClient(server, "usuario5");

        Message mensagem1 = new Message("Olá usuário 5, esta é a primeira mensagem de usuario1 para você.", "mensagem1.txt");
        usuario1.sendMailItem("usuario5", "mensagem1");

        Message mensagem2 = new Message("Olá usuário 5, esta é a segunda mensagem de usuario1 para você.", "mensagem2.txt");
        usuario1.sendMailItem("usuario5", "mensagem2");

        Message mensagem3 = new Message("Olá usuário 2, esta é a primeira mensagem de usuario4 para você.", "mensagem3.txt");
        usuario4.sendMailItem("usuario2", "mensagem3");

        Message mensagem4 = new Message("Olá usuário 2, esta é a segunda mensagem de usuario4 para você.", "mensagem4.txt");
        usuario4.sendMailItem("usuario2", "mensagem4");

        Message mensagem5 = new Message("Olá usuário 2, esta é a terceira mensagem de usuario4 para você.", "mensagem5.txt");
        usuario4.sendMailItem("usuario2", "mensagem5");

        Message mensagem6 = new Message("Olá usuário 3, esta é a primeira mensagem de usuario2 para você.", "mensagem6.txt");
        usuario2.sendMailItem("usuario3", "mensagem6");

        Message mensagem7 = new Message("Olá usuário 3, esta é a primeira mensagem de usuario5 para você.", "mensagem7.txt");
        usuario5.sendMailItem("usuario3", "mensagem7");
    
         //usuário 3 recebe as mensagens
         System.out.println("Usuário 3 tem " + usuario3.getNextMailItem() + " mensagens.");

         //usuário 2 recebe as mensagens
         System.out.println("Usuário 2 tem " + usuario2.getNextMailItem() + " mensagens.");
 
         //usuário 5 recebe as mensagens
         System.out.println("Usuário 5 tem " + usuario5.getNextMailItem() + " mensagens.");
    }
   
}

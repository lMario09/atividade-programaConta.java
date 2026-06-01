public class ProgramaConta {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        diretor.setNome("Luis");
        diretor.setSenha(1234);

        Gerente gerente = new Gerente();
        gerente.setNome("Maria");
        gerente.setSenha(4321);

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setSenha(5678);

        System.out.println("Diretor com senha correta: " + diretor.autenticar(1234));
        System.out.println("Diretor com senha incorreta: " + diretor.autenticar(1111));

        System.out.println("Gerente com senha correta: " + gerente.autenticar(4321));
        System.out.println("Gerente com senha incorreta: " + gerente.autenticar(2222));

        System.out.println("Cliente com senha correta: " + cliente.autenticar(5678));
        System.out.println("Cliente com senha incorreta: " + cliente.autenticar(3333));
}
}

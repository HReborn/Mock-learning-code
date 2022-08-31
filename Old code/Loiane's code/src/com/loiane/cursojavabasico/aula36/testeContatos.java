package com.loiane.cursojavabasico.aula36;

public class testeContatos {
    public static void main(String[] args) {
        Contato yann = new Contato();

        // criando o objeto da classe nome referente à classe contatos
        Nome nome = new Nome();
        nome.setPrimeiroNome("Yann ");
        nome.setSobrenome("Victor ");
        nome.setNomePais("Tavares Portela");

        // criando o array de objetos do número do contato
        Numero telefone1 = new Numero();
        telefone1.setDDD("81 ");
        telefone1.setNumero("99999-9999");
        telefone1.setPais("+55 ");

        Numero telefone2 = new Numero();
        telefone2.setDDD("59 ");
        telefone2.setNumero("88888-8888");
        telefone2.setPais("+55 ");

        Numero[] numeros = new Numero[2];
        numeros[0] = telefone1;
        numeros[1] = telefone2;

        // testando os getters and setters
        //yann.setNome("Yann Victor Tavares Portela");
        yann.setNome(nome);
        yann.setEndereco("Rua 1, Paulista, Nobre, Rua atrás da madereira leão.");
        //yann.setNumero("+55 81 99999-9999");
        yann.setNumeros(numeros);
        yann.setReferencia("Em 2010, quando me mudei. Tavam jogando bola e me convidaram.");


        // display das informações'
        if (yann != null && yann.getNome() != null) {
            System.out.println(yann.getNome().getPrimeiroNome() + yann.getNome().getSobrenome() + yann.getNome().getNomePais());
        }

        if (yann != null && yann.getNumeros() != null) {
            for (Numero tel : numeros) {
                System.out.println(tel.getPais() + tel.getDDD() + tel.getNumero());
            }
        }
        System.out.println(yann.getEndereco());
        System.out.println(yann.getReferencia());

    }
}

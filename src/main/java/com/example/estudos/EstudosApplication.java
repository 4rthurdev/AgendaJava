package com.example.estudos;

import com.example.estudos.entidades.Contato;
import com.example.estudos.repositorios.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EstudosApplication implements CommandLineRunner {
    @Autowired
    private ContatoRepository contatoRepository;

    @Override
    public void run(String... args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("---MENU-DE-OPÇOES---");
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Listar Contatos");
            System.out.println("3- Excluir Contato");
            System.out.println("4- Sair");
            System.out.print("-Digite sua opçao: ");
            int opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {
                System.out.println();
                System.out.println("Adicionar Contato");
                System.out.print("-Digite seu Nome: ");
                String nome = teclado.nextLine();
                System.out.print("-Digite seu Email: ");
                String email = teclado.nextLine();
                System.out.print("-Digite seu Telefone: ");
                String numero = teclado.nextLine();

                Contato novo = new Contato();
                novo.setNome(nome);
                novo.setEmail(email);
                novo.setNumero(numero);

                contatoRepository.save(novo);
                System.out.println("Cadastrado com Sucesso!");
                System.out.println();

            } else if (opcao == 2) {
                System.out.println();
                System.out.println("-Listagem de Contatos");

                long count = contatoRepository.count();

                if (count > 0) {
                    for (Contato c : contatoRepository.findAll()) {
                        System.out.println("Nome: " + c.getNome() + ", " + "Email: " + c.getEmail() + ", " + "Numero: " + c.getNumero());
                    }
                } else {
                    System.out.println("Nenhum contato cadastrado.");
                }
                System.out.println();

            } else if (opcao == 3) {
                System.out.println();
                System.out.println("Lista de Contatos: ");

                for (Contato c : contatoRepository.findAll()) {
                    System.out.println(c.getNome() + ", tem o ID " + c.getId());
                }

                System.out.println();
                System.out.print("Digite o ID do Contato que você deseja excluir: ");
                String idString = teclado.nextLine();
                Long idExcluir = Long.parseLong(idString);

                if (contatoRepository.existsById(idExcluir)) {
                    contatoRepository.deleteById(idExcluir);
                    System.out.println("Contato excluído com sucesso!");
                } else {
                    System.out.println("Contato não encontrado. Nenhum contato foi excluído.");
                }
                System.out.println();

            } else if (opcao == 4) {
                System.out.println();
                System.out.println("Obrigado por utilizar o sistema!");
                System.out.println();
                break;
            } else {
                System.out.println("Opçao inválida!");
            }
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(EstudosApplication.class, args);
    }

}

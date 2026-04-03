// package com.loiane.cursojavabasico.aula20;
// import java.util.Scanner;

// public class Q4e5agenda {
//     public static void main(String[] args) {

//         String[] menuPrincipal = {
//         "---------------------------------MENU---------------------------------",
//         "----------------------------------------------------------------------",
//         "----                                                              ----",
//         "---- Inserir novo compromisso                               Key 1 ----",
//         "----                                                              ----",
//         "---- Exibir os compromissos mais próximos                   Key 2 ----",
//         "----                                                              ----",
//         "---- Checar e/ou exibir compromissos                        Key 3 ----",
//         "----                                                              ----",
//         "---- Remover compromissos                                   Key 4 ----",
//         "----                                                              ----",
//         "---- Mudar ocasião de algum compromisso                     Key 5 ----",
//         "----                                                              ----",
//         "---- Sair da agenda                                         Key 6 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
        
//         String[] menuPrincipal_checarEOuExibir = {
//         "---------------------------------MENU---------------------------------",
//         "--------------------CHECAR E/OU EXIBIR COMPROMISSOS-------------------",
//         "----                                                              ----",
//         "---- Somente checar se há compromissos                      Key 1 ----",
//         "----                                                              ----",
//         "---- Exibir os compromissos                                 Key 2 ----",
//         "----                                                              ----",
//         "---- Voltar ao menu anterior                                Key 3 ----",
//         "----                                                              ----",
//         "---- Sair da agenda                                         Key 4 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
//         String[] menuPrincipal_checarEOuExibir_checar = {
//         "---------------------------------MENU---------------------------------",
//         "--------------------------CHECAR COMPROMISSOS-------------------------",
//         "----                                                              ----",
//         "---- Checar se determinada hora tem compromisso            Key 1  ----",
//         "----                                                              ----",
//         "---- Exibir o compromisso mais próximo                     Key 2  ----",
//         "----                                                              ----",
//         "---- Checar e/ou exibir compromissos                       Key 3  ----",
//         "----                                                              ----",
//         "---- Checar se determinado mês tem compromisso             Key 4  ----",
//         "----                                                              ----",
//         "---- Checar se determinada semana tem compromisso          Key 5  ----",
//         "----                                                              ----",
//         "---- Checar se determinado dia tem compromisso             Key 6  ----",
//         "----                                                              ----",
//         "----                                                       Key 7  ----",
//         "----                                                              ----",
//         "---- Remover um compromisso                                Key 8  ----",
//         "----                                                              ----",
//         "---- Deletar todos os compromissos de um dia               Key 9  ----",
//         "----                                                              ----",
//         "---- Mudar ocasião de algum compromiso                     Key 10 ----",
//         "----                                                              ----",
//         "---- Voltar ao menu anterior                               Key 11 ----",
//         "----                                                              ----",
//         "---- Sair da agenda                                         Key 4 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
//         String[] menuprincipal_checarEOuExibir_exibir = {
//         "---------------------------------MENU---------------------------------",
//         "--------------------------EXIBIR COMPROMISSOS-------------------------",
//         "----                                                              ----",
//         "---- Checar se determinada dia/hora tem compromisso        Key 1  ----",
//         "----                                                              ----",
//         "---- Exibir o compromisso mais próximo                     Key 2  ----",
//         "----                                                              ----",
//         "---- Checar e/ou exibir compromissos                       Key 3  ----",
//         "----                                                              ----",
//         "---- Checar se determinado mês tem compromisso             Key 4  ----",
//         "----                                                              ----",
//         "---- Checar se determinada semana tem compromisso          Key 5  ----",
//         "----                                                              ----",
//         "---- Checar se determinado dia tem compromisso             Key 6  ----",
//         "----                                                              ----",
//         "----                                                       Key 7  ----",
//         "----                                                              ----",
//         "---- Remover um compromisso                                Key 8  ----",
//         "----                                                              ----",
//         "---- Deletar todos os compromissos de um dia               Key 9  ----",
//         "----                                                              ----",
//         "---- Mudar ocasião de algum compromiso                     Key 10 ----",
//         "----                                                              ----",
//         "---- Voltar ao menu anterior                               Key 11 ----",
//         "----                                                              ----",
//         "---- Sair da agenda                                         Key 4 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
        
//         String[] menuPrincipal_removerCompromissos = {
//         "---------------------------------MENU---------------------------------",
//         "------------------------REMOVER COMPROMISSOS--------------------------",
//         "----                                                              ----",
//         "---- Inserir novo compromisso                              Key 1  ----",
//         "----                                                              ----",
//         "---- Exibir o compromisso mais próximo                     Key 2  ----",
//         "----                                                              ----",
//         "---- Checar e/ou exibir compromissos                       Key 3  ----",
//         "----                                                              ----",
//         "---- Checar se determinado mês tem compromisso             Key 4  ----",
//         "----                                                              ----",
//         "---- Checar se determinada semana tem compromisso          Key 5  ----",
//         "----                                                              ----",
//         "---- Checar se determinado dia tem compromisso             Key 6  ----",
//         "----                                                              ----",
//         "---- Checar se determinada dia/hora tem compromisso        Key 7  ----",
//         "----                                                              ----",
//         "---- Remover um compromisso                                Key 8  ----",
//         "----                                                              ----",
//         "---- Deletar todos os compromissos de um dia               Key 9  ----",
//         "----                                                              ----",
//         "---- Mudar ocasião de algum compromiso                     Key 10 ----",
//         "----                                                              ----",
//         "---- Voltar ao menu anterior                               Key 11 ----",
//         "----                                                              ----",
//         "---- Sair da agenda                                         Key 4 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
        
//         String[] menuPrincipal_inserirNovo = {
//         "---------------------------------MENU---------------------------------",
//         "----------------------INSERIR NOVO COMPROMISSO------------------------",
//         "----                                                              ----",
//         "---- Agendar uma ou mais horas                              Key 1 ----",
//         "---- Agendar um dia inteiro                                 Key 2 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };

//         String[] menuPrincipal_inserirNovo_agendarHora = {
//         "---------------------------------MENU---------------------------------",
//         "----------------------AGENDAR UMA OU MAIS HORAS-----------------------",
//         "----                                                              ----",
//         "---- Agendar uma ou mais horas                              Key 1 ----",
//         "---- Agendar um dia inteiro                                 Key 2 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };

//         String[] menuPrincipal_inserirNovo_agendarDia = {
//         "---------------------------------MENU---------------------------------",
//         "-----------------------AGENDAR UM DIA INTEIRO-------------------------",
//         "----                                                              ----",
//         "---- Agendar uma ou mais horas                              Key 1 ----",
//         "---- Agendar um dia inteiro                                 Key 2 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };

//         String[] menuPrincipal_exibirProximos = {
//         "---------------------------------MENU---------------------------------",
//         "----------------EXIBIR OS COMPROMISSOS MAIS PRÓXIMOS------------------",
//         "----                                                              ----",
//         "---- Para exibir o/os compromissos que estão mais próximos,       ----",
//         "---- Digite abaixo quantos compromissos deseja ver.               ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };

//         String[] menuPrincipal_mudarOcasiao = {
//         "---------------------------------MENU---------------------------------",
//         "-----------------MUDAR OCASIÃO DE ALGUM COMPROMISSO-------------------",
//         "----                                                              ----",
//         "---- Para remarcar algum compromisso,                             ----",
//         "---- Insira abaixo a data e hora de determinado compromisso.      ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
        
//         String[] returnToMenu = {
//         "---------------------------------MENU---------------------------------",
//         "----------------------------------------------------------------------",
//         "----                                                              ----",
//         "---- Sua ação foi completada. Digite abaixo uma                   ----",
//         "---- Key para selecionar alguma das opções abaixo.                ----",
//         "----                                                              ----",
//         "---- Retornar para o menu anterior                          Key 1 ----",
//         "---- Retornar para o menu principal                         Key 2 ----",
//         "---- Sair da agenda                                         Key 3 ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };

//         String[] menuExit = {
//         "---------------------------------MENU---------------------------------",
//         "----------------------------------------------------------------------",
//         "----                                                              ----",
//         "---- Obrigado por usar nossa agenda. Volte sempre.                ----",
//         "----                                                              ----",
//         "----------------------------------------------------------------------",
//         "----------------------------------------------------------------------",
//         };
        
//         System.out.println(""); // nova linha
        
        
//         System.out.println("Para escolher uma opção do menu, digite abaixo uma key válida.");
//         Scanner scan = new Scanner(System.in);
//         int mainMenuKey = scan.nextInt();
//         System.out.println(""); // nova linha

        

//         String[][][][] agendaMesesSemanasDiasHoras = new String[12][5][7][24];
        
//         scan.close();
//     }
// }
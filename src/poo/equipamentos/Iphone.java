package poo.equipamentos;

import poo.funcionalidades.IphoneFuncionalidades;

public class Iphone extends IphoneFuncionalidades{

    public static void main(String[] args) {
        
        IphoneFuncionalidades iphone = new IphoneFuncionalidades();

            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorreioVoz();


            iphone.atualizarPagina();
            iphone.adicionarNovaAba();
            iphone.exibirPagina();

            iphone.tocar();
            iphone.pausar();
            iphone.selecionarMusica();

    }
    
}

package poo.funcionalidades;

public class IphoneFuncionalidades implements ReprodutorMusical, NavegadorInternet, SistemaChamadas {

    //  Sistema Chamadas
        
        public void ligar(){
            System.out.println("Ligando...");
            verificarCredito();
            verificarArea();
        }

        public void atender(){
            System.out.println("Tocando...");            
        }
    
        public void iniciarCorreioVoz(){
            System.out.println("Iniciando correio de voz...");
            verificarCredito();
            verificarArea();
        }

    //   Navegador Internet

        public void exibirPagina(){
            System.out.println("Exibindo página");
            validarConexão();
        }

        public void adicionarNovaAba(){
            System.out.println("Adicionando aba");
            validarConexão();
        }

        public void atualizarPagina(){
            System.out.println("Atualizando aba");
            validarConexão();
        }

    //  Reprodutor Musical  

        public void tocar(){
            System.out.println("Tocando musica selecionada");
        }

        public void pausar(){
            System.out.println("Pausando musica");
        }
    
        public void selecionarMusica(){
            System.out.println("Selecionando musica");
        }

    //  Validadores de conexão !!  
        
        private void validarConexão(){
            System.out.println(" Validadando conexão");
        }

        private void verificarCredito(){
            System.out.println("Vereficando crédito");
        }

        private void verificarArea(){
            System.out.println("Verificando área");
        }
}

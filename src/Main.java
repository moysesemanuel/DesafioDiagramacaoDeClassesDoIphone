public class Main {
        public static void main(String[] args) {
                IPhone iphone = new IPhone();

                // Testando o reprodutor musical
                iphone.selecionarMusica();
                iphone.tocar();
                iphone.pausar();

                // Testando o aparelho telefônico
                iphone.ligar();
                iphone.atender();
                iphone.iniciarCorreioVoz();

                // Testando o navegador na internet
                iphone.exibirPagina();
                iphone.adicionarAba();
                iphone.atualizarPagina();
        }
}

public class Principal{
    public static void main(String[] args){
Filme meuFilme = new Filme();
meuFilme.nome = "Ainda estou aqui";
meuFilme.anodelancamento = 2024;
meuFilme.incluidonoplano = true;
meuFilme.duracaoemminutos = 127;
meuFilme.exibefichatecnica();
meuFilme.avalia(10);
meuFilme.avalia(10);
meuFilme.avalia(10);
//System.out.println(meuFilme.somadasavaliacoes);
//System.out.println(meuFilme.totaldeavaliacoes);
System.out.println(meuFilme.retornomedia());
System.out.println("Total de avaliações=> "+meuFilme.gettotaldeavaliacoes());
//System.out.println(meuFilme.nome);
//System.out.println(meuFilme.anodelancamento);    

    }
}

public class Filme{
    String nome;
    int anodelancamento;
    boolean incluidonoplano;
    double avaliacao;
    private int totaldeavaliacoes;
    int duracaoemminutos;
    private double somadasavaliacoes;
    



public void exibefichatecnica(){
System.out.println("Título=> "+nome);
System.out.println("Ano de Lançamento=> "+anodelancamento);
System.out.println("Duração em minutos=> "+duracaoemminutos);
System.out.println("Incluído no plano:"+incluidonoplano);
}
void avalia(double nota){
somadasavaliacoes += nota;
totaldeavaliacoes++;
}
double retornomedia(){
return somadasavaliacoes / totaldeavaliacoes;
}
int gettotaldeavaliacoes(){
return totaldeavaliacoes;
}
}
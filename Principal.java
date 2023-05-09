public class Principal {
    
    public static void main(String [] args) {
        Ingresso valor = new Ingresso(45.70f);
        IngressoVIP valorAdicional = new IngressoVIP(valor.getValor(), 50f);

        System.out.println(valor.toString());
        System.out.println(valorAdicional.toString());
    }
}

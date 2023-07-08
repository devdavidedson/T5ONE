public class TesteCalculadora {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 304051001);
        cc.setSaldo(500);

        SeguroDeVida sg = new SeguroDeVida();

        CalculadoraImposto calc = new CalculadoraImposto();
        calc.registra(cc);
        calc.registra(sg);

        System.out.println(calc.getTotalImposto());

    }

}

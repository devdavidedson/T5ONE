public class SwichCase {
    public static void main(String[] args) {

        int dia = 5;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda";
                break;
            case 3:
                nomeDia = "terça";
                break;
            case 4:
                nomeDia = "quarta";
                break;
            case 5:
                nomeDia = "quinta";
                break;
            case 6:
                nomeDia = "sexta";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia de número " + dia + " equivale a " + nomeDia);

    }
}

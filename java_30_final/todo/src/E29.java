import java.util.Scanner;

public class E29 {
    public static int c1 = 0, c2 = 0, c3 = 0, co = 0, counter, g, ve;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for(counter=1;counter<=160;counter++){
            System.out.print("Ingresa voto "+counter+": ");
            ve = scanner.nextInt();
            switch (ve) {
                case 1:
                    c1+=1;
                    break;
                case 2:
                    c2+=1;
                    break;
                case 3:
                    c3+=1;
                    break;
                default:
                    co+=1;
                    break;
            }
        }
        if(c1>c2 && c1>c3 && c1>co){
            g=c1;
            System.out.println("el ganador con "+g+" votos es el candidato 1");
        }
        else if(c2>c1 && c2>c3 && c2>co){
            g=c2;
            System.out.println("el ganador con "+g+" votos es el candidato 2");
        }
        else if(c3>c1 && c3>c2 && c3>co){
            g=c3;
            System.out.println("el ganador con "+g+" votos es el candidato 3");
        }
        else{
            System.out.println("ningun candidato fue elegido");
        }

    }
}

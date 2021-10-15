import java.util.Scanner;

public class JavaBasic2 {
    

    public static void main(String[] args){
        int number;
        
        Scanner skor = new Scanner(System.in);
        
        System.out.println("Masukkan nilai:,");
        number = skor.nextInt();

        if (number>=101){
            System.out.println("invalid number");
        } else if(number>=91){
            System.out.println("Nilai: A");
        } else if (number>=76){
            System.out.println("Nilai: B");
        } else if (number>=51){
            System.out.println("Nilai: C");
        } else if (number>=26) {
            System.out.println("Nilai: D");
        } else if (number>=0){
            System.out.println("Nilai E");
        }
        System.out.println("SELESAI");
        skor.close();

        }
            
    
            }
    
        
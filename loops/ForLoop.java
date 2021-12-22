package loops;

public class ForLoop {
    public static void main(String[] args){
        
        for(int i = 0; i <= 12; i++){
            if(i < 1)
                continue;
            
            System.out.println(i*13);
        }
    }
}

public class main {
    public static void main(String[] args) {
        
                // Your code here!
                // int z = (int)(Math.random() * 11);
                  int y = LETUNG.inputNumber();
                Tung(y);

               

    }
            //function01
            public static void function01(){
                //  for (int a = 0; a < z ; a++) {
                    
                    for( int i= 0 ;i <=2;i++ ){  
                        for (int j = 0; j <= 2; j++) {
                            if ((i == 1)&&( j==1 ) ) {
                                
                                System.out.print("○");
                            }else{

                                System.out.print("■");
                            }
                        }  
                             System.out.println("");
                       } 
                    //    System.out.println("");
                //  }
                
    }

            //function02
             public static void function02(){
                // for (int a = 0; a < z ; a++) {
                    
                    for( int i= 0 ;i <2;i++ ){  
                        for (int j = 0; j < 3; j++) {
                            if ((i==0)&&(j==0)) {                      
                                System.out.print("○");
                            }else if((i==0)&&(j==2)){
                                System.out.print("");
                            
                            }else{
        
                                System.out.print("●");
                            }
                        }  
                        System.out.println("");
                      } 
                    //   System.out.println("");
                // }
                
        } 
            //function03
            public static void Tung(int z){
                for (int a = 0; a < z ; a++) {
                    function02();
                    function01();
                }
                
}
}    

     

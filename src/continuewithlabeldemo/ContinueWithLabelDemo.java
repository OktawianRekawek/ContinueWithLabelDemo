/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuewithlabeldemo;

/**
 *
 * @author Oktawian
 */
public class ContinueWithLabelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String searchMe = "Nauka programowania idzie mi calkiem niezle, ale jeszcze duzo pracy przede mna.";
        String substring = "program";
        boolean foundIt = false;
        
        int max = searchMe.length()-substring.length();
        
        test:
            for(int i = 0; i <= max; i++){
                int n = substring.length();
                int j = i;
                int k = 0;
                while(n-- != 0){
                    if(searchMe.charAt(j++) != substring.charAt(k++)){
                        continue test;
                    }
                }
                foundIt = true;
                break test;
            }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
    
}

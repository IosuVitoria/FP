
// Dado un array de 3 de longitud diseña un algoritmo que intercambie el primer dígito por el

import java.util.Arrays;

public class ejercicio7 {
    
    public static void main(String[] args) {
        
        int[] num1 = {1, 2, 3};
        int[] num2 = {5, 11, 9};
        int[] num3 = {7, 0, 0};

        rotateLeft3(num1);
        rotateLeft3(num2);
        rotateLeft3(num3);
    }
    
    public static void rotateLeft3(int[] nums) {
         
        int last = nums[0];
        int first =  nums[nums.length - 1];

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                nums[i] = first;
            }
            if(i == 2){
                nums[i] = last;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

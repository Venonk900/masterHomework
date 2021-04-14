package lesson3;

import java.util.Arrays;

public class ArrayStudy {

    public static void main(String[] args) {

        //definition
        int arrayint[] = new int[10];
        String arrayString[] = new String[20];
        boolean arrayB[] = {true, false};
        int ai[] = {1,2,3};

        Arrays.fill(arrayint, 10);
        Arrays.fill(arrayString, "10");


        for (int i = 0; i < arrayint.length; i++) {
                arrayint[i] = i+1;
        }

       String stringRepresentation =  Arrays.toString(arrayint);


        int dda[][] = new int[4][4];

        System.out.println("dda[0]= " + Arrays.toString(dda[0]));

        //Заполним данными от 1 до 16
        int index = 1;
       for (int i =0; i< dda.length; i++) {
           for(int j = 0; j< dda[i].length; j++) {
               dda[i][j] = index;
               index++;
           }
       }

        for (int i=0; i<dda.length; i++) {

            //System.out.println(i + " " + Arrays.toString(dda[i]));
        }



        int doubleMas[][] = new int[4][];


        for (int i=0; i< doubleMas.length; i++) {
            doubleMas[i] = new int[2+i];
            System.out.println(Arrays.toString(doubleMas[i]));
        }
        index = 1;
        for (int i =0; i< doubleMas.length; i++) {
            for (int j = 0; j < doubleMas[i].length; j++) {
                doubleMas[i][j] = index;
                index++;
            }
        }
        for (int i=0; i< doubleMas.length; i++) {
            System.out.println(Arrays.toString(doubleMas[i]));
        }




    }


}

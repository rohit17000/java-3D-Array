package com.internshala;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][][] array = {
                {{1,2,3},{4,5,6}},
                {{7,8,9},{10,11,12}}
        };
        for(int i =0; i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    System.out.println(array[i][j][k]);
                }
                System.out.println();
            }
        }


    }

}

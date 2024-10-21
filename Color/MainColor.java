package C.Color;

import java.util.ArrayList;

public class MainColor {
    public static void main(String[] args) {
        int Size = 4;
        int [][] myMatrix = new int[Size][Size];
        //create the matrix a[i][i] = i+j
        for(int i = 0; i < Size; i++){
            for(int j = 0; j < Size; j++){
                myMatrix[i][j] = i+j;
            }
        }
        for(int i = 0; i < myMatrix.length; i++){
            for(int j = 0; j < myMatrix[i].length; j++){
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //dynamic array
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        for(String e:colors){
            System.out.println(e);
        }
        for(int i = 0; i < colors.size(); i++){
            String color = colors.get(i);
            if(color.equals("Red")){
                colors.set(i, "red");
            }
        }

    }
}

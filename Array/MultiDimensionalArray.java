class MultiDimensionalArray{
    public static void main(String[] args){
        int[][] arrStaticMD = { {1,2,3},
                                {4,5,6},
                                {7,8,9}
                            };
        for(int[] arr : arrStaticMD){
            for(int e: arr)
                System.out.print(e+" ");
            System.out.println();
        }

        int[][] arrMulitD =  new int[3][4];
        
        for(int i=0; i<arrMulitD.length; ++i){
            for(int j=0; j<arrMulitD[i].length; ++j){
                arrMulitD[i][j] = (int)(Math.random()*100);
                System.out.println(arrMulitD[i][j]);
            }
        }

        for(int[] elements: arrMulitD){
            for(int e: elements)
                System.out.print(e+"  ");
            System.out.println();
        }
    }
}
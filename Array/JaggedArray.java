class JaggedArray{
    public static void main(String[] args){
        // Jagged array in java
        int[][] arrStaticJagged = {
            {1, 2, 3, 4},
            {10, 20, 30},
            {100, 200}
        };

        for(int[] elements : arrStaticJagged){
            for(int e : elements)
                System.out.print(e+" ");
            System.out.println();
        }

        int[][] arrDyanamicJagged = new int[3][];

        arrDyanamicJagged[0] = new int[3];
        arrDyanamicJagged[1] = new int[2];
        arrDyanamicJagged[2] = new int[4];

        for(int i=0; i<arrDyanamicJagged.length; ++i){
            for(int j=0; j<arrDyanamicJagged[i].length; ++j){
                arrDyanamicJagged[i][j] = (int)(Math.random()*10);
                System.out.println(arrDyanamicJagged[i][j]+" ");
            }
        }

        for(int[] elements : arrDyanamicJagged){
            for(int e : elements)
                System.out.print(e+" ");
            System.out.println();
        }
    }
}
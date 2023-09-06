 public static int Swap(){
         int data[]={2,3,4,5,6,7,8,9};
        int index=0;
        for (int i = 0; i < data.length; i++) {
            if (i%2==0) {
                int temp=data[i];
                data[i]=data[index];
                data[index]=temp;
                index++;
               
            }
            
        }
        for (int i = 0; i <data.length; i++) {
            System.out.print(data[i]+",");
        }
        return 0;
    }
package Arrays;

public class Rotate1Place {
        public static void onerotate(int []a)
        {
            int temp=a[0];
            for(int i=1;i<a.length;i++){
                a[i-1]=a[i];
            }
            a[a.length-1]=temp;

        }

        public static void main(String [] arg){
            int []a={1,2,3,4,5};
            onerotate(a);
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]+" ");

            }

        }
    }



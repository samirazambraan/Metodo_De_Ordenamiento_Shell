public class metodoShell{
    public static void main(String[]args){

        //generamos un arreglo de 10 y lo llenamos
        int[] arreglo=new int[10];
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]=(int)(Math.random()*100);//llenado con numeros de 0 al 100
        }

        //En esta parte llamamos al Shell
        Shell(arreglo);
        for(int i=0;i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]->");
        }
    }
    

    //Generamos un metodo para Shell
    public static void Shell(int[]arreglo){
        int salto=0, temp=0, i=0;//declaramos las variables
        boolean cambio;
        for(salto=arreglo.length/2;salto!=0;salto/=2){
            cambio=true;
            while(cambio){
                cambio=false;
                for(i=salto;i<arreglo.length;i++){
                    if(arreglo[i-salto]>arreglo[i]){
                        temp=arreglo[i]; //en temporal guardamos la posicion del arreglo i
                        arreglo[i]= arreglo[i-salto];
                        arreglo[i-salto]=temp;
                        cambio=true;
                    }
                }
            }
        }
    }

       
}
    
   
 


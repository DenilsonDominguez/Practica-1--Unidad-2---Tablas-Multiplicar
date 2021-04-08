
public class TablaMultiplicar {

    TablaMultiplicar() {
        
    }

    public String TM(int n,int i) {
        String cad="";
        
        if(i==0){ return n+" x "+0+" = 0"+"\n";
      }else{
            int cont;
            cont=i;
            int res=0;
            for(int r=0;r<cont;r++){res+=n;    }
            return TM(n, i-1)+n+" x "+cont+" = "+(res)+"\n";
           } 

      
    }
     
    
}

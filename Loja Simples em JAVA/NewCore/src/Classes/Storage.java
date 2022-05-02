
package Classes;

import Telas.AreadeVendas;
import static Telas.AreadeVendas.INTE;
import static Telas.AreadeVendas.J;
import static Telas.AreadeVendas.comprado;
import static Telas.AreadeVendas.dfpreço;
import static Telas.AreadeVendas.listCar;
import static Telas.AreadeVendas.nomes;
import static Telas.AreadeVendas.preco;
import static Telas.AreadeVendas.qtd;
import static Telas.AreadeVendas.quant;
import static Telas.AreadeVendas.single;
import static Telas.AreadeVendas.singlep;
import static Telas.AreadeVendas.singlev;
import static Telas.ZonadePagamento.parc;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Storage {
    
    public Storage(){
        
    }


    public void fileNomes(int n, String[] v){
        
        String[] auxn = new String[n];
        
        System.arraycopy(nomes, 0, auxn, 0, nomes.length);
        
        nomes = new String[n];
        
        System.arraycopy(auxn, 0, nomes, 0, auxn.length);
        System.arraycopy(v, 0, nomes, 0, v.length);
    }
    
    public void filePrices(int n, double[] v){
        
        double[] auxp = new double[n];
        System.arraycopy(preco, 0, auxp, 0, preco.length);
        preco = new double[n];       
       
        System.arraycopy(auxp, 0, preco, 0, auxp.length);
        
        System.arraycopy(v, 0, preco, 0, v.length);
    }
    
    public void fileSingle(int n){
        
        String[] auxs = new String[n];
        
        for(int cc = 0;cc < single.length;cc++){
            
            if(single.length <= auxs.length){
                auxs[cc] = single[cc];
            }
            
        }
        
        single = new String[n];
        
        for(int cc  = 0;cc < auxs.length;cc++){
                       
            single[cc] = auxs[cc];
            
        }
        
    }
    
    public void fileSinglep(int n){
        
        String[] auxp = new String[n];
        
        for(int cc = 0;cc < singlep.length;cc++){
               
            if(singlep.length <= auxp.length){   
            
                auxp[cc] = singlep[cc];           
            }
        }
        
        singlep = new String[n];
        
        System.arraycopy(auxp, 0, singlep, 0, auxp.length);
        
    }
    
    public void fileJ(int n){
       
        String[] auxq = new String[n];
        
        for(int cc = 0;cc < J.length;cc++){
                
            if(J.length <= auxq.length){               
            
                auxq[cc] = J[cc];
            }          
        }
        
        J = new String[n];
        
        for(int cc  = 0;cc < auxq.length;cc++){
            
            J[cc] = auxq[cc];
            
        }
        
    }
    public void fileQuant(int n, double[] v){
               
        double[] auxq = new double[n];    
        
        for(int cc  = 0;cc < quant.length;cc++){
            
            if(quant.length <= auxq.length){   
                auxq[cc] = quant[cc];
            }
        }
        quant = new double[n];
        
        System.arraycopy(auxq, 0, quant, 0, auxq.length);
        
        System.arraycopy(quant, 0, quant, 0, quant.length);
        
       
    }
   
    
    public void fileJotinha(int n, String[] J){
        
        String[] auxJ = new String[n];
        
        System.arraycopy(AreadeVendas.J, 0, auxJ, 0, AreadeVendas.J.length);
        
        AreadeVendas.J = new String[n];
        
        System.arraycopy(auxJ, 0, AreadeVendas.J, 0, auxJ.length);
        
    }
    
    public void fileSingleV(int n, String[] J){
        
        String[] auxSinglev = new String[n];
        
        System.arraycopy(J, 0, auxSinglev, 0, AreadeVendas.singlev.length);
        
        AreadeVendas.singlev = new String[n];
        
        System.arraycopy(auxSinglev, 0, AreadeVendas.singlev, 0, auxSinglev.length);
        
    }
   
    public void fileComprado(int n, boolean[] comp){
        
        boolean[] auxcomp = new boolean[n];
        
        System.arraycopy(AreadeVendas.comprado, 0, auxcomp, 0, AreadeVendas.comprado.length);
        
        AreadeVendas.comprado = new boolean[n];
        
        System.arraycopy(auxcomp, 0, AreadeVendas.comprado, 0, auxcomp.length);
        
        System.arraycopy(AreadeVendas.comprado, 0,AreadeVendas.comprado, 0, AreadeVendas.comprado.length);
        
        
    }   
    
    public void removeFileName(int n, String[] v, int r){
             
        String[] auxn = new String[n]; 
        for(int cc = 0; cc < v.length;cc++){
            
            if(cc == r){                
                continue;
            }else{
                auxn[cc] = v[cc];
            }
            
        }
        nomes = new String[n];
        for(int cc = 0;cc < auxn.length;cc++){
            
           nomes[cc] = auxn[cc]; 
            
        }
        
    }

    public void removeFilePrice(int n, double[] v, int r){
        
        double[] auxp = new double[n]; 
        for(int cc = 0; cc < v.length;cc++){
            
            if(cc == r){                
                continue;
            }else{
                auxp[cc] = v[cc];
            }
            
        }
        preco = new double[n];
        for(int cc = 0;cc < auxp.length;cc++){
            
           preco[cc] = auxp[cc]; 
            
        }
        
    }
       
    
    public void removeFileQuant(int n,double[] v,int r){
        
        double[] auxq = new double[n];
        
        for(int cc = 0;cc < v.length;cc++){
            
          
                auxq[cc] = v[cc]; 
            
        }
        
        quant = new double[n];
        
        for(int cc = 0;cc < auxq.length;cc++){
                      
                quant[cc] = auxq[cc];
            
        }
        
    }
    
     public void removeJotinha(int n, String[] J){
        
        String[] auxJ = new String[n];
        
        AreadeVendas.J = new String[n];
                
    }
    
    public void removeSingleV(int n, String[] J){
        
        String[] auxSinglev = new String[n];
                 
        AreadeVendas.singlev = new String[n];
              
    }
    
    public void removeCarrinho(int n){
               
        String[] auxs = new String[n];
        
        for(int cc = 0;cc < single.length;cc++){
            
           
                auxs[cc] = single[cc];
            
        }
        
        single = new String[n];
        
        for(int cc  = 0;cc < auxs.length;cc++){
                        
            single[cc] = auxs[cc];
           
        }
        
        String[] auxp = new String[n];
        
        for(int cc = 0;cc < singlep.length;cc++){
            
            
                auxp[cc] = singlep[cc];
            
            
        }
        
        singlep = new String[n];
        
        System.arraycopy(auxp, 0, singlep, 0, auxp.length);
        
       String[] auxq = new String[n];
        
        for(int cc = 0;cc < J.length;cc++){
            
           
                auxq[cc] = J[cc];
            
            
        }
        
        J = new String[n];
        
        for(int cc  = 0;cc < auxq.length;cc++){
            
            J[cc] = auxq[cc];
            
        }
     
          int[] auxi = new int[n];
        
        for(int cc = 0;cc < INTE.length;cc++){
            
           if(INTE.length <= auxi.length){             
            
                auxi[cc] = INTE[cc];
           }
            
        }
        
        INTE = new int[n];
        
        for(int cc  = 0;cc < auxi.length;cc++){
            
            INTE[cc] = auxi[cc];
            
        }
        
         String[] auxpv = new String[n];
        
        for(int cc = 0;cc < singlev.length;cc++){
            
            if(singlev.length <= auxpv.length){
               
                auxpv[cc] = singlev[cc];
            }            
        }
        
        singlev = new String[n];
        
        System.arraycopy(auxp, 0, singlev, 0, auxpv.length);
        
         boolean[] auxc = new boolean[n];
        
        for(int cc = 0;cc < parc.length;cc++){
            
           if(parc.length <= auxc.length){
               
                auxc[cc] = parc[cc];
           } 
        }
        
        parc = new boolean[n];
        
        for(int cc  = 0;cc < auxc.length;cc++){
                        
            parc[cc] = auxc[cc];
           
        }
    }
    
    public void FileComprado(int n){
        
        boolean[] auxc = new boolean[n];
        
        for(int cc = 0;cc < parc.length;cc++){
            
           if(comprado.length <= auxc.length){
                 
                auxc[cc] = comprado[cc];
               
           } 
        }
        
        comprado = new boolean[n];
        
        for(int cc  = 0;cc < auxc.length;cc++){
                        
            comprado[cc] = auxc[cc];
           
        }
        
    }
    
    public void removeFileComprado(int n, int s){
        
        boolean[] auxc = new boolean[n];
        
        for(int cc = 0;cc < parc.length;cc++){
            
           if(comprado.length <= auxc.length){
                
               if(cc != s){
                auxc[cc] = comprado[cc];
               }
           } 
        }
        
        comprado = new boolean[n];
        
        for(int cc  = 0;cc < auxc.length;cc++){
                        
            comprado[cc] = auxc[cc];
           
        }
        
    }
}


package uni.sistemas.model;

import uni.sistemas.entity.Operaciones;

public class OperacionesModel {
    //constructor
    public OperacionesModel() {
    }
    //metodo para comparar resultados
    public String compararNum(double x , double y){
        if(x==y){
            return "FELICITACIONES ES CORRECTO";
        }else{
            return "INTENTA CON OTRO RESULTADO";
        }
        
    }
    //metodo para procesar operaciones
    public void procesarSuma(Operaciones op){
        //calcular suma y encapsular
        op.setSuma(op.getN1()+op.getN2());
        
    }
    public void procesarResta(Operaciones op){
        //calcular resta y encapsular
        op.setRestado(op.getN1()-op.getN2());
        
    }
    public void procesarDivision(Operaciones op){
        //calcular division y encapsular
        op.setDiv(op.getN1()/op.getN2());
        
    }
    public void procesarMultiplicacion(Operaciones op){
        //calcular multiplicacion y encapsular
        op.setMulti(op.getN1()*op.getN2());
    }
    
    
    
    
}

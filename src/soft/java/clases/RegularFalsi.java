
package soft.java.clases;

// aca vamos a utilizar la funcion abstracta como parametro, para calcular la raiz
public class RegularFalsi {
    
    //parametros requeridos para el metodo de raiz
    public double raiz(FuntionRulerFalsi f, double xi, double xu, int numIteraciones, double errorMin) {
        
        double r =  Double.NaN;
        double ejeX = xi; 
        int iterar = 0;
        
        //ciclo repetitivo, revisa que se cumpla el criterio de convergencia
        while(Math.abs(f.eval(ejeX)) > errorMin && iterar < numIteraciones){
            // Formula
            ejeX =  (xi * f.eval(xu) - xu * f.eval(xi)) / (f.eval(xu) - f.eval(xi));
            // verificar en donde esta la raiz
            if(f.eval(xi) * f.eval(ejeX) < 0 ) {
                xu = ejeX;
            }else {
                xi = ejeX;
            }
            iterar++;
        }
        
        if(iterar < numIteraciones){
            r = ejeX;
        }
    return r;
    }
    
}

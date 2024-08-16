/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

     public static  int Calcular_saldo (int base, int recaudo, int retiros){
        try {
            int base_permitida=2000000;
            int saldo_de_taquilla;
            
            if (base == base_permitida){
                saldo_de_taquilla=base+ recaudo-retiros;
                return saldo_de_taquilla;
            }else{
                return -1;
            }
        }
        catch (Exception e) {
            return -1;
        }
     }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float valor_consumo){
        try {
            final float propina=(float) 0.1;
            final float impuesto_consumo=(float) 0.08;
            float propina_valor=(float)(valor_consumo*propina);
            float impuesto_consumo_valor=(float)(valor_consumo*impuesto_consumo);
            float total_pagar= (float)(propina_valor+impuesto_consumo_valor*valor_consumo);
            String info_consumo="";

            if(valor_consumo<0){
                return "Error calculando consumo";
            }
            else{
                info_consumo="valor comida: " + valor_consumo + " - valor propina " + propina_valor + " - valor impoconsumo "+ impuesto_consumo_valor + " - total a pagar " + total_pagar;
                return info_consumo;
            }
            

        } catch (Exception e) {
            return "Error en la funcion Calcular_tip";
        }
    }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

    
     public static int  Obtener_puntos(int ganados, int perdidos, int empatados){
        try {
            int partidos_jugados =ganados+perdidos+empatados;
            int puntos_partido_ganado=3;
            int puntos_partido_empatado=1;
            int puntos_partido_perdido=0;
            int puntos_totales=(ganados*puntos_partido_ganado)+(empatados*puntos_partido_empatado)+(perdidos*puntos_partido_perdido);


            if(partidos_jugados<=0){
                return -1;
            }
            else{
                return puntos_totales;
            }

          
        } catch (Exception e) {
            return -1;
        }
     }


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_definitiva (float nota1,float nota2, float nota3,float nota4,float nota5,float porcentaje1,float porcentaje2, float porcentaje3,float porcentaje4,float porcentaje5){
        try {
            final int nota_max =5;
            final int nota_min =0;

            float nota1_final= nota1 *porcentaje1;
            float nota2_final= nota2 *porcentaje2;
            float nota3_final= nota3 *porcentaje3;
            float nota4_final= nota4 *porcentaje4;
            float nota5_final= nota5 *porcentaje5;
            float nota_final=nota1_final+nota2_final+nota3_final+nota4_final+nota5_final;
            double suma_porcentajes=porcentaje1+porcentaje2+porcentaje3+porcentaje4+porcentaje5;


            if(suma_porcentajes==1 && (nota1>=nota_min && nota1<=nota_max && nota2>=nota_min && nota2<=nota_max && nota3>=nota_min && nota3<=nota_max && nota4>=nota_min && nota4<=nota_max && nota5>=nota_min && nota5<=nota_max)){
                return nota_final;
            }
            else{
                return -1;
            }            
        }
        catch (Exception e) {
           return -1;
        }
    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_salario(int hora_normal_laborada, int horas_extras_diurnas_laboradas,int horas_extras_nocturnas_laboradas,float valor_hora_normal){
        try{
            float salario_total;
            final float recargo_extra_diurno=(float)0.15;
            final float recargo_extra_nocturno=(float)0.35;
            float valor_extra_diurno=(float)(valor_hora_normal+(valor_hora_normal*recargo_extra_diurno));
            float valor_extra_nocturno=(float)(valor_hora_normal+(valor_hora_normal*recargo_extra_nocturno));

            float pago_hora_normal_laborada=(float)(hora_normal_laborada*valor_hora_normal);
            float pago_extra_diurno_laborado=(float)(horas_extras_diurnas_laboradas*valor_extra_diurno);
            float pago_extra_nocturno_laborado=(float)(horas_extras_nocturnas_laboradas*valor_extra_nocturno);
            

            if(valor_hora_normal>0){

                salario_total=(float)(pago_extra_diurno_laborado+pago_hora_normal_laborada+pago_extra_nocturno_laborado);
                return salario_total;


            }else{
                return -1;
            }

        }
        catch(Exception e){
            return -1;
        }



     }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_area_triangulo(float base,float altura){
        try {
            float area_triangulo=(float)(0.5*base*altura);

            if(base>0 && altura>0){
                return area_triangulo;

            }else{
                return -1;
            }
            
        }
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_perimetro_cuadrado(float lado_cuadrado){
        try {
            final int nro_lados=4;
            float perimetro =(float)(lado_cuadrado*nro_lados);
            
            
            if(lado_cuadrado>0){
                return perimetro;
            }
            else{
                return -1;
            }
        }
        catch (Exception e) {
            return -1;
        }
     }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_volumen_cilindro(float radio_base, float altura){
        try {
            final  double pi=3.1415927;
            float volumen=(float)(pi*(radio_base*radio_base)*altura);

            if(radio_base>0 && altura>0){
                return volumen;
            }
            else{
                return -1;
            }
        }
        catch (Exception e) {
            return -1;
            
        }
     }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_area_circulo(float radio_circulo){
        try {
            final  double pi=3.1415927;
            float area_circulo=(float)(pi*radio_circulo*radio_circulo);
        
            if(radio_circulo>0){
                return area_circulo;

            }
            else{
                return -1;
            }    
        }
        catch (Exception e) {
            return -1;
        }

     }



}

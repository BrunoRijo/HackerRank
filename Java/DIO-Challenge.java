/* 
 - Desafio
Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos é par. A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.

 - Entrada
Como entrada você recerá um valor inteiro e positivo

 - Saída
Como saída, será impresso a soma de todos os numeros inteiros positivos menores ou iguais ao num, como nos exemplos a baixo: 
Entrada: 30 | Saída : 14

 - Explicação
Os 14 inteiros menores ou iguais a 30 cujas somas de dígitos são pares são:
[ 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26 e 28 ].
*/

import java.util.*;
 
public class DIO
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (var i = 1; i <= num ; i++)
        {
            var strNum = String.valueOf(i);
            if (strNum.length() ==  1)
            {
                if (i %  2   ==  0   )
                {
                    count++;
                }
                continue;
            }
                  
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j < vs.length ; j++)
            {
                sum += (int)Character.getNumericValue(vs[j]);
            }
            if (sum %  2   ==  0 )
            {
                count++;
            }
        }
        System.out.println(  count   );
    }
}

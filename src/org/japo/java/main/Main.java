/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH);

    public static void main(String[] args) {

        //variables
        int diasDemora;
        double descuentoImp = 0;
        double importeFM;

        //Constantes
        final int DiasLimit = 30;
        final double ImporteM = 60;
        final double PorcentajeD = 20;

        //Mensaje de inicio
        System.out.printf("Alternativa de Multa %n====================%n");
        try {
            System.out.print("Días de demora ...........: ");
            diasDemora = SCN.nextInt();
            System.out.println("---");

            System.out.printf(Locale.ENGLISH, "Importe inicial multa ....: %.2f €%n", ImporteM);
            System.out.println("---");

            System.out.printf("Plazo con descuento ......: %d días%n", DiasLimit);
            System.out.printf(Locale.ENGLISH, "Tanto descuento ..........: %d %%%n", (int) PorcentajeD);

            if (diasDemora <= DiasLimit) {
                descuentoImp = ImporteM * (PorcentajeD / 100);
            }
            if (diasDemora >= DiasLimit) {
                descuentoImp = 0;
            } else {
                System.out.println("ERROR: Entrada incorrecta");
            }

            System.out.printf(Locale.ENGLISH, "Importe descuento ........: %.0f €%n", descuentoImp);
            System.out.println("---");

            importeFM = ImporteM - descuentoImp;
            System.out.printf(Locale.ENGLISH, "Importe final multa ......: %.2f €%n", importeFM);

        } catch (Exception e) {
            System.out.println("ERROR: Entrada incorrecta");
        }

    }
}

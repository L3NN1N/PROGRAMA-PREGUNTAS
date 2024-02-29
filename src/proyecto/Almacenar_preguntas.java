/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Sabri
 */
public class Almacenar_preguntas {
  
    String[] preguntasArte = {
            "¿Quién pintó la Mona Lisa?", 
            "¿Cuál es el periodo del impresionismo?", 
            "Nombre de una obra de Picasso.",
            "¿En qué año nació Vincent van Gogh?",
            "¿Quién es conocido como el padre del Renacimiento?",
            "¿Cuál es el material tradicional de las esculturas?",
            "¿Qué movimiento artístico incluye a Dalí y Magritte?",
            "¿Dónde se encuentra la Capilla Sixtina?",
            "¿Cuál es la pintura más famosa de Gustav Klimt?",
            "¿Cuál es el nombre completo de Diego Rivera?"
        };

        String[] respuestasArte = {
            "Leonardo da Vinci", 
            "Siglo XIX", 
            "Guernica",
            "1853",
            "Leonardo da Vinci",
            "Mármol",
            "Surrealismo",
            "Ciudad del Vaticano",
            "El Beso",
            "Diego María de la Concepción Juan Nepomuceno Estanislao de la Rivera y Barrientos Acosta y Rodríguez"
        };

        String[] preguntasGeografia = {
            "Capital de Francia", 
            "Río más largo del mundo", 
            "País con mayor población",
            "¿En qué continente se encuentra Australia?",
            "¿Cuál es la montaña más alta del mundo?",
            "¿Cuál es la capital de Canadá?",
            "¿Cuántos océanos hay en la Tierra?",
            "¿Cuál es el país más grande en términos de superficie?",
            "¿Cuál es la ciudad más poblada del mundo?",
            "¿En qué país se encuentra el Monte Kilimanjaro?"
        };

        String[] respuestasGeografia = {
            "París", 
            "Amazonas", 
            "China",
            "Oceanía",
            "Monte Everest",
            "Ottawa",
            "Cinco",
            "Rusia",
            "Tokio",
            "Tanzania"
        };

        String[] preguntasBiologia = {
            "¿Qué es la mitosis?", 
            "Nombre de un órgano humano no vital", 
            "Proceso de la fotosíntesis",
            "¿Cuántos huesos tiene el cuerpo humano?",
            "¿Cuál es la función principal de los pulmones?",
            "¿Qué es el ADN?",
            "¿Cuál es la función de las células sanguíneas rojas?",
            "¿Cómo se llama la fase en la que una larva se convierte en pupa?",
            "¿Qué es un ecosistema?",
            "¿Cuál es la función del sistema nervioso?"
        };

        String[] respuestasBiologia = {
            "División celular", 
            "Apéndice", 
            "Conversión de luz en energía química",
            "206",
            "Intercambio de gases",
            "Ácido desoxirribonucleico",
            "Transporte de oxígeno",
            "Pupa",
            "Comunidad de seres vivos",
            "Transmitir señales"
        };

        
        System.out.println("Categorías disponibles:");
        System.out.println("1. Arte");
        System.out.println("2. Geografía");
        System.out.println("3. Biología");

        
        System.out.print("Por favor, elija una categoría (1-3): ");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        
        if (opcion < 1 || opcion > 3) {
            System.out.println("Opción no válida. Por favor, seleccione una categoría válida.");
            return;
        }

        
        String[] preguntasSeleccionadas = null;
        String[] respuestasSeleccionadas = null;

        switch (opcion) {
            case 1:
                preguntasSeleccionadas = preguntasArte;
                respuestasSeleccionadas = respuestasArte;
                break;
            case 2:
                preguntasSeleccionadas = preguntasGeografia;
                respuestasSeleccionadas = respuestasGeografia;
                break;
            case 3:
                preguntasSeleccionadas = preguntasBiologia;
                respuestasSeleccionadas = respuestasBiologia;
                break;
        }

        
        System.out.println("Preguntas de la categoría seleccionada:");
        for (int i = 0; i < preguntasSeleccionadas.length; i++) {
            System.out.println(preguntasSeleccionadas[i]);
            System.out.print("Tu respuesta: ");
            Scanner respuestaScanner = new Scanner(System.in);
            String respuestaUsuario = respuestaScanner.nextLine();

            
            if (respuestaUsuario.equalsIgnoreCase(respuestasSeleccionadas[i])) {
                System.out.println("¡Correcto!\n");
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + respuestasSeleccionadas[i] + "\n");
            }
        }
}
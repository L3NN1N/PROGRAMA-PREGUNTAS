
package proyecto;

import java.util.Scanner;


public class PROYECTO {
    public static void main(String[] args) {
       
        String[] preguntasArte = {
            "¿Quién pintó la Mona Lisa?: \n(a) Rafael \n(b) Leonardo da Vinci  \n(c) Miguel Ángel  \n(d) Van Gogh",
            "¿En qué movimiento artístico se encuentra la obra 'La persistencia de la memoria' de Salvador Dalí?: \n(a)Renacimiento \n(b)Realismo \n(c)Surrealismo ",
            "¿Quién es el autor de la escultura 'El Pensador'?: \n(a)Miguel Angel \n(b)Auguste Rodin \n(c)Donatello",
            "¿Cuál es la técnica artística de crear imágenes utilizando pequeñas piezas de vidrio o piedra?: \n(a)Mosaico \n(b)Arquitectura orgánica \n(c)Laqueado",
            "¿Qué famoso pintor neerlandés cortó su oreja y entregó a una prostituta en 1888?: \n(a)Vincent van Gogh \n(b)Pablo Picasso \n(c)Paul Gauguin",
        };

        String[] respuestasArte = {
            "b",
            "c",
            "b",
            "a",
            "a",
        };

        String[] preguntasGeografia = {
            "Capital de Francia: \n(a)Isla de Francia \n(b)Bretaña \n(c)París",
            "¿Cuál es el desierto más grande del mundo?: \n(a)Desierto de Arabia \n(b)Desierto de Gobi \n(c)Desierto del Sahara",
            "¿En qué país se encuentra el río Amazonas?: \n(a)Peru \n(b)Ecuador \n(c)Colombia \n(d)Brasil",
            "¿Cuál es el país más pequeño del mundo?: \n(a)Cuidad del Vaticano \n(b)Mónaco \n(c)Nauru",
            "¿Cuál es el lago más profundo del planeta?: \n(a)Lago Victoria \n(b)Lago Baikal \n(c)Lago Michigan",
        };

        String[] respuestasGeografia = {
            "c",
            "c",
            "d",
            "a",
            "b",
        };

        String[] preguntasBiologia = {
            "¿Qué es la mitosis?: \n(a)División celular \n(b)Unión celular \n(c)Clonación celular",
            "¿Cuál es la función principal de los ribosomas en una célula?: \n(a)Regeneración de celulas \n(b)Síntesis de proteínas \n(c)Absorción de azucares ",
            "¿Qué órgano del cuerpo humano regula el metabolismo mediante la secreción de hormonas?: \n(a)Higado \n(b)Cerebelo \n(c)Tiroides",
            "¿Cuántos cromosomas tiene una célula humana normal?: \n(a)21 \n(b)32 \n(c)46",
            "¿Cuál es la principal función de las mitocondrias?: \n(a)Generar energia \n(b)Combatir microorganismos \n(c)Barrera Protectora",
        };

        String[] respuestasBiologia = {
            "a",
            "b",
            "c",
            "c",
            "a",
        };

        String[] preguntasMatematicas = {
            "¿Cuál es el resultado de 5 * 8?: \n(a)32 \n(b)46 \n(c)40 ",
            "¿Qué número es el cuadrado de 9?: \n(a)82 \n(b)84 \n(c)81",
            "¿Cuántos grados tiene un ángulo recto?: \n(a)93 \n(b)90 \n(c)95",
            "¿Cuál es el valor de π (pi) aproximado?: \n(a)3.11 \n(b)4.15 \n(c)3.14",
            "¿En qué tipo de triángulo todos los lados son de diferente longitud?: \n(a)Escaleno \n(b)Equilatero \n(c)Isósceles",
        };

        String[] respuestasMatematicas = {
            "c",
            "c",
            "b",
            "c",
            "a",
        };

        String[] preguntasCiencia = {
            "¿Cuál es la ley de Newton que establece que 'a toda acción le corresponde una reacción igual y en sentido contrario'?: \n(a)Primera ley \n(b)Tercera ley \n(c)Segunda ley",
            "¿Quién es conocido como el 'padre de la microbiología'?: \n(a)Louis Pasteur \n(b)Robert Koch \n(c)Joseph Lister",
            "¿Cuál es el elemento más abundante en la corteza terrestre?: \n(a)Oro \n(b)Hierro \n(c)Oxígeno",
            "¿Cuál es la velocidad de la luz en el vacío?: \n(a)299,792 km/s \n(b)9,8 km/s \n(c)320,8 km/s",
            "¿Cuál es el proceso mediante el cual las plantas convierten la luz en energía química?: \n(a)Sustitución \n(b)Adición \n(c)Fotosíntesis",
        };

        String[] respuestasCiencia = {
            "b",
            "a",
            "c",
            "a",
            "c",
        };
        while (true) {
            
            System.out.println("_____________________________________________________");
            System.out.println("Categorías disponibles:");
            System.out.println("1. Arte");
            System.out.println("2. Geografía");
            System.out.println("3. Biología");
            System.out.println("4. Matemáticas");
            System.out.println("5. Ciencia");
            System.out.println("6. Salir");

            System.out.print("Por favor, elija una categoría (1-6): ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Por favor, seleccione una categoría válida.");
                continue;
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
                case 4:
                    preguntasSeleccionadas = preguntasMatematicas;
                    respuestasSeleccionadas = respuestasMatematicas;
                    break;
                case 5:
                    preguntasSeleccionadas = preguntasCiencia;
                    respuestasSeleccionadas = respuestasCiencia;
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    return;
            }

            int intento = 3;
            int puntaje = 0;
            int errores = 0;
            System.out.println("Preguntas de la categoría seleccionada:");
            for (int i = 0; i < preguntasSeleccionadas.length; i++) {
                System.out.println(preguntasSeleccionadas[i]);
                System.out.print("Tu respuesta: ");
                Scanner respuestaScanner = new Scanner(System.in);
                String respuestaUsuario = respuestaScanner.nextLine();

                if (respuestaUsuario.equalsIgnoreCase(respuestasSeleccionadas[i])) {
                    System.out.println("¡Correcto!\n");
                    puntaje++;
                } else {
                    intento--;
                    System.out.println("Incorrecto. La respuesta correcta es: " + respuestasSeleccionadas[i] + "\n");
                    errores++;
                    System.out.println("INTENTOS RESTANTES "+ intento);
                }
                
                if (intento==0){
                    System.out.println("SU PUNTUACION ES:"+puntaje);
            System.out.println("ERRORES:"+errores); 
                    System.out.print("Haz alcanzado el limite de respuestas incorrectas. Hasta pronto");
                    return;
                }
            }
            
            
            System.out.println("¡Fin de la categoría!");
            System.out.println("Puntaje final: " + puntaje + " de " + preguntasSeleccionadas.length);

            if (puntaje == preguntasSeleccionadas.length) {
                System.out.println("¡Perfecto! Has respondido todas las preguntas correctamente.");
            } else if (puntaje >= preguntasSeleccionadas.length / 2) {
                System.out.println("Buen trabajo, pero aún puedes mejorar. ¡Sigue practicando!");
            } else {
                System.out.println("Necesitas mejorar. ¡Ánimo en la próxima!");
            }
            
        }
}
}
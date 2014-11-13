package examen;

public class Ejercicio1 {

 //variables de la clase
    String textoCript = "";
    private char[] bancoCaracteres;
    private char[] textoOriginal;
    private int n;

    //Método constructor
    public Ejercicio1() {
        n = 0;
        bancoCaracteres = new char[37];
    }

    //llena el array bancoCaracteres con las letras del abecedario y los numeros del  0 al 9
    public void llenarBanco() {
        for (int i = 0; i < 37; i++) {

            if (i < 14) {
                bancoCaracteres[i] = (char) (65 + i);
            }
            if (i == 14) {
                bancoCaracteres[i] = 'Ñ';
            }

            if (i > 14 && i < 27) {
                bancoCaracteres[i] = (char) (65 + (i - 1));
            }

            if (i == 27) {
                bancoCaracteres[i] = '0';
            }
            if (i == 28) {
                bancoCaracteres[i] = '1';
            }
            if (i == 29) {
                bancoCaracteres[i] = '2';
            }
            if (i == 30) {
                bancoCaracteres[i] = '3';
            }
            if (i == 31) {
                bancoCaracteres[i] = '4';
            }
            if (i == 32) {
                bancoCaracteres[i] = '5';
            }
            if (i == 33) {
                bancoCaracteres[i] = '6';
            }
            if (i == 34) {
                bancoCaracteres[i] = '7';
            }
            if (i == 35) {
                bancoCaracteres[i] = '8';
            }
            if (i == 36) {
                bancoCaracteres[i] = '9';
            }
        }
    }

    //método que recibe un texto y lo encripta
    public void encriptar(String texto) {
        textoOriginal = new char[texto.length()];
        //divide el texto original en caracteres para llenar el array
        for (int i = 0; i < textoOriginal.length; i++) {
            textoOriginal[i] = texto.toUpperCase().charAt(i);

            //encriptacion
            for (int j = 0; j < bancoCaracteres.length; j++) {
                //comparo si el caracter del text en la posicion i es igual a 
                //algun caracter del banco de bancoCaracteres y concatena la letra
                //al string q se le setea al texto encriptado
                if (textoOriginal[i] == bancoCaracteres[j]) {
                    if (textoOriginal[i] == 'Z') { // si el caracter del texto 
                        //es "z" los sustituye por la letra q este n posiciones a la derecha de "a"
                        textoCript += (char) (65 + (n - 1));
                    } else if (textoOriginal[i] == '9') {//si es nueve lo sustituye por 1

                        textoCript += '1';

                    } else {
                        textoCript += bancoCaracteres[j + n]; //caracter "n" pocisiones adelante de del caracter original
                    }

                }
            }

        }

    }

    public String getTextoCript() {
        return textoCript;
    }

    public void setTextoCript(String textoCript) {
        this.textoCript = textoCript;
    }

    public char[] getBancoCaracteres() {
        return bancoCaracteres;
    }

    public void setBancoCaracteres(char[] bancoCaracteres) {
        this.bancoCaracteres = bancoCaracteres;
    }

    public char[] getTextoOriginal() {
        return textoOriginal;
    }

    public void setTextoOriginal(char[] textoOriginal) {
        this.textoOriginal = textoOriginal;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

	}

    


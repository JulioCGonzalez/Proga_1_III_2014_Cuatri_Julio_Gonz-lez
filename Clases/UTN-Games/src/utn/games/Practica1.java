package utn.games;

public class Practica1 {
// Creo la variables,

    int estados[][] = new int[7][7];
    int Turno, victorias, derrotas;
    boolean jugando, unjugador;

    public void PintaCasilla(int x) {
        int Resultados[][] = new int[3][3];
        int result = 0;
        int i;
        int y;
        for (i = 0; i < 7; i++) {
            if (estados[x][i] != 0) {
                break;
            }
        }
        if (i == 0) {
            y = 7;
        } else {
            y = i - 1;
        }
        if ((y == 6 && estados[x][y] == 0) || ((y < 6) && (estados[x][y + 1] != 0) && (estados[x][y] == 0))) {
            if (Turno % 2 == 0) {
                estados[x][y] = -1;
                if (!unjugador) {
                } else {
                    estados[x][y] = 1;
                }
            }
            Turno++;
            if (Turno % 2 != 0) {
                if (unjugador) {
                    if (result >= 10) {
                        PintaCasilla((result / 10) - 1);
                    } else {
                        PintaCasilla(result);
                    }
                }
            }
        }
    }

    public boolean CompruebaCasilla(int posx, int posy, int cuantas[][]) {
        int jugador = estados[posx][posy];

        int x, y;
        for (x = (-1); x < 2; x++) {
            for (y = (-1); y < 2; y++) {
                if (x != 0 || y != 0) {
                    cuantas[x + 1][y + 1] = CompruebaLinea(posx, posy, x, y);
                    if (cuantas[x + 1][y + 1] >= 4) {
                        return true;
                    }
                } else {
                }
            }

        }
        return false;
    }

    public int CompruebaLinea(int posx, int posy, int x, int y) {
        int tempx, tempy;
        int val;
        int cuantas = 1;
        int jugador = estados[posx][posy];
        tempx = posx + x;
        tempy = posy + y;
        while ((tempy >= 0 && tempx >= 0) && (tempx < 7 && tempy < 7)) {
            if (estados[tempx][tempy] == jugador) {
                cuantas++;
                tempx += x;
                tempy += y;
            } else {
                tempx = (-1);
            }
        }
        tempx = posx - x;
        tempy = posy - y;
        while ((tempy >= 0 && tempx >= 0) && (tempx < 7 && tempy < 7)) {
            if (estados[tempx][tempy] == jugador) {
                cuantas++;
                tempx -= x;
                tempy -= y;
            } else {
                tempx = (-1);
            }
        }
        return cuantas;
    }

    public int Juega(int Nveces) {
        int temp;
        int ValoresEl[][] = new int[3][3];
        int ValoresYo[][] = new int[3][3];
        int PuntosCasilla[] = new int[7];
        int x, y, casilla;
        int z = 0;
        boolean mayor;
        for (casilla = 0; casilla < 7; casilla++) {
            z = 0;
            while (estados[casilla][z] == 0) {
                z++;
                if (z == 7) {
                    break;
                }
            }
            if (z == 0) {
                y = 6;
            } else {
                y = z - 1;
                PuntosCasilla[casilla] += y;
                estados[casilla][y] = 1;
                CompruebaCasilla(casilla, y, ValoresYo);
                estados[casilla][y] = -1;
                CompruebaCasilla(casilla, y, ValoresEl);
                estados[casilla][y] = 0;
                for (x = 0; x < 3; x++) {
                    for (z = 0; z < 3; z++) {
                        if (ValoresYo[x][z] >= 4) {
                            PuntosCasilla[casilla] += 1000;
                        }
                        if (ValoresEl[x][z] >= 4) {
                            PuntosCasilla[casilla] += 100;
                        }
                        if (ValoresYo[x][z] == 3 && Nveces < 3) {
                            estados[casilla][y] = 1;
                            System.out.println("Llamando a IA Recursiva en la vez: " + Nveces);
                            if (Juega(Nveces + 1) > 10) {
                                PuntosCasilla[casilla] += 90;
                            } else {
                                PuntosCasilla[casilla] += 5;
                            }
                            estados[casilla][y] = 0;
                        }
                        if (ValoresEl[x][z] == 3 && Nveces < 3) {
                            estados[casilla][y] = (-1);
                            System.out.println("Llamando a IA Recursiva en la vez: " + Nveces);
                            if (Juega(Nveces + 1) > 10) {
                                PuntosCasilla[casilla] += 100;
                            } else {
                                PuntosCasilla[casilla] += 10;
                            }
                            estados[casilla][y] = 0;
                        }
                        if (ValoresYo[x][z] == 2) {
                            PuntosCasilla[casilla] += 5;
                        }
                    }
                    if (y > 0) {
                        estados[casilla][y - 1] = (1);
                        CompruebaCasilla(casilla, y - 1, ValoresYo);
                        estados[casilla][y - 1] = (-1);
                        CompruebaCasilla(casilla, y - 1, ValoresEl);
                        estados[casilla][y - 1] = 0;
                    }
                    for (x = 0; x < 3; x++) {
                        for (z = 0; z < 3; z++) {
                            if (ValoresYo[x][z] >= 4) {
                                PuntosCasilla[casilla] -= 10;
                                if (ValoresEl[x][z] >= 4) {
                                    PuntosCasilla[casilla] -= 100;
                                }
                            }
                        }
                    }
                    z = 0;
                    for (y = 0; y < 7; y++) {
                        mayor = true;
                        for (x = 0; x < 7; x++) {
                            if (PuntosCasilla[y] < PuntosCasilla[x]) {
                                mayor = false;
                            }
                        }
                        if (mayor == true) {
                            if (z != 0) {
                                z = y * 10;
                            } else {
                                z = y;
                            }
                        }
                    }
                    System.out.println("Final de Juega");
                    
                }
            }
        }
        return (z);
    }
}

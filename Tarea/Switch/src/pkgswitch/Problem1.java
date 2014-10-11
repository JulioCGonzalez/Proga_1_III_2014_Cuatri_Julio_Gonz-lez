package pkgswitch;

public class Problem1 {

    public String Mes(int Mes) {
        String E1 = "Enero", F2 = "Febrero", M3 = "Marzo", A4 = "Abril",
                M5 = "Mayo", J6 = "Junio", J7 = "Julio", A8 = "Agosto",
                S9 = "Setiembre", O10 = "Octubre", N11 = "Noviembre", D12 = "Diciembre";
        if (Mes == 1) {
            return E1;
        }
        if (Mes == 2) {
            return F2;
        }
        if (Mes == 3) {
            return M3;
        }
        if (Mes == 4) {
            return A4;
        }
        if (Mes == 5) {
            return M5;
        }
        if (Mes == 6) {
            return J6;
        }
        if (Mes == 7) {
            return J7;
        }
        if (Mes == 8) {
            return A8;
        }
        if (Mes == 9) {
            return S9;
        }
        if (Mes == 10) {
            return O10;
        }
        if (Mes == 11) {
            return N11;
        } else {
            return D12;
        }
    }
}

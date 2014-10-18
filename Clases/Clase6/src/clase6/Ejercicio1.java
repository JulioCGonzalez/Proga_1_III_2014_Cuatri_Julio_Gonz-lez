package clase6;

public class Ejercicio1 {

    private String email;

    public Ejercicio1(String pEmail) {
        this.email = pEmail;
    }

    public String ValidarCorreo() {
        String mensaje = "El correo no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                mensaje = "El correo si contiene@";

            }

        }
        return mensaje;
    }

}
